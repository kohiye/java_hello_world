package org.example;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Visitors {
    Visitor[] visitors;

    public Visitors(){
        try {
            JsonReader reader = new JsonReader(new FileReader("books.json"));
            visitors = new Gson().fromJson(reader, Visitor[].class);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public void listNames(){
        System.out.println(Arrays.stream(visitors).count());
        Arrays.stream(visitors).forEach(visitor -> System.out.println(visitor.name));
    }
    //public void listBooks(){
     //   List<Book> books = Arrays.stream(visitors).forEach(visitor -> visitor.books.stream().toList());
    //}
}

class Visitor{
    String name;
    String surname;
    String phone;
    boolean is_subscribed;
    List<Book> books;

    public Visitor(String a_name, String a_surname, String a_phone, boolean a_sub, List<Book> a_books){
        name = a_name;
        surname = a_surname;
        phone = a_phone;
        is_subscribed = a_sub;
        books = a_books;
    }
}

class Book{
    String name;
    String author;
    int year;
    String isbn;
    String publisher;

    public Book(String a_name, String a_author, int a_year, String a_isbn, String a_publisher){
        name = a_name;
        author = a_author;
        year = a_year;
        isbn = a_isbn;
        publisher = a_publisher;
    }
}