package com.example.LLDStratergyPattern;


public class Main
{
  public static void main(String[] args) 
  {
    Shoppingcart obj = new Shoppingcart(new CashStrategy());
    obj.pay();  
  } 
}

/*Strategy Pattern:- Helps to define multiple algorithm for the task and we can select any alogrithm depending upon the situation  */