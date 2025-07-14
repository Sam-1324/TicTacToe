package com.example.LLDStratergyPattern;

public class UPIStrategy implements PayStrategy
{

    @Override
    public void pay(int amount) {
        System.out.println("Algorithm used to pay using UPI"+amount);
    }
    
}