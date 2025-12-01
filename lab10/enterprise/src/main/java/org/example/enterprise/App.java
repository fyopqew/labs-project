package org.example.enterprise;

import org.example.enterprise.exception.OkladException;
import org.example.enterprise.model.ContractEmployee;
import org.example.enterprise.model.Employee;
import org.example.enterprise.model.Firm;
import org.example.enterprise.model.StaffEmployee;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {

        Firm myFirm = new Firm();
        myFirm.setName("…");

        List<Employee> employeeList = new ArrayList<>();

        System.out.println("--- Начинаем прием сотрудников в фирму '" + myFirm.getName() + "' ---");

        try {
            StaffEmployee staffEmployee = new StaffEmployee("", "Менеджер", 50000);
            System.out.println("УСПЕХ: Сотрудник 'Иванов Иван Иванович' успешно принят.");
            employeeList.add(staffEmployee);

            System.out.println("-> Проверяем расчет зарплаты для Иванова с отрицательной премией...");
            staffEmployee.setBonus(-1000);
            staffEmployee.calculateSalary();

        } catch (OkladException | IllegalArgumentException e) {
            System.err.println("ОШИБКА НАЙМА: " + e.getMessage());
        }

        System.out.println("\n------------------------------------------------------");

        try {
            ContractEmployee contractEmployee = new ContractEmployee("Сидоров Олег Петрович", "Дизайнер", 70000);
            System.out.println("УСПЕХ: Сотрудник 'Сидоров Олег Петрович' успешно принят.");
            employeeList.add(contractEmployee);
        } catch (OkladException | IllegalArgumentException e) {
            System.err.println("ОШИБКА НАЙМА: " + e.getMessage());
        }

        System.out.println("\n------------------------------------------------------");


        System.out.println("\nПопытка принять сотрудника с отрицательным окладом...");
        try {
            Employee invalidEmployee = new Employee("Петров Петр Петрович", "Стажер", -45000);
            employeeList.add(invalidEmployee);
        } catch (OkladException e) {
            System.err.println("Перехвачена ошибка из конструктора в main: Сотрудник не принят.");
        } catch (IllegalArgumentException e) {
            System.err.println("ОШИБКА НАЙМА: " + e.getMessage());
        }

        System.out.println("\nПопытка принять сотрудника с пустым ФИО...");
        try {
            Employee emptyNameEmployee = new Employee("  ", "Инженер", 60000);
            employeeList.add(emptyNameEmployee);
        } catch (OkladException e) {
            System.err.println("Перехвачена ошибка из конструктора в main: Сотрудник не принят.");
        } catch (IllegalArgumentException e) {
            System.err.println("ОШИБКА НАЙМА: " + e.getMessage());
        }

        System.out.println("\nПопытка принять сотрудника с пустой должностью...");
        try {
            Employee nullPositionEmployee = new Employee("Сергеев Сергей", null, 80000);
            employeeList.add(nullPositionEmployee);
        } catch (OkladException e) {
            System.err.println("Перехвачена ошибка из конструктора в main: Сотрудник не принят.");
        } catch (IllegalArgumentException e) {
            System.err.println("ОШИБКА НАЙМА: " + e.getMessage());
        }

        System.out.println("\n======================================================");
        System.out.println("      СПИСОК СОТРУДНИКОВ ФИРМЫ: " + myFirm.getName());
        System.out.println("======================================================");

        if (employeeList.isEmpty()) {
            System.out.println("В фирме нет ни одного сотрудника.");
        } else {
            for (int i = 0; i < employeeList.size(); i++) {
                Employee emp = employeeList.get(i);
                System.out.printf("%d. ФИО: %s, Должность: %s, Оклад: %.2f руб.%n",
                        i + 1, emp.getFullName(), emp.getPosition(), emp.getSalary());
            }
        }
        System.out.println("======================================================");
    }
}