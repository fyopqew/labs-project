package org.example;

public abstract class SpaceObject {
    private String name;

    public SpaceObject(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void launch();
}