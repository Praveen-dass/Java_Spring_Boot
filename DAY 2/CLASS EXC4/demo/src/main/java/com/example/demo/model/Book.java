package com.example.demo.model;

import java.util.Date;

public class Book {
    private String title;
    private String author;
    private Date PublicDate;
    public Book(String title, String author, Date publicDate) {
        this.title = title;
        this.author = author;
        PublicDate = publicDate;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public Date getPublicDate() {
        return PublicDate;
    }
    public void setPublicDate(Date publicDate) {
        PublicDate = publicDate;
    }
    
    
}
