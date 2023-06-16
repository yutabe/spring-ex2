package com.example.service.impl;

import com.example.exception.EmployeeNotFoundException;
import com.example.persistence.entity.Todo;
import com.example.persistence.mapper.TodoMapper;
import com.example.service.TodoService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class TodoServiceImpl implements TodoService {

    private final TodoMapper todoMapper;

    // EmployeeMapperをDIする（@Autowiredは省略）
    public TodoServiceImpl(TodoMapper todoMapper) {
        this.todoMapper = todoMapper;
    }

    @Override
    @Transactional(readOnly = true)
    public List<Todo> findAll() {
        List<Todo> todoList = todoMapper.findAll();
        return todoList;
    }

    @Override
    @Transactional(readOnly = true)
    public Todo findById(Integer id) {
        Todo todo = todoMapper.findById(id);
        if (todo == null) {
            // メソッドの戻り値がnullの場合は指定されたIDのデータが存在しない
            throw new EmployeeNotFoundException("ID:" + id + " のデータは存在しません");
        }
        return todo;
    }

    @Override
    @Transactional
    public void insert(Todo todo) {
        todoMapper.insert(todo);
    }

    @Override
    @Transactional
    public void update(Todo todo) {
        int count = todoMapper.update(todo);
        if (count == 0) {
            // 更新された行数が0の場合は指定されたIDのデータが存在しない
            throw new EmployeeNotFoundException("ID:" + todo.getId() + " のデータは存在しません");
        }
    }

    @Override
    @Transactional
    public void delete(Integer id) {
        int count = todoMapper.delete(id);
        if (count == 0) {
            // 削除された行数が0の場合は指定されたIDのデータが存在しない
            throw new EmployeeNotFoundException("ID:" + id + " のデータは存在しません");
        }
    }
}
