package com.example.student_author.system;

public class Book {
    private String Book_Name;
    private int Number_of_Pages;

    public Book() {
    }

    public Book(String book_Name, int number_of_Pages) {
        Book_Name = book_Name;
        Number_of_Pages = number_of_Pages;
    }

    public String getBook_Name() {
        return Book_Name;
    }

    public void setBook_Name(String book_Name) {
        Book_Name = book_Name;
    }

    public int getNumber_of_Pages() {
        return Number_of_Pages;
    }

    public void setNumber_of_Pages(int number_of_Pages) {
        Number_of_Pages = number_of_Pages;
    }
}