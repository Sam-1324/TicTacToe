package com.example.LLDVisitorDesignPattern;
public interface RoomVisitor
{
    public void visit(SingleRoom singleRoomObj);
    public void visit(DoubleRoom doubleRoom);
    public void visit(DeluxeRoom deluxeRoom);
}