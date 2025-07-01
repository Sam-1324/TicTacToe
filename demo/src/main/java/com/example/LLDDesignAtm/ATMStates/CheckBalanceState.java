package com.example.LLDDesignAtm.ATMStates;

import com.example.LLDDesignAtm.Atm;
import com.example.LLDDesignAtm.Card;

public class CheckBalanceState extends ATMState 
{
    CheckBalanceState()
    {
        System.out.println("You are now going to perform Check Balance Operation........");
    }
    @Override
    public void checkBalanceOperation(Atm atmObject , Card card)
    {
        int balance_amount = card.getAccountBalance();
        System.out.println(balance_amount);
        exitAtm(atmObject);
    }
    @Override
    public void exitAtm(Atm atmObject)
    {
        returnCard();;
        atmObject.setAtmState(new IdleState());
        System.out.println("Exit happens");
    }
    @Override
    public void returnCard()
    {
        System.out.println("Please collect your card.....");
    }
}
