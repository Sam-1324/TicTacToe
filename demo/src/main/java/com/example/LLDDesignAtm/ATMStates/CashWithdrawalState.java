package com.example.LLDDesignAtm.ATMStates;

import com.example.LLDDesignAtm.Atm;
import com.example.LLDDesignAtm.Card;
import com.example.LLDDesignAtm.AmountWithdrawl.CashWithdrawProcessor;
import com.example.LLDDesignAtm.AmountWithdrawl.FiveHundredWithdrawProcessor;
import com.example.LLDDesignAtm.AmountWithdrawl.OneHundredWithdrawProcessor;
import com.example.LLDDesignAtm.AmountWithdrawl.TwoThousandWithdrawProcessor;

public class CashWithdrawalState extends ATMState 
{
   public CashWithdrawalState()
   {
    System.out.println("You have selected cash withdrawal option , please go ahead and enter the withdrawal amount \n");
   }

   public void cashWithdrawalOperation(Atm atm , Card card , int withdrawalamount)
   {
      if(atm.getAtmAccountBalance()<withdrawalamount)
      {
         System.out.println("Insufficient funds in the ATM");
      }
      else if(card.getAccountBalance()<withdrawalamount)
      {
        System.out.println("Insufficient funds in your bank");
      }
      else {
        card.deductBankBalance(withdrawalamount);
        atm.deductAtmBalanceAmount(withdrawalamount);

        //Using chain of responsibility for this logic, how many 2k Rs notes , how many 500 Rs notes etc , has to be withdrawal
        CashWithdrawProcessor withdrawProcessor = new TwoThousandWithdrawProcessor(new FiveHundredWithdrawProcessor(new OneHundredWithdrawProcessor(null)));
        withdrawProcessor.withdraw(atm, withdrawalamount);
        exitAtm(atm);

      }
   }    
   public void exitAtm(Atm atm)
   {
     returnCard();
     atm.setAtmState(new IdleState());
     System.out.println("Congratulation the money has been sucessfully debited from your account \n");
   }
   public void returnCard()
   {
     System.out.println("Please collect your card");
   }
}
