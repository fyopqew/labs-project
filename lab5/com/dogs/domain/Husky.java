package com.dogs.domain;

public class Husky extends Dog {
    private String feature = "Loves cold and running";

    public Husky(String name, int age) {
        super(name, age);
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Breed: Husky, Feature: " + feature);
    }
}
