package com.example.LLDDesignAtm.AmountWithdrawl;

import com.example.LLDDesignAtm.Atm;

public abstract class CashWithdrawProcessor
{
  CashWithdrawProcessor nexCashWithdrawProcessor;
  CashWithdrawProcessor(CashWithdrawProcessor cashWithdrawProcessor)
  {
    this.nexCashWithdrawProcessor = cashWithdrawProcessor;
  }
  public void withdraw(Atm atm , int remainingAmount)
  {
     if(nexCashWithdrawProcessor!=null)
     {
        nexCashWithdrawProcessor.withdraw(atm, remainingAmount);
     }
  }
}