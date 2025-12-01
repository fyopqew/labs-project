package org.example;

public class App {
    public static void main(String[] args) {
        String name = "Степан";
        System.out.println("Hello, " + name);

        Tester tester1 = new Tester("Иван", "Иванов", 5, "B2", 3000.0);
        Tester tester2 = new Tester("Петр", "Петров", 2, "A2");
        Tester tester3 = new Tester("Сидор", "Сидоров");

        tester1.printInfo(true);
        tester2.printInfo();
        tester3.printInfo(true);

        Tester.staticMethod();
    }
}