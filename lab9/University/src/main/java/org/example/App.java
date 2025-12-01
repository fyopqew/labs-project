package org.example;

import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) {
        Map<String, Student> studentMap = new HashMap<>();

        Student student1 = new Student("Иван Иванов", 101);
        Undergraduate student2 = new Undergraduate("Петр Петров", 102, "Информатика");
        Graduate student3 = new Graduate("Сергей Сидоров", 103, "Машинное обучение");
        Undergraduate student4 = new Undergraduate("Анна Андреева", 104, "Биология");

        studentMap.put(student1.getName(), student1);
        studentMap.put(student2.getName(), student2);
        studentMap.put(student3.getName(), student3);
        studentMap.put(student4.getName(), student4);

        System.out.println("ID и направление обучения студентов:");

        for (String name : studentMap.keySet()) {
            Student student = studentMap.get(name);
            String educationDetails;

            if (student instanceof Graduate) {
                Graduate graduateStudent = (Graduate) student;
                educationDetails = graduateStudent.getThesisTopic();
            }
            else if (student instanceof Undergraduate) {
                Undergraduate undergraduateStudent = (Undergraduate) student;
                educationDetails = undergraduateStudent.getMajor();
            }
            else {
                educationDetails = "Общая программа";
            }

            System.out.println("ID: " + student.getId() + ", Направление: " + educationDetails);
        }
    }
}