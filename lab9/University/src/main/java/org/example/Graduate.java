package org.example;

public class Graduate extends Student {
    private String thesisTopic;

    public Graduate(String name, int id, String thesisTopic) {
        super(name, id);
        this.thesisTopic = thesisTopic;
    }

    public String getThesisTopic() {
        return thesisTopic;
    }

    @Override
    public String toString() {
        return "Graduate{" +
                "name='" + getName() + '\'' +
                ", id=" + getId() +
                ", thesisTopic='" + thesisTopic + '\'' +
                '}';
    }
}