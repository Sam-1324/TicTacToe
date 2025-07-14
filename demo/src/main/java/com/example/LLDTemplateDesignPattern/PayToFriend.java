package com.example.LLDTemplateDesignPattern;

public class PayToFriend extends PaymentFlow
{
    @Override
    public void validateRequest()
    {
      System.out.println("Validating request for PayToFriend");
    }

    @Override
    public void calculateFess() {
      System.out.println("Calculating fees for PayToFriend");
    }

    @Override
    public void debitAmount() 
    {
      System.out.println("Debiting the amount of the customer");   
    }

    @Override
    public void creditAmount()
    {
      System.out.println("Crediting the amount to the customer");   
    }
}
