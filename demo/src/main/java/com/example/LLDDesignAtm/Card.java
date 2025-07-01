package com.example.LLDDesignAtm;

public class Card
{
    static int PIN_NUMBER = 9999;
    private UserAccount userAccount;
    
    public boolean isCorrectPinEntered(int pin)
    {
       if(pin == PIN_NUMBER)
       {
        return true;
       }
       else
       {
        return false;
       }
    }
    public void setBankAccount(UserAccount userAccount)
    {
        this.userAccount = userAccount;
    }
    public int getAccountBalance()
    {
        return userAccount.balance;
    }
    public void deductBankBalance(int deductionAmount)
    {
        userAccount.balance = userAccount.balance - deductionAmount;
    }
}