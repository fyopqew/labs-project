package org.example;

public class Undergraduate extends Student {
    private String major;

    public Undergraduate(String name, int id, String major) {
        super(name, id);
        this.major = major;
    }

    public String getMajor() {
        return major;
    }

    @Override
    public String toString() {
        return "Undergraduate{" +
                "name='" + getName() + '\'' +
                ", id=" + getId() +
                ", major='" + major + '\'' +
                '}';
    }
}