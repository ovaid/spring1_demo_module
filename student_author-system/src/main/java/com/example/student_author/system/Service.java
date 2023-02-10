package com.example.student_author.system;


import org.springframework.beans.factory.annotation.Autowired;
public class Service {
    @Autowired
    repository repository;
    public String createBook(Book book) {
        String response = repository.createBook(book);
        return response;
    }

    public String createAuthor(Author author) {
        String  response = repository.createAuthor(author);
        return  response;
    }

    public String getBookName() {
        String response = repository.getBookName();
        return response;
    }

    public String getAuthorName() {
        String response = repository.getAuthorName();
        return response;
    }

    public String updatePages(String book_name, int number_of_page) {
        String response = repository.updatePages(book_name,number_of_page);
        return response;
    }
}
