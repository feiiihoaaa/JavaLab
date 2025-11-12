package com.example.z2;

public class Book {
    public String title;
    public String author;
    public int year;

    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public void printInfo() {
        System.out.println(title + " от " + author + " (" + year + ")");
    }
}
