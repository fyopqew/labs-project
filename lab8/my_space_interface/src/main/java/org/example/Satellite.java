package org.example;

public class Satellite implements SpaceObject {
    private String name;

    public Satellite(String name) {
        this.name = name;
    }

    @Override
    public void launch() {
        System.out.println("Спутник " + name + " выведен на орбиту.");
        System.out.println("Развертывание солнечных панелей...");
        System.out.println("Установка соединения с землей...");
        System.out.println("Спутник " + name + " готов к работе.");
    }
}