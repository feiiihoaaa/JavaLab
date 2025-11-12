package org.example.z2;

public class Puppy extends Dog {
    public Puppy(String name) {
        super(name);
    }

    public void jump() {
        System.out.println(getName() + " прыгает от радости!");
    }

    public void bark() {
        System.out.println(getName() + " тявкает: Тяф-тяф!");
    }

    @Override
    public void makeSound() {
        bark();
    }

    @Override
    public void bite() {
        System.out.println(getName() + " кусает тапок!");
    }
}
