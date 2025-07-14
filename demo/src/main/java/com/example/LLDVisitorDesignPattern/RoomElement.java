package com.example.LLDVisitorDesignPattern;

public interface RoomElement
{
   public void accept (RoomVisitor visitor);
}