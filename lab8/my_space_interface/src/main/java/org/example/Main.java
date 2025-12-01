package org.example;

public class Main {
    public static void main(String[] args) {
        SpaceObject myRocket = new Rocket("Союз-2.1а");
        SpaceObject mySatellite = new Satellite("Глонасс-К");

        System.out.println("--- Запуск Ракеты ---");
        myRocket.launch();

        System.out.println("\n--- Активация Спутника ---");
        mySatellite.launch();
    }
}