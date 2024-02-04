package com.example.todoh2;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class TodoService {
    private final TodoRepository repository;

    // Read
    public List<TodoModel> getTodos() {
        return repository.findAll();
    }
    // Create
    public TodoModel create(@NonNull TodoModel todo) {
        return repository.save(todo);
    }
    // Update
    public TodoModel update(@NonNull TodoModel todo) {
        return repository.save(todo);
    }
    // Delete
    public void delete(@NonNull Long id) {
        repository.deleteById(id);
    }
}
