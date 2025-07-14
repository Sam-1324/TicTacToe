package com.example.LLDDecoratorPattern;

/*

What is Decorator Pattern ?
 -> Decorator pattern is used to decorate an object with more parameters which can be further be decorated with more parameters. Example:- A base pizza is an object , which can be 
    further be decorated with extra chesse which can be further be decorated with Mushrooms as well.

What is the benefit of Decorator Pattern ?
 -> It prevents 'CLASS EXPLOSION' we don't have to create multiple classes. Example:- Otherwise for Base Pizza , Base Pizza + Extra Cheese , Base Pizza + Extra Cheese + Mushroom we don't 
    have to create all three seperate classes.
 */

public abstract class BasePizza
{
    public abstract int cost();
} 