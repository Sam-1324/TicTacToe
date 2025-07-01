package com.example.LLDElevatorProblem;

import java.util.ArrayList;
import java.util.List;

public class ElevatorCreator 
{
  static List<ElevatorController> elevatorControllerList = new ArrayList<>();
  static 
  {
    ElevatorCar car1 = new ElevatorCar();
    car1.id  = 1;
    ElevatorController elevatorController = new ElevatorController(car1);

    ElevatorCar car2 = new ElevatorCar();
    car2.id = 2;
    ElevatorController elevatorController2 = new ElevatorController(car2);

    elevatorControllerList.add(elevatorController);
    elevatorControllerList.add(elevatorController2);
  }    
}
