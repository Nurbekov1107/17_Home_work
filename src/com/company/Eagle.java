package com.company;

public class Eagle extends Animal{
    public void fly(){
        System.out.println("Eagle can fly");
    }

    @Override
    public void voice() {
        System.out.println("Eagle un");
    }
}