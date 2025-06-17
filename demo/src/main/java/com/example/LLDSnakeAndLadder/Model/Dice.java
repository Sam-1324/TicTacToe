package com.example.LLDSnakeAndLadder.Model;

import java.util.concurrent.ThreadLocalRandom;

public class Dice
{
   int diceCount;
   public Dice(int diceCount)
   {
     this.diceCount =  diceCount;
   }   
   public int rollsDice()
   {
      return ThreadLocalRandom.current().nextInt(1,7);
   } 

}
