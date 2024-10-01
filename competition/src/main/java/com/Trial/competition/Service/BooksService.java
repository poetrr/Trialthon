package com.Trial.competition.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Trial.competition.Model.Books;
import com.Trial.competition.Repositories.BooksRepository;


@Service
public class BooksService {

    @Autowired
    private BooksRepository booksRepository;
    
    public Books AddBooks(Books books) {
    	return booksRepository.save(books);
    }
    // Method to create a new task
    

    // Optionally, you can add methods for fetching, updating, or deleting tasks here
}
