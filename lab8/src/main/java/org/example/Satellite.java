package org.example;

public class Satellite extends SpaceObject {

    public Satellite(String name) {
        super(name);
    }

    @Override
    public void launch() {
        System.out.println("🛰️ Спутник «" + getName() + "» выведен на орбиту!");
    }
}