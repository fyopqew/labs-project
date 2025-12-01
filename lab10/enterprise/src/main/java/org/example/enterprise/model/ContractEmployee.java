package org.example.enterprise.model;

import org.example.enterprise.exception.OkladException;

public class ContractEmployee extends Employee {

    public ContractEmployee(String fullName, String position, double salary) throws OkladException {
        super(fullName, position, salary);
    }

    @Override
    public double calculateSalary() {
        try {
            return getSalary();
        } catch (Exception e) {
            System.err.println("Произошла ошибка при расчете зарплаты сотрудника по контракту: " + e.getMessage());
            return 0;
        }
    }
}