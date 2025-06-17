package com.example.LLDVendingMachine.VendingStates.impl;

import java.util.List;

import com.example.LLDVendingMachine.Coin;
import com.example.LLDVendingMachine.Item;
import com.example.LLDVendingMachine.VendingMachine;
import com.example.LLDVendingMachine.VendingStates.State;

public class DispenseState implements State
{

    public DispenseState(VendingMachine vendingMachine, int code) throws Exception {
     System.out.println("Currently vending machine is in Dispensing State \n");
     dispenseProduct(vendingMachine,code);
    }

    private Item dispenseProduct(VendingMachine vendingMachine, int code) throws Exception {
      Item item =  vendingMachine.getInventory().getItem(code);
      System.out.println("Product has been dispensed : ");
      System.out.println(item.name());
      vendingMachine.getInventory().updateSoldOutItem(code);
      vendingMachine.setMachineState(new IdleState(vendingMachine));
      return item;
    }

    @Override
    public void clickOnInsertCoinButton(VendingMachine vendingMachine) throws Exception {
        throw new UnsupportedOperationException("Unimplemented method 'clickOnInsertCoinButton'");
    }

    @Override
    public void insertCoin(VendingMachine vendingMachine, Coin coin) throws Exception {
        throw new UnsupportedOperationException("Unimplemented method 'insertCoin'");
    }

    @Override
    public void clickOnProductSelectionButton(VendingMachine vendingMachine) {
        throw new UnsupportedOperationException("Unimplemented method 'clickOnProductSelectionButton'");
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