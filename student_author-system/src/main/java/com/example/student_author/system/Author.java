package com.example.student_author.system;;


public class Author {
    private String Author_Name;
    private String Book_Name;
    private int Number_of_Pages;

    public Author() {
    }

    public Author(String author_Name, String book_Name, int number_of_Pages) {
        Author_Name = author_Name;
        Book_Name = book_Name;
        Number_of_Pages = number_of_Pages;
    }

    public String getAuthor_Name() {
        return Author_Name;
    }

    public void setAuthor_Name(String author_Name) {
        Author_Name = author_Name;
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