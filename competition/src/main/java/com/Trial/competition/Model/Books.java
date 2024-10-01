package com.Trial.competition.Model;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity // Mark as an entity
@Table(name = "books") // Specify the table name
public class Books {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int ID;

    private String Title;
    private String Author;
    private String Genre;
    
    @JsonFormat(pattern = "dd/MM/yyyy")
    private String Publication_Date;
    
    private float Price;

    // Getters and setters
    public int getID() {
        return ID;
    }

    public void setID(int iD) {
        ID = iD;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public String getGenre() {
        return Genre;
    }

    public void setGenre(String genre) {
        Genre = genre;
    }

    public String getPublication_Date() {
        return Publication_Date;
    }

    public void setPublication_Date(String publication_Date) {
        Publication_Date = publication_Date;
    }

    public float getPrice() {
        return Price;
    }

    public void setPrice(float price) {
        Price = price;
    }
}