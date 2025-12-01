package org.example;

public class Tester {
    public String name;
    public String surname;
    public int expirienceInYears;
    public String englishLevel;
    public double salary;

    public Tester(String name, String surname, int expirienceInYears, String englishLevel, double salary) {
        this.name = name;
        this.surname = surname;
        this.expirienceInYears = expirienceInYears;
        this.englishLevel = englishLevel;
        this.salary = salary;
    }

    public Tester(String name, String surname, int expirienceInYears, String englishLevel) {
        this("По умолчанию", surname, expirienceInYears, englishLevel, 500.0);
    }

    public Tester(String name, String surname) {
        this(name, surname, 0, "A1");
    }

    public void printInfo() {
        System.out.println("Имя: " + name + ", Фамилия: " + surname);
    }

    public void printInfo(boolean showDetails) {
        if (showDetails) {
            System.out.println("Имя: " + name + ", Фамилия: " + surname + ", Опыт: " + expirienceInYears + " лет, Английский: " + englishLevel + ", Зарплата: " + salary);
        } else {
            printInfo();
        }
    }

    public void setExpirienceInYears(int years) {
        this.expirienceInYears = years;
    }

    public static void staticMethod() {
        System.out.println("Это статический метод.");
    }
}