package com.example.LLDVisitorDesignPattern;

public class RoomMaintenanceVisitor implements RoomVisitor
{

    @Override
    public void visit(SingleRoom singleRoomObj) {
        System.out.println("The service of single bedroom will be done in some time.....");
    }

    @Override
    public void visit(DoubleRoom doubleRoom) {
        System.out.println("The service of double bedroom will be done in some time.....");
    }

    @Override
    public void visit(DeluxeRoom deluxeRoom) {
        System.out.println("The service of deluxe bedroom will be done in some time....");
    }
    
}