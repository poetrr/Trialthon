package com.Trial.competition.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.Trial.competition.Model.Books;
import com.Trial.competition.Service.BooksService;


public class BooksController {

    @Autowired
    private BooksService booksService;

    // Endpoint to create a new task
    @PostMapping("/addbooks")
    public ResponseEntity<Books> Add(@RequestBody Books books) {
        Books createdTask = booksService.AddBooks(books);
        return ResponseEntity.ok(createdTask);
    }

    // Optionally, you can also have a GET method to fetch all tasks or by ID if needed.
}