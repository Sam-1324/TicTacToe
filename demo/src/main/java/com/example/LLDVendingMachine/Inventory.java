package com.example.LLDVendingMachine;

public class Inventory
{
    ItemShelf[] inv = null;
     Inventory(int itemCount)
     {
         inv = new ItemShelf[itemCount];
         initialEmptyInventory();
     }
     public void initialEmptyInventory()
     {
        int startCode = 101;
        for(int i=0;i<inv.length;i++)
        {
          ItemShelf space = new ItemShelf();
          space.setCode(startCode);
          space.setSoldOut(true);
          inv[i]= space;
          startCode++;
        }
     }
     public ItemShelf[] getInventory()
     {
        return inv;
     }
     public Item getItem(int codeNumber) throws Exception
     {
         Item items = null;
         for(ItemShelf itemShelf: inv)
         {
            if(itemShelf.getCode() == codeNumber)
            {
                if(itemShelf.isSoldOut())
                {
                  throw new Exception("Already item is present , you can not add item here");
                }
                else
                {
                  items = itemShelf.getItem();
                } 
            }
         }
         return items;
     }
     public void updateSoldOutItem(int code)
     {
       for(int i=0;i<inv.length;i++)
       {
         int codeval = inv[i].getCode();
         if(codeval == code)
            inv[i].setSoldOut(true);
       }
     }

}