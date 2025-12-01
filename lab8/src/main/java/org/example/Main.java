package org.example;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

public class Main {
    public static void main(String[] args) throws Exception {
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));

        SpaceObject rocket = new Rocket("Falcon 9");
        SpaceObject satellite = new Satellite("Глонасс");

        rocket.launch();
        satellite.launch();
    }
}
