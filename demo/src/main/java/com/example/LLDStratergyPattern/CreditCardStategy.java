package com.example.LLDStratergyPattern;

public class CreditCardStategy implements PayStrategy
{

    @Override
    public void pay(int amount) {
        System.out.println("The algorithm used to pay using Credit Card \n"+amount);
    }
    
}