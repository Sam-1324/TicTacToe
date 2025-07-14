package com.example.LLDVisitorDesignPattern;

public class RoomPricingVisitor implements RoomVisitor
{

    @Override
    public void visit(SingleRoom singleRoomObj) {
        singleRoomObj.roomPrice = 1000;
        System.out.println("The price of single bedroom is Rs 1000");
    }

    @Override
    public void visit(DoubleRoom doubleRoom) {
        doubleRoom.roomPrice = 3000;
        System.out.println("The price of double bedroom is Rs 3000");
    }

    @Override
    public void visit(DeluxeRoom deluxeRoom) {
        deluxeRoom.roomPrice = 5000;
        System.out.println("The price of delux bedroom is Rs 5000");
    }
    
}