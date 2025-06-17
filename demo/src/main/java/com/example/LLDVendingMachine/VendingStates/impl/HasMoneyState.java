package com.example.LLDVendingMachine.VendingStates.impl;

import java.util.List;

import com.example.LLDVendingMachine.Coin;
import com.example.LLDVendingMachine.VendingMachine;
import com.example.LLDVendingMachine.VendingStates.State;

public class HasMoneyState implements State
{
    public HasMoneyState()
    {
        System.out.println("Currently the machine is in HasMoneyState");
    }
    @Override
    public void clickOnInsertCoinButton(VendingMachine vendingMachine) throws Exception{
        return;
    }

    @Override
    public void insertCoin(VendingMachine vendingMachine,Coin coin) throws Exception
    {
      System.out.println(coin.value);
      vendingMachine.getCoinList().add(coin);   
    }

    @Override
    public void clickOnProductSelectionButton(VendingMachine vendingMachine)
    {
      vendingMachine.setMachineState(new SelectionState());
    }


    @Override
    public void chooseProduct(VendingMachine vendingMachine, int code) throws Exception {
        throw new UnsupportedOperationException("You need to click on start product selection button first....");
    }

    @Override
    public List<Coin> refundFullMoney(VendingMachine vendingMachine) throws Exception {
        throw new UnsupportedOperationException("You cannot refund money of the customer in HasMoneyState....");
    }

    @Override
    public void getChange(int change) throws Exception {
        throw new UnsupportedOperationException("You can not get change in HasMoneyState");
    }
    
}