package com.yourname.digitallibrary;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;
    private List<LibraryUser> users;

    public Library() {
        books = new ArrayList<>();
        users = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void registerUser(LibraryUser user) {
        users.add(user);
    }

    public void displayBooks() {
        System.out.println("Books in the library:");
        for (Book book : books) {
            System.out.println(book);
        }
    }

    public void displayUsers() {
        System.out.println("Library users:");
        for (LibraryUser user : users) {
            System.out.println(user);
        }
    }
}