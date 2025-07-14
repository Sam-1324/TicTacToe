package com.example.LLDTemplateDesignPattern;


public class PayToMerchant extends PaymentFlow
{
    @Override
    public void validateRequest()
    {
      System.out.println("Validating request for PayToMerchant");
    }

    @Override
    public void calculateFess() {
      System.out.println("Calculating fees for PayToMerchant");
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