package org.example;

public class HourlyWageEmployee extends Employee {
    private double hourlyRate;

    public HourlyWageEmployee(String fullname, double hourlyRate) {
        super(fullname);
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculateMonthlySalary() {
        return hourlyRate * 20.8 * 8;
    }
}