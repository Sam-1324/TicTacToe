package com.example.LLDVendingMachine;

public class Item 
{
   private int price;
   private ItemType itemType;

   public void setPrice(int price)
   {
     this.price = price;
   }
   public void setType(ItemType itemType)
   {
     this.itemType = itemType;
   }
   public ItemType name()
   {
    return this.itemType;
   }
   public int getPrice()
   {
     return price;
   }

}
