package org.example.enterprise.model;

import org.example.enterprise.exception.OkladException;

// Класс Сотрудник
public class Employee {
    private String fullName;
    private String position;
    private double salary;

    public Employee(String fullName, String position, double salary) throws OkladException {
        if (fullName == null || fullName.trim().isEmpty()) {
            throw new IllegalArgumentException("ФИО сотрудника не может быть пустым.");
        }
        if (position == null || position.trim().isEmpty()) {
            throw new IllegalArgumentException("Должность сотрудника не может быть пустой.");
        }

        try {
            if (salary < 0) {
                throw new OkladException(String.valueOf(salary));
            }
            this.salary = salary;
        } catch (OkladException e) {
            System.err.println("Невозможно создать сотрудника – указан отрицательный оклад: " + e.getMessage());
            throw e;
        }

        this.fullName = fullName;
        this.position = position;
    }

    public double calculateSalary() {
        return this.salary;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        if (fullName == null || fullName.trim().isEmpty()) {
            throw new IllegalArgumentException("ФИО сотрудника не может быть пустым.");
        }
        this.fullName = fullName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        if (position == null || position.trim().isEmpty()) {
            throw new IllegalArgumentException("Должность сотрудника не может быть пустой.");
        }
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary < 0) {
            throw new IllegalArgumentException("Оклад не может быть отрицательным.");
        }
        this.salary = salary;
    }
}