package com.example.LLDVendingMachine;

import java.util.ArrayList;
import java.util.List;

import com.example.LLDVendingMachine.VendingStates.State;
import com.example.LLDVendingMachine.VendingStates.impl.IdleState;


public class VendingMachine 
{
   private State vendingMachineState;
   private Inventory inventory;
   private List<Coin> coinList;
   
   public VendingMachine()
    {
      vendingMachineState = new IdleState();
      inventory = new Inventory(10);
      coinList = new ArrayList<>();
    }
    public Inventory getInventory()
    {
      return inventory;
    }
    public State getMachineState()
     {
        return vendingMachineState;
     }
     public void setMachineState(State vendingMachineState)
     {
        this.vendingMachineState = vendingMachineState;
     }
     public List<Coin> getCoinList()
     {
        return coinList;
     }
     public void setCoinList(List<Coin> updatedCoinList)
     {
       this.coinList = updatedCoinList;
     }

}