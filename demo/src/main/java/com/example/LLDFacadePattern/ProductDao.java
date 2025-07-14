package com.example.LLDFacadePattern;

public class ProductDao
{
    public Product getProduct(int id)
    {
      System.out.println("Object is created for the customer");
      return new Product();
    }
}