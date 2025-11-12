package com.example.z2;

public class Novel extends Book {
    public String genre;

    public Novel(String title, String author, int year, String genre) {
        super(title, author, year);
        this.genre = genre;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Жанр: " + genre);
    }
}
