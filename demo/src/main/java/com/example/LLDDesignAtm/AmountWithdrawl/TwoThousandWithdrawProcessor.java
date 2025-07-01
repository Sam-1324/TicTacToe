package com.example.LLDDesignAtm.AmountWithdrawl;

import com.example.LLDDesignAtm.Atm;

public class TwoThousandWithdrawProcessor extends CashWithdrawProcessor
{

    public TwoThousandWithdrawProcessor(CashWithdrawProcessor cashWithdrawProcessor) {
        super(cashWithdrawProcessor);
    }
    public void withdraw(Atm atm, int remainingAmount)
    {
      int required = remainingAmount/2000;
      int balance =remainingAmount%2000;
      
      if(required<=atm.getNoOfTwoThousandNotes())
      {
        atm.deductTwoThousandNotes(required);
      }else if(required > atm.getNoOfTwoThousandNotes())
      {
        atm.deductTwoThousandNotes(atm.getNoOfTwoThousandNotes());
        balance = balance + (required - atm.getNoOfTwoThousandNotes())*2000;
      }
      if(balance!=0)
      {
        super.withdraw(atm,balance);
      }

    }

}