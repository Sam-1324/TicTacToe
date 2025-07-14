package com.example.LLDStratergyPattern;

public class CashStrategy implements PayStrategy
{

    @Override
    public void pay(int amount) {
       System.out.println("Algorithm used to pay using Cash \n"+ amount);
    }
    
}