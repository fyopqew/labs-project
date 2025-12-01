package org.example.enterprise.model;

import org.example.enterprise.exception.OkladException;
import org.example.enterprise.exception.PremiyaException;

public class StaffEmployee extends Employee {
    private double bonus;

    public StaffEmployee(String fullName, String position, double salary) throws OkladException {
        super(fullName, position, salary);
    }

    @Override
    public double calculateSalary() {
        try {
            if (this.bonus < 0) {
                throw new PremiyaException("Отрицательное значение премии: " + this.bonus);
            }
            return getSalary() + this.bonus;
        } catch (PremiyaException e) {
            System.err.println("Ошибка в данных: " + e.getMessage());
            return getSalary();
        } catch (Exception e) {
            System.err.println("Произошла непредвиденная ошибка при расчете зарплаты: " + e.getMessage());
            return getSalary();
        }
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}