package org.example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TemperatureCalculator {

    public static void main(String[] args) {
        String fileName = "temperatures.txt";
        Path filePath = Paths.get(fileName);

        writeTemperaturesToFile(filePath);

        readAndCalculateAverage(filePath);
    }


    private static void writeTemperaturesToFile(Path path) {
        System.out.println("--- Запись данных о темпер-атуре ---");
        try (Scanner scanner = new Scanner(System.in)) {
            List<String> temperatures = new ArrayList<>();
            System.out.println("Введите 15 значений температуры:");

            for (int i = 0; i < 5; i++) {
                System.out.print("Температура " + (i + 1) + ": ");
                double temp = 0;
                boolean validInput = false;

                while (!validInput) {
                    try {
                        temp = Double.parseDouble(scanner.next().replace(',', '.'));
                        validInput = true;
                    } catch (NumberFormatException e) {
                        System.out.println("Ошибка: введено не число. Пожалуйста, повторите ввод:");
                        System.out.print("Температура " + (i + 1) + ": ");
                    }
                }
                temperatures.add(String.valueOf(temp));
            }

            try {
                Files.write(path, temperatures);
                System.out.println("\nЗначения температуры успешно записаны в файл '" + path.getFileName() + "'.\n");
            } catch (IOException e) {
                System.err.println("Ошибка при записи в файл: " + e.getMessage());
                e.printStackTrace();
            }

        }
    }

    private static void readAndCalculateAverage(Path path) {
        System.out.println("--- Чтение данных и расчет средней температуры ---");
        if (!Files.exists(path)) {
            System.err.println("Ошибка: Файл '" + path.getFileName() + "' не найден.");
            return;
        }

        try {
            List<String> lines = Files.readAllLines(path);
            double sum = 0;
            int count = 0;

            System.out.println("Считанные значения температур из файла:");
            for (String line : lines) {
                try {
                    double temp = Double.parseDouble(line);
                    System.out.println(temp);
                    sum += temp;
                    count++;
                } catch (NumberFormatException e) {
                    System.err.println("Предупреждение: Неверный формат числа в строке '" + line + "'. Строка пропущена.");
                }
            }

            if (count > 0) {
                double average = sum / count;
                System.out.printf("\nСредняя температура: %.2f\n", average);
            } else {
                System.out.println("В файле не найдено корректных значений для расчета.");
            }

        } catch (IOException e) {
            System.err.println("Ошибка при чтении файла: " + e.getMessage());
            e.printStackTrace();
        }
    }
}