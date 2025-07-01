package com.example.LLDElevatorProblem;

import java.util.ArrayList;
import java.util.List;

public class ExternalDispatcher
{
     List<ElevatorController> externalDispatcher = ElevatorCreator.elevatorControllerList;

    public void submitExternalRequest(int floorNumber , Direction direction)
    {
      //for simplicity , I am following odd and even.
      for(ElevatorController elevatorController: externalDispatcher)
       {
           int elevatorid = elevatorController.obj.id;
           if(elevatorid%2 == 1 && floorNumber%2==1)
           {
              elevatorController.submitExternalRequest(floorNumber,direction);
           } 
           else if(elevatorid%2 ==0 && floorNumber%2==0)
           {
              elevatorController.submitExternalRequest(floorNumber, direction);
           }

       }
       
    }
}