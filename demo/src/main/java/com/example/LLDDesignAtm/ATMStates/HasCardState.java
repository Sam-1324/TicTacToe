package com.example.LLDDesignAtm.ATMStates;

import com.example.LLDDesignAtm.Atm;
import com.example.LLDDesignAtm.Card;

public class HasCardState extends ATMState
{
     public HasCardState()
     {
        System.out.println("Enter your card pin number \n");
     }

     @Override
     public void authenticatePin(Atm atm, Card card, int pin)
     {
        boolean isAuthenticated = card.isCorrectPinEntered(pin);
        if(isAuthenticated == true)
         {
            System.out.println("Congratulations authentication is successfull.....");
            atm.setAtmState(new SelectOperationState());
         }
         else
         {
            System.out.println("Oops authentication is not successfull.....");
            atm.setAtmState(new IdleState());
         }
     }
}
