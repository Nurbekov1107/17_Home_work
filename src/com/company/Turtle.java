package com.company;

public class Turtle extends Animal{
    public void swim(){
        System.out.println("Turtle can swim");
    }

    @Override
    public void voice() {
        System.out.println("Turtle un");
    }
}