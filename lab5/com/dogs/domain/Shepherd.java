package com.dogs.domain;

public class Shepherd extends Dog {
    private String skill = "Guarding";

    public Shepherd(String name, int age) {
        super(name, age);
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Breed: Shepherd, Skill: " + skill);
    }
}
