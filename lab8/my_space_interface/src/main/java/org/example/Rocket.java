package org.example;
public class Rocket implements SpaceObject {
    private String model;

    public Rocket(String model) {
        this.model = model;
    }

    @Override
    public void launch() {
        System.out.println("Подготовка к запуску ракеты " + model + "...");
        for (int i = 10; i > 0; i--) {
            System.out.println(i + "...");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        System.out.println("Запуск ракеты " + model + "!");
    }
}