package com.example.z2;

public class Comic extends Book {
    public String illustrator;

    public Comic(String title, String author, int year, String illustrator) {
        super(title, author, year);
        this.illustrator = illustrator;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Иллюстратор: " + illustrator);
    }
}
