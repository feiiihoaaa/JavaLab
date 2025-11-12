package org.example;

public class Chinchilla {
    private String name;
    private int age;
    protected String color;
    public boolean isFluffy;

    public Chinchilla(String name, int age, String color, boolean isFluffy) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.isFluffy = isFluffy;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        if (name != null && !name.trim().isEmpty()) {
            this.name = name;
        }
    }


    private void takeDustBath() {
        System.out.println(name + " принимает песочную ванну...");
    }


    public void bath() {
        takeDustBath();
    }


    protected void jump() {
        System.out.println(name + " прыгает как пушистый мячик!");
    }


    public void eat() {
        System.out.println(name + " грызёт сено.");
    }

    @Override
    public String toString() {
        return "Шиншилла Имя=" + name + ", возраст=" + age +
                ", цвет=" + color + ", пушистая?=" + isFluffy;
    }
}