package com.example.LLDStratergyPattern;

public class Shoppingcart 
{
    public PayStrategy payObj;
    public Shoppingcart(PayStrategy payObj)
    {
        this.payObj =  payObj;
    } 
    public void pay()
    {
        payObj.pay(1000);
    }
}