package com.example.LLDElevatorProblem;

public class InternalButton
{
  int [] availableButtons = {1,2,3,4,5,6,7,8,9};
  int buttonSelected; 
  InternalDispatcher dispatcher = new InternalDispatcher();
  public void pressButton(int direction , ElevatorCar obj)
  {
     dispatcher.submitInternalRequest(direction, obj);
  }
}