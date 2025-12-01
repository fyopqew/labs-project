package org.example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class NumberSorter {

    public static void main(String[] args) {
        String sourceFileName = "random_numbers.txt";
        Path sourcePath = Paths.get(sourceFileName);

        createFileWithRandomNumbers(sourcePath, 50, 500);

        sortNumbersByRange(sourcePath);
    }


    private static void createFileWithRandomNumbers(Path path, int count, int maxBound) {
        System.out.println("--- Создание файла со случайными числами ---");
        Random random = new Random();
        List<String> numbers = new ArrayList<>();

        for (int i = 0; i < count; i++) {
            numbers.add(String.valueOf(random.nextInt(maxBound)));
        }

        try {
            Files.write(path, numbers);
            System.out.println("Файл '" + path.getFileName() + "' с " + count + " числами успешно создан.\n");
        } catch (IOException e) {
            System.err.println("Ошибка при записи в файл '" + path.getFileName() + "': " + e.getMessage());
            e.printStackTrace();
        }
    }


    private static void sortNumbersByRange(Path sourcePath) {
        System.out.println("--- Сортировка чисел по диапазонам ---");
        if (!Files.exists(sourcePath)) {
            System.err.println("Исходный файл '" + sourcePath.getFileName() + "' не найден!");
            return;
        }

        List<String> range0to100 = new ArrayList<>();
        List<String> range101to300 = new ArrayList<>();
        List<String> range301to500 = new ArrayList<>();

        try {
            List<String> allLines = Files.readAllLines(sourcePath);

            for (String line : allLines) {
                try {
                    int number = Integer.parseInt(line.trim());

                    if (number >= 0 && number <= 100) {
                        range0to100.add(line);
                    } else if (number >= 101 && number <= 300) {
                        range101to300.add(line);
                    } else {
                        range301to500.add(line);
                    }
                } catch (NumberFormatException e) {
                    System.err.println("Предупреждение: неверный формат числа в строке '" + line + "'. Строка пропущена.");
                }
            }

            writeListToFile(Paths.get("range_0-100.txt"), range0to100);
            writeListToFile(Paths.get("range_101-300.txt"), range101to300);
            writeListToFile(Paths.get("range_301-500.txt"), range301to500);

            System.out.println("\nСортировка завершена.");

        } catch (IOException e) {
            System.err.println("Ошибка при чтении файла '" + sourcePath.getFileName() + "': " + e.getMessage());
            e.printStackTrace();
        }
    }

    private static void writeListToFile(Path path, List<String> data) {
        try {
            Files.write(path, data);
            System.out.println("Создан файл '" + path.getFileName() + "' с " + data.size() + " числами.");
        } catch (IOException e) {
            System.err.println("Не удалось записать данные в файл '" + path.getFileName() + "': " + e.getMessage());
        }
    }
}