package com.example.LLDVendingMachine.VendingStates.impl;

import java.util.ArrayList;
import java.util.List;

import com.example.LLDVendingMachine.Coin;
import com.example.LLDVendingMachine.VendingMachine;
import com.example.LLDVendingMachine.VendingStates.State;

public class IdleState implements State
{
    public IdleState()
    {
        System.out.println("Currently the vending machine is in the Idle State");
    }
    public IdleState(VendingMachine vendingMachine)
    {
        System.out.println("Currently the vending machine is in Idle State");
        vendingMachine.setCoinList(new ArrayList<>());
    }
    @Override
    public void clickOnInsertCoinButton(VendingMachine vendingMachine) 
    {
        vendingMachine.setMachineState(new HasMoneyState());
    }

    @Override
    public void insertCoin(VendingMachine vendingMachine, Coin coin) throws Exception{
        
        throw new UnsupportedOperationException("You cannot perform insert coin operation during Idle state");
    }

    @Override
    public void clickOnProductSelectionButton(VendingMachine vendingMachine) {
        
        throw new UnsupportedOperationException("You will not be able to perform this operation when Vending Machine is an Idle State");
    }

    @Override
    public void chooseProduct(VendingMachine vendingMachine, int code) throws Exception {
        
        throw new UnsupportedOperationException("Unimplemented method 'chooseProduct'");
    }

    @Override
    public List<Coin> refundFullMoney(VendingMachine vendingMachine) throws Exception {
     
        throw new UnsupportedOperationException("Unimplemented method 'refundFullMoney'");
    }

    @Override
    public void getChange(int change) throws Exception {
       
        throw new UnsupportedOperationException("Unimplemented method 'getChange'");
    }

    
    
}