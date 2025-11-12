package com.example.z2;

public class Textbook extends Book {
    public String subject;

    public Textbook(String title, String author, int year, String subject) {
        super(title, author, year);
        this.subject = subject;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Предмет: " + subject);
    }
}
