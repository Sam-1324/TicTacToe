package com.example.LLDVendingMachine.VendingStates.impl;

import java.util.List;

import com.example.LLDVendingMachine.Coin;
import com.example.LLDVendingMachine.Item;
import com.example.LLDVendingMachine.VendingMachine;
import com.example.LLDVendingMachine.VendingStates.State;

public class SelectionState implements State
{

    @Override
    public void clickOnInsertCoinButton(VendingMachine vendingMachine) {
        throw new UnsupportedOperationException("You will not be able to perform this operation when Vending Machine is in Selection State");
    }

    @Override
    public void insertCoin(VendingMachine vendingMachine, Coin coin) {
        throw new UnsupportedOperationException("You will not be able to perform this operation when Vending Machine is in Selection State");
    }

    @Override
    public void clickOnProductSelectionButton(VendingMachine vendingMachine) {
        throw new UnsupportedOperationException("You will not be able to perform this operation when Vending Machine is in Selection State");
    }

    @Override
    public void chooseProduct(VendingMachine vendingMachine, int code) throws Exception 
    {
      //1. get item of this code Number
       Item item = vendingMachine.getInventory().getItem(code);

      //2.Total amount paid by the user
      int paidByUser = 0;
      for(Coin coin: vendingMachine.getCoinList())
      {
        paidByUser+=coin.value;
      }

      //3. Compare product price and amount paid by the user
        if(paidByUser<item.getPrice())
        {
          System.out.println("Insufficient Amount, Product you selected is for price: " + item.getPrice() + " and you paid " + paidByUser);
          refundFullMoney(vendingMachine);
          throw new Exception("insufficient amount");
        }
        else if(paidByUser>=item.getPrice())
        {
           if(paidByUser>item.getPrice())
           {
            getChange(paidByUser - item.getPrice());
           }
           vendingMachine.setMachineState(new DispenseState(vendingMachine,code));
        }
    }

    @Override
    public List<Coin> refundFullMoney(VendingMachine vendingMachine) 
    {
      System.out.println("Returned the full amount back in the Coin Dispense Tray......");
      vendingMachine.setMachineState(new IdleState());
      return vendingMachine.getCoinList();
    }
    @Override
    public void getChange(int change)
    {
       //actual logic should be to return the coins in the dispense tray , but for simplicity I am just printing the amount of money to be returned....
       System.out.println("Returned the change in the Coin Dispense Tray: " + change + "\n");
    }
    
}