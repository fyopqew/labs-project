package com.dogs;

import com.dogs.domain.*;

public class DogTest {
    public static void main(String[] args) {
        Dog d1 = new Shepherd("Rex", 5);
        Dog d2 = new Bulldog("Matvey", 3, "Strong and Brave");
        Dog d3 = new Husky("Luna", 2);

        d1.displayInfo();
        System.out.println();
        d2.displayInfo();
        System.out.println();
        d3.displayInfo();
    }
}
