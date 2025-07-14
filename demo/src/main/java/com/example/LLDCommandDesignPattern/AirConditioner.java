package com.example.LLDCommandDesignPattern;

public class AirConditioner
{
  boolean isOn;
  int temperature;
  
   public void turnOnAc()
   { 
     isOn = true;
     System.out.println("AC is ON");
   }
   public void turnOffAC()
   {
     isOn = false;
     System.out.println("AC is OFF");
   }
   public void setTemperatue(int temp)
   {
     this.temperature = temp;
     System.out.println("Temperature changed to: " + temperature);
   }
}