package com.company;

public class Shark extends Animal {
    public void attack() {
        System.out.println("Shark can attack");
    }

    @Override
    public void voice() {
        System.out.println("Shark un");
    }
}