package org.example;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class EmployeeManagementSystem {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new FixedSalaryEmployee("Иванов Иван", 60000));
        employeeList.add(new HourlyWageEmployee("Петров Петр", 350));
        employeeList.add(new FixedSalaryEmployee("Сидорова Анна", 65000));
        employeeList.add(new HourlyWageEmployee("Васильев Алексей", 400));
        employeeList.add(new FixedSalaryEmployee("Смирнов Дмитрий", 65000));
        employeeList.add(new HourlyWageEmployee("Кузнецова Ольга", 250));
        employeeList.add(new FixedSalaryEmployee("Попова Мария", 70000));
        employeeList.add(new FixedSalaryEmployee("Лебедев Артем", 65000));

        employeeList.sort(new Comparator<Employee>() {
            @Override
            public int compare(Employee e1, Employee e2) {
                int salaryComparison = Double.compare(e2.calculateMonthlySalary(), e1.calculateMonthlySalary());

                if (salaryComparison == 0) {
                    return e2.getFullname().compareTo(e1.getFullname());
                }
                return salaryComparison;
            }
        });

        System.out.println("--- а) Полный отсортированный список сотрудников ---");
        System.out.printf("%-5s %-20s %-15s%n", "ID", "Имя", "Средняя з/п");
        System.out.println("---------------------------------------------");
        for (Employee emp : employeeList) {
            System.out.printf("%-5d %-20s %-15.2f%n",
                    emp.getId(),
                    emp.getFullname(),
                    emp.calculateMonthlySalary());
        }

        System.out.println("\n--- б) Первые 5 имен работников ---");
        employeeList.stream()
                .limit(5)
                .forEach(employee -> System.out.println(employee.getFullname()));

        System.out.println("\n--- в) Последние 3 ID работников ---");
        int listSize = employeeList.size();
        if (listSize > 0) {
            employeeList.stream()
                    .skip(Math.max(0, listSize - 3))
                    .forEach(employee -> System.out.println(employee.getId()));
        }
    }
}