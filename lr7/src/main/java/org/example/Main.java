package org.example;

public class Main {
    public static void main(String[] args) {
        GraphicObject line = new Line(0, 0, 100, 100);
        GraphicObject circle = new Circle(50, 50, 25);

        line.draw();
        circle.draw();
    }
}
