package com.example.LLDDesignAtm.ATMStates;

import com.example.LLDDesignAtm.Atm;
import com.example.LLDDesignAtm.Card;

public class IdleState extends ATMState
{
   public IdleState()
   { 
      System.out.println("Welcome to our Sam Internationals Bank !!!! \n");
      System.out.println("Currently our ATM machine is in Idle State.");
   }    
   @Override
   public void insertCard(Atm atmObject ,Card card)
   {
     atmObject.setAtmState(new HasCardState());
   }
}
