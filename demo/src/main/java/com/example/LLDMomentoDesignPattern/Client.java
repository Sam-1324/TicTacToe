package com.example.LLDMomentoDesignPattern;


public class Client
{
  public static void main(String[] args) 
  {
    ConfigurationCareTaker careTakerObject = new ConfigurationCareTaker();
    
    //initiate state of the originator

    ConfigurationOriginator originatorObject = new ConfigurationOriginator(5,10);

    //Creating a momento of the object in State-1.
    ConfigurationMomento snapshot1 = originatorObject.createMomento();
    //Saving the momento/state into the CareTaker object 
    careTakerObject.addMomento(snapshot1);


    //Originator now trying to change the state of the object
    originatorObject.setHeight(10);
    originatorObject.setWidth(12);
    //Creating a 2nd momento of the same object in State-2
    ConfigurationMomento snapshot2 = originatorObject.createMomento();
    //Saving the momento/state into the Caretaker object
    careTakerObject.addMomento(snapshot2);

    //originator changing to new State
    originatorObject.setHeight(9);
    originatorObject.setWidth(14);

    //UNDO
    ConfigurationMomento restoredStateMomentoObj = careTakerObject.undo();
    originatorObject.restoreMomento(restoredStateMomentoObj);
  
    //Printing the previous state of the object....
    
    System.out.println("height: " + originatorObject.getHeight() + " width: " + originatorObject.getWidth());
  }
}