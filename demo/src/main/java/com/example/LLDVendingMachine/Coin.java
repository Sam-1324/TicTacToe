package com.example.LLDVendingMachine;

public enum Coin 
{
   PENNY(1),
   NICKEL(5),
   DIME(10),
   QUARTER(25);
 
   public int value;
   Coin(int value)
   {
     this.value =value;
   } 
   //When calling Coin.Nickel or Coin.Dime the constructor is automatically called and the value variable is automatically set.....
}