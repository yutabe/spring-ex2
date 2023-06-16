package com.example.web.rest;

import com.example.exception.EmployeeNotFoundException;
import com.example.persistence.entity.Todo;
import com.example.service.TodoService;
import com.example.web.exception.response.ErrorResponse;
import com.example.web.request.TodoRequest;
import com.example.web.response.TodoResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/todos")
public class TodoRestController {

    private final TodoService todoService;

    // DIでEmployeeServiceのインスタンスを取得する
    public TodoRestController(TodoService todoService) {
        this.todoService = todoService;
    }

    @GetMapping
    public List<TodoResponse> findAll() {
        List<Todo> todoList = todoService.findAll();
        List<TodoResponse> todoResponseList = new ArrayList<>();
        for (Todo todo : todoList) {
            TodoResponse todoResponse = new TodoResponse(todo.getId(),
                    todo.getDescription(),
                    todo.getDeadline(),
                    todo.getDone(),
                    todo.getCreatedAt(),
                    todo.getUpdatedAt());
            todoResponseList.add(todoResponse);
        }
        // レスポンスクラスを戻り値とする
        return todoResponseList;
    }

    @GetMapping("/{id}")
    public TodoResponse findById(@PathVariable Integer id) {
        Todo todo = todoService.findById(id);
        TodoResponse todoResponse = new TodoResponse(todo.getId(),
                todo.getDescription(),
                todo.getDeadline(),
                todo.getDone(),
                todo.getCreatedAt(),
                todo.getUpdatedAt());
        return todoResponse;
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void update(@PathVariable Integer id, @RequestBody @Validated TodoRequest request) {
        Todo todo = new Todo();
        todo.setId(id);
        todo.setDescription(request.getDescription());
        todo.setDeadline(request.getDeadline());
        todo.setDone(request.getDone());
        todo.setCreatedAt(LocalDateTime.now());
        todo.setUpdatedAt(LocalDateTime.now());
        todoService.update(todo);
    }

    @PostMapping
    public ResponseEntity<Void> insert(@RequestBody @Validated TodoRequest request) {
        Todo todo = new Todo();
        todo.setDescription(request.getDescription());
        todo.setDeadline(request.getDeadline());
        todo.setDone(false);
        todo.setCreatedAt(LocalDateTime.now());
        todo.setUpdatedAt(LocalDateTime.now());
        todoService.insert(todo);

        // http://localhost:8080/employees
        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
        // http://localhost:8080/employees/新しい社員ID
                .pathSegment(todo.getId().toString())
                .build().encode().toUri();
        return ResponseEntity.created(location).build();
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Integer id) {
        todoService.delete(id);
    }

    @ExceptionHandler
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ErrorResponse handleEmployeeNotFound(EmployeeNotFoundException exception) {
        String message = exception.getMessage();
        ErrorResponse errorResponse = new ErrorResponse(message);
        return errorResponse;
    }
}
