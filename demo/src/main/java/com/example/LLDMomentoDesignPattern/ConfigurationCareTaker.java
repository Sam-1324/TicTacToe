package com.example.LLDMomentoDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class ConfigurationCareTaker
{
   List<ConfigurationMomento> history = new ArrayList<>();
   public void addMomento(ConfigurationMomento momento)
   {
      history.add(momento);
   }

   //Fetching the previous stored/saved state of the object.
   public ConfigurationMomento undo()
   {
      if(!history.isEmpty())
      {
        int lastMomentoIndex = history.size() - 1;
        //get the last momento from the List
        ConfigurationMomento lasMomento = history.get(lastMomentoIndex);
        
        //remove the last momento from the List now
        history.remove(lastMomentoIndex);
        return lasMomento;
      }
      return null;
   }
    
}