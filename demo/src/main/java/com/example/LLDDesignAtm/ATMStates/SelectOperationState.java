package com.example.LLDDesignAtm.ATMStates;

import com.example.LLDDesignAtm.Atm;
import com.example.LLDDesignAtm.Card;
import com.example.LLDDesignAtm.TransactionType;

public class SelectOperationState extends ATMState
{
    public SelectOperationState()
    {
    System.out.println("Requesting you to please select which type of operation you want to start...");
    }
    @Override
    public void selectOperation(Atm atm,Card card,TransactionType type) 
    {
       switch (type) {
        case CASH_WITHDRAWAL:
            atm.setAtmState(new CashWithdrawalState());
            break;
       
        case CHECK_BALANCE:
            atm.setAtmState(new CheckBalanceState());
            break;
        default: {
              System.out.println("Invalid Option");

        }
       }
       
    }
}