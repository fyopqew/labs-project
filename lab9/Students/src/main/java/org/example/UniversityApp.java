package org.example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class UniversityApp {

    public static void processStudents(List<Student> students) {
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.getAverageGrade() < 3) {
                System.out.println("Отчислен: " + student.getName() + " (средний балл: " + String.format("%.2f", student.getAverageGrade()) + ")");
                iterator.remove();
            } else {
                System.out.println("Переведен на следующий курс: " + student.getName());
                student.promoteToNextCourse();
            }
        }
    }

    public static void printStudents(List<Student> students, int course) {
        System.out.println("\n--- Студенты на " + course + " курсе ---");
        boolean found = false;
        for (Student student : students) {
            if (student.getCourse() == course) {
                System.out.println(student.getName());
                found = true;
            }
        }
        if (!found) {
            System.out.println("На данном курсе нет студентов.");
        }
    }

    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();

        studentList.add(new Student("Иван Петров", "А-11", 1,
                Map.of("Математика", 5, "Физика", 4, "История", 5)));

        studentList.add(new Student("Анна Сидорова", "Б-22", 2,
                Map.of("Программирование", 2, "Базы данных", 3, "Философия", 2)));

        studentList.add(new Student("Сергей Иванов", "В-33", 3,
                Map.of("Алгоритмы", 5, "Статистика", 5, "Экономика", 4)));

        studentList.add(new Student("Елена Васильева", "Б-22", 2,
                Map.of("Программирование", 4, "Базы данных", 3, "Философия", 4)));


        System.out.println("--- Начальный список студентов ---");
        studentList.forEach(System.out::println);
        System.out.println("----------------------------------\n");

        processStudents(studentList);

        System.out.println("\n--- Итоговый список студентов ---");
        studentList.forEach(System.out::println);
        System.out.println("---------------------------------");

        printStudents(studentList, 1);
        printStudents(studentList, 2);
        printStudents(studentList, 3);
        printStudents(studentList, 4);
    }
}
