package com.example.LLDVisitorDesignPattern;

public class Client
{
  public static void main(String[] args)
  {
     RoomElement singleRoomObj = new SingleRoom();
     RoomElement doubleRoomObj = new DoubleRoom();
     RoomElement deluxeRoomObj = new DeluxeRoom();

    // Want to check the pricing of single bedroom , in order to do that create RoomPricingVisitor object
    RoomVisitor roomVisitor = new RoomPricingVisitor();
    singleRoomObj.accept(roomVisitor);
    
    // Check the pricing of single bedroom
    System.out.println(((SingleRoom)singleRoomObj).roomPrice);

    //Want to check the pricing of double bedroom...
    doubleRoomObj.accept(roomVisitor);
    System.out.println(((DoubleRoom)singleRoomObj).roomPrice);
 
    //Want to check the pricing of deluxe room...
    deluxeRoomObj.accept(roomVisitor);
    System.out.println(((DeluxeRoom)singleRoomObj).roomPrice);


  }
}