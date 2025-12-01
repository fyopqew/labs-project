package org.example;

public class FixedSalaryEmployee extends Employee {
    private double fixedSalary;

    public FixedSalaryEmployee(String fullname, double fixedSalary) {
        super(fullname);
        this.fixedSalary = fixedSalary;
    }

    @Override
    public double calculateMonthlySalary() {
        return fixedSalary;
        }
    }