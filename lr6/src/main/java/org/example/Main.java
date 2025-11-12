package org.example;

public class Main {
    public static void main(String[] args) {

        Chinchilla chilla = new Chinchilla("Ромка", 2, "серый", true);

        System.out.println(chilla);

        chilla.eat();
        chilla.jump();
        chilla.bath();


        System.out.println("Имя: " + chilla.getName());
        chilla.setName("Пушистик");
        System.out.println("Новое имя: " + chilla.getName());


        System.out.println("Пушистая? " + chilla.isFluffy);
    }
}