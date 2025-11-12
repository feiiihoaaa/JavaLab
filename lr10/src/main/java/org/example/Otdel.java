package org.example;

class Otdel {
    private String name;
    private int employeeCount;

    public Otdel(String name, int employeeCount) {
        this.name = name;
        this.employeeCount = employeeCount;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getEmployeeCount() { return employeeCount; }
    public void setEmployeeCount(int count) { this.employeeCount = count; }
}