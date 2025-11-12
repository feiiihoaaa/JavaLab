package org.example;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileTasks {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void task1() {
        String filename = "info.txt";
        try {
            FileWriter writer = new FileWriter(filename);
            writer.write("Имя: Валерия\nВозраст: 20\nПитомцев: Три пушистых");
            writer.close();

            File file = new File(filename);
            System.out.println("Файл: " + file.getName());
            System.out.println("Путь: " + file.getAbsolutePath());
            System.out.println("Размер: " + file.length() + " байт");

            Scanner reader = new Scanner(file);
            System.out.println("Содержимое файла:");
            while (reader.hasNextLine()) {
                System.out.println(reader.nextLine());
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("Ошибка при работе с файлом: " + e.getMessage());
        }
    }
    public static void task2() {
        String filename = "temps.txt";
        Scanner input = new Scanner(System.in);

        try {
            FileWriter writer = new FileWriter(filename);
            System.out.println("Введите 15 температур (через Enter):");
            for (int i = 0; i < 15; i++) {
                double temp = input.nextDouble();
                writer.write(temp + "\n");
            }
            writer.close();

            File file = new File(filename);
            Scanner reader = new Scanner(file);
            double sum = 0;
            int count = 0;

            while (reader.hasNextLine()) {
                String line = reader.nextLine();
                try {
                    double t = Double.parseDouble(line);
                    sum += t;
                    count++;
                } catch (NumberFormatException e) {
                    System.out.println("Ошибка формата: " + line);
                }
            }
            reader.close();

            if (count > 0) {
                System.out.println("Средняя температура: " + (sum / count));
            } else {
                System.out.println("Нет данных для расчета.");
            }

        } catch (IOException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }

    public static void task3() {
        String filename = "text.txt";
        try {
            FileWriter writer = new FileWriter(filename);
            writer.write("Пример текста для подсчета количества слов.");
            writer.close();

            File file = new File(filename);
            Scanner reader = new Scanner(file);
            int wordCount = 0;

            while (reader.hasNextLine()) {
                String line = reader.nextLine();
                String[] words = line.trim().split("\\s+");
                wordCount += words.length;
            }
            reader.close();

            System.out.println("Количество слов в файле: " + wordCount);
        } catch (IOException e) {
            System.out.println("Ошибка при работе с файлом: " + e.getMessage());
        }
    }
}
