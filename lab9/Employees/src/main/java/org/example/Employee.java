package org.example;

public abstract class Employee {
    private static int nextId = 1;
    private int id;
    private String fullname;

    public Employee(String fullname) {
        this.id = nextId++;
        this.fullname = fullname;
    }

    public int getId() {
        return id;
    }

    public String getFullname() {
        return fullname;
    }

    public abstract double calculateMonthlySalary();
}