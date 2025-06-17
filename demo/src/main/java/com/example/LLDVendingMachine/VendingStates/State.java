
package com.example.LLDVendingMachine.VendingStates;

import java.util.List;

import com.example.LLDVendingMachine.Coin;
import com.example.LLDVendingMachine.VendingMachine;

public interface State
{
   public void clickOnInsertCoinButton(VendingMachine vendingMachine) throws Exception;
   public void insertCoin(VendingMachine vendingMachine, Coin coin) throws Exception;
   public void clickOnProductSelectionButton(VendingMachine vendingMachine) throws Exception;
   public void chooseProduct(VendingMachine vendingMachine , int code) throws Exception;
   public List<Coin> refundFullMoney(VendingMachine vendingMachine) throws Exception;
   public void getChange(int change) throws Exception;
}