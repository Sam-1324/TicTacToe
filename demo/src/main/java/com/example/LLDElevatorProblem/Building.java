package com.example.LLDElevatorProblem;

import java.util.List;

public class Building
{
    private List<Floor> floors ;
    public Building(List<Floor> floors)
    { 
        this.floors =floors;
    }
    public void addFloors(Floor newFloor)
    {
     floors.add(newFloor);
    } 
    public void removeFloors(Floor removeFloor)
    {
        floors.remove(removeFloor);
    }
    
}