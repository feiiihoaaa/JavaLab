package org.example.z2;

public class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
    }

    public void run() {
        System.out.println(getName() + " бежит за мячиком!");
    }

    public void bite() {
        System.out.println(getName() + " кусается (игриво)!");
    }
}