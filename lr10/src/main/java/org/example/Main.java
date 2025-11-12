package org.example;

public class Main {
    public static void main(String[] args) {

        try {
            ShtatnySotrudnik s1 = new ShtatnySotrudnik("Каранкевич", "Менеджер", 50000, -5000);
            s1.rasschitatZarplatu();
        } catch (Exception e) {
            System.out.println("Ошибка при создании s1: " + e.getMessage());
        }


        try {
            ShtatnySotrudnik s2 = new ShtatnySotrudnik("Капуста", "Бухгалтер", -45000, 3000);
            s2.rasschitatZarplatu();
        } catch (Exception e) {
            System.out.println("Ошибка при создании s2: " + e.getMessage());
        }


        try {
            KontraktnySotrudnik s3 = new KontraktnySotrudnik("", "Разработчик", 60000);
            s3.rasschitatZarplatu();
        } catch (Exception e) {
            System.out.println("Ошибка при создании s3: " + e.getMessage());
        }

        try {
            KontraktnySotrudnik s4 = new KontraktnySotrudnik("Андреев", "", 52000);
            s4.rasschitatZarplatu();
        } catch (Exception e) {
            System.out.println("Ошибка при создании s4: " + e.getMessage());
        }
    }
}

