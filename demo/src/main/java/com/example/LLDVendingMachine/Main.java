package com.example.LLDVendingMachine;

import com.example.LLDVendingMachine.VendingStates.State;

public class Main 
{
    public static void main (String[] args)
    {
        VendingMachine vendingMachine = new VendingMachine();
        try {   

            System.out.println("|");
            System.out.println("Filling up the inventory");
            System.out.println("|"); 
            fillInventory(vendingMachine);
            displayInventory(vendingMachine);   

            System.out.println("|");
            System.out.println("Clicking on Insert Coin Button");
            System.out.println("|");

            State vendingState = vendingMachine.getMachineState();
            vendingState.clickOnInsertCoinButton(vendingMachine);

            vendingState = vendingMachine.getMachineState();
            vendingState.insertCoin(vendingMachine,Coin.NICKEL);
            vendingState.insertCoin(vendingMachine,Coin.QUARTER);

            System.out.println("|");
            System.out.println("Clicking on Product Selection Button");
            System.out.println("|");

            vendingState.clickOnProductSelectionButton(vendingMachine);
            System.out.println("Selecting the product code :102 \n");

            System.out.println("|");
            System.out.println("Dispensing the product");
            System.out.println("|");

            vendingState = vendingMachine.getMachineState();
            vendingState.chooseProduct(vendingMachine , 102);

        } catch (Exception e) {
            displayInventory(vendingMachine);
        }
    }
    public static void fillInventory(VendingMachine vendingMachine)
    {
       ItemShelf[] slots =  vendingMachine.getInventory().getInventory();
       for(int i=0;i<slots.length;i++)
       {
         Item newItem = new Item();
         if(i>=0 && i<3)
          {
            newItem.setPrice(10);
            newItem.setType(ItemType.Coke);
          }
         else if(i>=3 && i<5)
         {
            newItem.setPrice(12);
            newItem.setType(ItemType.Pepsi);
         }
         else if(i>=5 && i<7)
         {
            newItem.setPrice(14);
            newItem.setType(ItemType.Soda);
         }
         else if(i>=7 && i<10)
         {
            newItem.setPrice(16);
            newItem.setType(ItemType.Redbull);
         }
         slots[i].setItem(newItem);
         slots[i].setSoldOut(false);
       }
    }
    public static void displayInventory(VendingMachine vendingMachine)
    {
      
        ItemShelf[] slots = vendingMachine.getInventory().getInventory();
        for(int i=0;i<slots.length;i++)
        {
            System.out.println("CodeNumber: " + slots[i].getCode() + " Item: " + slots[i].getItem().name() + " Price: " + slots[i].getItem().getPrice() + " isAvailaible " + !slots[i].isSoldOut());
        }
    }
}