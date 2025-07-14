package com.example.LLDTemplateDesignPattern;

public abstract class PaymentFlow 
{
  public abstract void validateRequest();
  public abstract void calculateFess();
  public abstract void debitAmount();
  public abstract void creditAmount();

  //Thus is a Template Method: which defines the order of steps to execute the task.

  public final void sendMoney()
  {
    //Step-1
    validateRequest();

    //Step-2
    calculateFess();

    //Step-3
    debitAmount();

    //Step-4
    creditAmount();
  }
}
