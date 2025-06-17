package com.example.LLDVendingMachine;

public class ItemShelf
{
    private int code;
    private Item item;
    private boolean soldOut;

    public void setCode(int code)
    {
        this.code =  code;
    }
    public void setSoldOut(boolean soldOut)
    {
        this.soldOut = soldOut;
    }
    public void setItem(Item item)
    {
      this.item =item;
    }
    public int getCode()
    {
        return this.code;
    }
    public Item getItem()
    {
        return this.item;
    }
    public boolean isSoldOut()
    {
        return this.soldOut;
    }

}