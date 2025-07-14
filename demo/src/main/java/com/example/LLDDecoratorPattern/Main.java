package com.example.LLDDecoratorPattern;

public class Main 
{
    public static void main(String[] args)
    {
       BasePizza basePizza = new Mushroom(new ExtraCheese(new Margherita()));
       System.out.println("Final price of my Pizza is: "+ basePizza.cost());
    }
}