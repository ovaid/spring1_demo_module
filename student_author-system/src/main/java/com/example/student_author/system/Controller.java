package com.example.student_author.system;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class Controller {


    @Autowired
    Service  ser;

    @PostMapping("/addBook")
    public String createBook(@RequestBody Book book)
    {
        String response = ser.createBook(book);
        return response;
    }

    @PostMapping("/addAuthor")
    public String createAuthor(@RequestBody Author author)
    {
        String response = ser.createAuthor(author);
        return response;
    }

    @GetMapping("/Maximum_PagesBook")
    public String getBookName()
    {
        String response = ser.getBookName();
        return response;
    }
    @GetMapping("/Maximum_PagesAuthor")
    public String getAuthorName()
    {
        String response = ser.getAuthorName();
        return response;
    }
    @PutMapping("/UpdatePages")
    public String updatePages(@RequestParam("Name") String Book_Name ,@RequestParam("No_of") int Number_of_page)
    {
        String response = ser.updatePages(Book_Name,Number_of_page);
        return response;
    }
}