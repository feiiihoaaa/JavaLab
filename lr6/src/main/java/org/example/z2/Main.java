package org.example.z2;

public class Main {
    public static void main(String[] args) {
        Puppy puppy = new Puppy("Лаки");


        System.out.println("Имя щенка: " + puppy.getName());


        puppy.makeSound();
        puppy.jump();
        puppy.run();
        puppy.bite();
    }
}