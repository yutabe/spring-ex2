package com.example.service;

import com.example.persistence.entity.Todo;

import java.util.List;

public interface TodoService {

    List<Todo> findAll();

    Todo findById(Integer id);

    void insert(Todo todo);

    void update(Todo todo);

    void delete(Integer id);
}
