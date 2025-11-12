package com.example;

import com.example.domain.Employee;
import com.example.z2.Book;
import com.example.z2.Textbook;
import com.example.z2.Novel;
import com.example.z2.Comic;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.setEmpId(101);
        emp.setName("Валерия");
        emp.setSalary(120_345.27);
        emp.setSsn("012-34-5678");

        System.out.println("ID сотрудника: " + emp.getEmpId());
        System.out.println("Имя сотрудника: " + emp.getName());
        System.out.println("Номер страховки " + emp.getSsn());
        System.out.println("Зарплата сотрудника: " + emp.getSalary());

        Book b1 = new Textbook("Алгебра", "Иванов", 2020, "Математика");
        Book b2 = new Novel("Война и мир", "Толстой", 1869, "Исторический роман");
        Book b3 = new Comic("Супермен", "Джерри Сигел", 1938, "Джо Шустер");

        b1.printInfo();
        b2.printInfo();
        b3.printInfo();
    }
}
