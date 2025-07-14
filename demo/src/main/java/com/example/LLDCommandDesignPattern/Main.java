package com.example.LLDCommandDesignPattern;

public class Main
{
   public static void main(String[] args)
   {
     //Creation of AirConditoner object.
     AirConditioner ac = new AirConditioner();

     //RemoteController object is created.
     RemoteController myObj = new RemoteController();

     //Turn Off AC command is set using which we will try to turn of the AC.
     myObj.setCommand(new TurnACOffCommand(ac));
    
     myObj.pressButton();
      

   }
}

/*The command design pattern was created to decouple between Client and Receiver , if the client has to remember all the methods in order to "TURN ON THE AC" or "TURN OFF THE AC" , if some of the steps
* are missed then "Client" code can break which can lead to "Tight Coupling".

In order to simplify what we can do is create a second interface "Command" from which multiple classes/commands can be extended , the Client has to only press the Button automatically the relevant 
the action will be performed.

*/