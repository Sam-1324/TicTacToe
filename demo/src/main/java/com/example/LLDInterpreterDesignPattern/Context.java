package com.example.LLDInterpreterDesignPattern;

import java.util.HashMap;
import java.util.Map;

public class Context
{
    Map <String , Integer> contextMap = new HashMap<>();
    public void put(String variable , int intValue)
    {
        contextMap.put(variable, intValue);
    }
    public int get(String strVariable)
    {
      return contextMap.get(strVariable);
    }
}