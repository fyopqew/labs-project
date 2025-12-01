package org.example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Arrays;
import java.util.List;

public class FileHandler {

    public static void main(String[] args) {
        String fileName = "about_me.txt";
        Path filePath = Paths.get(fileName);

        try {
            System.out.println("Создание файла и запись данных...");
            List<String> content = Arrays.asList(
                    "Имя: Степан",
                    "Возраст: 19",
                    "Город: Минск",
                    "Профессия: Техник-программист"
            );
            Files.write(filePath, content);
            System.out.println("Файл '" + fileName + "' успешно создан и данные записаны.\n");

            System.out.println("--- Метаданные файла ---");
            BasicFileAttributes attributes = Files.readAttributes(filePath, BasicFileAttributes.class);

            System.out.println("Имя файла: " + filePath.getFileName());
            System.out.println("Размер файла: " + attributes.size() + " байт");
            System.out.println("Время создания: " + attributes.creationTime());
            System.out.println("Время последнего изменения: " + attributes.lastModifiedTime());
            System.out.println("Это обычный файл: " + attributes.isRegularFile());
            System.out.println("------------------------\n");


            System.out.println("--- Содержимое файла ---");
            List<String> lines = Files.readAllLines(filePath);
            for (String line : lines) {
                System.out.println(line);
            }
            System.out.println("------------------------");

        } catch (IOException e) {
            System.err.println("Произошла ошибка при работе с файлом: " + e.getMessage());
            e.printStackTrace();
        }
    }
}