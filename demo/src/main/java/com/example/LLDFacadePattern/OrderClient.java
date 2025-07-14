package com.example.LLDFacadePattern;

public class OrderClient
{
   public static void main (String[] args)
   {
     OrderFacade orderFacade = new OrderFacade();
     orderFacade.createOrder();
   } 
}