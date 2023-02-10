package com.example.student_author.system;

import java.util.*;
import org.springframework.stereotype.Repository;
@Repository
public class repository {

    // database for book which  is Mapped according to its writer
    Map<String, List<Book>>  DBAuthor_Book;
    HashSet<Book> DBBook;
    HashSet<Author> DBAuthor;

    repository()
    {
        DBAuthor_Book = new HashMap<>();
        DBBook = new HashSet<>();
        DBAuthor = new HashSet<>();
    }
    public String updatePages(String book_name, int number_of_page) {
        for(Book book :DBBook)
        {
            if(book.getBook_Name().equals(book_name))
            {
                book.setNumber_of_Pages(number_of_page);
            }
        }
        return "Updated";
    }

    public String getAuthorName() {
        int max_page =0;
        String Author_name ="";
        for(Author author: DBAuthor)
        {
            if(max_page<author.getNumber_of_Pages())
            {
                max_page = author.getNumber_of_Pages();
                Author_name = author.getAuthor_Name();
            }
        }
        return Author_name;
    }

    public String getBookName() {
        int max_page = 0;
        String Book_name ="";
        for(Book book : DBBook)
        {
            if(max_page<book.getNumber_of_Pages())
            {
                max_page = book.getNumber_of_Pages();
                Book_name = book.getBook_Name();
            }
        }
        return Book_name;
    }

    public String createAuthor(Author author) {
        if(DBAuthor.contains(author))
        {
            return "Author is already Present";
        }
        DBAuthor.add(author);
//         DBAuthor_Book.put(author.getAuthor_Name(),new ArrayList<>());
        List<Book> list = new ArrayList<>();
        for(Book book :DBBook)
        {
            if(author.getAuthor_Name().equals(book.getBook_Name()))
            {
                list.add(book);
            }
        }
        DBAuthor_Book.put(author.getAuthor_Name(),list);
        return "Author Added Successfully";
    }

    public String createBook(Book book) {
        if(DBBook.contains(book))
        {
            return "Book is already Present";
        }
        DBBook.add(book);
        return "Book Added Successfully";
    }
}