package com.example.LLDElevatorProblem;

import java.util.PriorityQueue;

public class ElevatorController
{
  ElevatorCar obj;
  PriorityQueue<Integer> upMinPQ;
  PriorityQueue<Integer> downMaxPQ;
  public ElevatorController (ElevatorCar obj)
  {
   this.obj = obj;
   upMinPQ = new PriorityQueue<>();
   downMaxPQ = new PriorityQueue<>((a,b)-> b-a);

  }
  public void submitExternalRequest(int floor , Direction direction)
  {
     if(direction == Direction.MOVING_DOWN)
     {
       downMaxPQ.offer(floor);
     }
     else
     {
        upMinPQ.offer(floor);
     }
  }
  

  
}