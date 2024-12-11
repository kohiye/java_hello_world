package Lab4;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import java.io.BufferedReader;
import java.io.Reader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


import java.util.stream.Collectors;

public class Lab4 {
    public static void run(){
        Visitor[] visitors;
        Type visitorsType = new TypeToken<Visitor[]>(){}.getType();
        try {
            Reader reader = new BufferedReader(new FileReader("./src/main/resources/books.json"));
            Gson gson = new GsonBuilder().create();
            visitors = gson.fromJson(reader, visitorsType);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        // 1
        System.out.println("Number of visitors: " + Arrays.stream(visitors).count());
        System.out.println("Visitors: " + Arrays.stream(visitors).map(
                visitor -> visitor.getName() + " " + visitor.getSurname()).collect(Collectors.joining(", ")));

        // 2
        System.out.println("Number of books: " + Arrays.stream(visitors).mapToLong(visitor -> visitor.getFavoriteBooks().size()).sum());
        List<Book> bookList = new java.util.ArrayList<Book>(Arrays.stream(visitors).flatMap(visitor -> visitor.getFavoriteBooks().stream()).toList());
        System.out.println("Books: " +bookList.stream().map(book -> book.getName()).distinct().collect(Collectors.joining(", ")));

        // 3
        bookList.sort((b1, b2) -> Integer.compare(b1.getPublishingYear(), b2.getPublishingYear()));
        System.out.println("Sorted Books: " +bookList.stream().map(book -> book.getName()).distinct().collect(Collectors.joining(", ")));

        // 4
        System.out.println("Jane Austen: " + bookList.stream().anyMatch(book -> book.getAuthor().equals("Jane Austen")));

        // 5
        System.out.println("Max added: " + Arrays.stream(visitors).map(visitor -> visitor.getFavoriteBooks().size()).max(Integer::compare).orElse(0));

        // 6
        double average = (double) Arrays.stream(visitors).map(v -> v.getFavoriteBooks().size()).reduce(0, Integer::sum) /
                visitors.length;
        List<SMS> smsList = new ArrayList<>();
        Arrays.stream(visitors).filter(v -> v.isSubscribed()).forEach(v -> {
            int b = Integer.compare(v.getFavoriteBooks().size(), (int)Math.round(average));
            if (b > 0)
                smsList.add(new SMS("you are a bookworm", v.getPhone()));
            else if (b < 0)
                smsList.add(new SMS("read more", v.getPhone()));
            else
                smsList.add(new SMS("fine", v.getPhone()));
        });
        System.out.println("Messages: ");
        smsList.forEach(m -> System.out.println("[P:" + m.phone() + ";M:" + m.message() + "]"));
    }
}
