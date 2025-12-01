package com.dogs.domain;

public class Bulldog extends Dog {
    private String feature;

    public Bulldog(String name, int age, String feature) {
        super(name, age);
        this.feature = feature;
    }

    public String getFeature() {
        return feature;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Breed: Bulldog, Feature: " + getFeature());
    }
}
