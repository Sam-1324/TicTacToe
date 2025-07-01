package com.example.LLDDesignAtm;

import com.example.LLDDesignAtm.ATMStates.ATMState;
import com.example.LLDDesignAtm.ATMStates.CheckBalanceState;
import com.example.LLDDesignAtm.ATMStates.IdleState;
import com.example.LLDDesignAtm.ATMStates.SelectOperationState;

public class Atm 
{
   private static Atm atmObject = new Atm(); // Singleton: Eager Initialization.....
   private ATMState state = null;
   private int atmAccountBalance;
   private int twoThousandRupees;
   private int fiveHundredRupees;
   private int oneHundredRupees;
   private Atm()
   {
   }
   public static Atm getATMObject()
   {
    atmObject.setAtmState(new IdleState());
    return atmObject;
   }
   public ATMState getAtmState()
   {
    return state;
   }
   public void setAtmState(ATMState state)
   {
     this.state = state;
   }
   public void setAtmAccountBalance(int balance, int twoThousandRupees,int fiveHundredRupees, int oneHundredRupees)
   {
     this.atmAccountBalance = balance; 
     this.twoThousandRupees = twoThousandRupees;
     this.fiveHundredRupees = fiveHundredRupees;
     this.oneHundredRupees = oneHundredRupees;
   }
   public int getAtmAccountBalance()
   {
     return atmAccountBalance;
   }
   public void deductAtmBalanceAmount(int deductionAmount)
   {
     atmAccountBalance = atmAccountBalance - deductionAmount;
   }
   public int getNoOfTwoThousandNotes()
   {
     return twoThousandRupees;
   }
   public int getNoOfOneHundredNotes()
   {
     return oneHundredRupees;
   }
   public int getNoOfFiveHundredNotes()
   {
    return fiveHundredRupees;
   }
   public void deductTwoThousandNotes(int notes)
   {
     twoThousandRupees-=notes;
   }
   public void deductOneHundredNotes(int notes)
   {
     oneHundredRupees-=notes;
   }
   public void deductFiveHundredNotes(int notes)
   {
    fiveHundredRupees-=notes;
   }
   public void printCurrentAtmStatus()
   {
    System.out.println("Balance: " + atmAccountBalance);
    System.out.println("2kNotes: " + twoThousandRupees);
    System.out.println("500Notes: " + fiveHundredRupees);
    System.out.println("100Notes: " + oneHundredRupees);
   }
  
}