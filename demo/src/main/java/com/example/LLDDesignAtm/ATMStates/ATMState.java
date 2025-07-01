package com.example.LLDDesignAtm.ATMStates;

import com.example.LLDDesignAtm.Atm;
import com.example.LLDDesignAtm.Card;
import com.example.LLDDesignAtm.TransactionType;

public abstract class ATMState 
{
      public void insertCard(Atm atmObject ,Card card)
      {
        System.out.println("OOPs!!! Something is going wrong , you may have selected wrong operation");
      }
      public void authenticatePin(Atm atmObject, Card card , int pin)
      {
        System.out.println("OOPs!!! Something is going wrong , you may have selected wrong operation");
      }
      public void selectOperation(Atm atmObject,Card card, TransactionType type)
      {
        System.out.println("OOPs!!! Something is going wrong , you may have selected wrong operation");
      }
      public void checkBalanceOperation(Atm atmObject , Card card)
      {
         System.out.println("OOPs!!! Something is going wrong , you may have selected wrong operation");
      }
      public void cashWithdrawalOperation(Atm atmObject,Card card,int amount)
      {
        System.out.println("OOPs!!! Something is going wrong , you may have selected wrong operation");
      }
      public void returnCard()
      {
        System.out.println("OOPs!!! Something is going wrong , you may have selected wrong operation");
      }
      public void exitAtm(Atm atmObject)
      {
         System.out.println("OOPs!!! Something is going wrong , you may have selected wrong operation");
      }
}


