package com.example.todoh2;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import lombok.RequiredArgsConstructor;


@RequiredArgsConstructor
@Controller
public class TodoController {
    private final TodoService service;
    // Read
    @GetMapping("/")
    public String showAllTodos(@ModelAttribute TodoModel todo, Model model) {
        model.addAttribute("todos", service.getTodos());
        return "index";
    }
    // Create
    @PostMapping("/add")
    public String addTodo(@ModelAttribute TodoModel todo) {
        service.create(todo);
        return "redirect:/";
    }
    // Update
    @PostMapping("/edit")
    public String editTodo(@ModelAttribute TodoModel todo) {
        service.update(todo);
        return "redirect:/";
    }
    // Delete
    @GetMapping("/delete/{id}")
    public String deleteTodo(@PathVariable Long id) {
        service.delete(id);
        return "redirect:/";
    }
}