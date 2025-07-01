package com.example.LLDElevatorProblem;


public class ElevatorCar
{
   ElevatorState state;
   int id;
   InternalButton internalButton;
   int currentFloor;
   ElevatorDoor elevatorDoor;
   ElevatorDisplay elevatorDisplay;
   Direction elevatorDirection;
   public ElevatorCar()
   {
     elevatorDisplay = new ElevatorDisplay();
     state = ElevatorState.IDLE;
     internalButton = new InternalButton();
     currentFloor = 0;
     elevatorDirection = Direction.MOVING_UP;
     elevatorDoor = new ElevatorDoor();
   }
   public void pressButton(int destination)
   {
     internalButton.pressButton(destination, this);
   }
   public void showDisplay()
   {
     elevatorDisplay.showDisplay();
   }
   public void setDisplay()
   {
     elevatorDisplay.setDisplay(currentFloor, elevatorDirection);
   }
   boolean moveElevator(Direction dir, int destinationFloor)
   {
      int startFloor = currentFloor;
      if(dir == Direction.MOVING_UP)
      {
        for(int i = startFloor;i<=destinationFloor;i++)
        {
            this.currentFloor = startFloor;
            setDisplay();
            showDisplay();
            if(i == destinationFloor)
            {
                return true;
            }
        }
      }
      if(dir == Direction.MOVING_DOWN)
      {
        for(int i = startFloor;i>=destinationFloor;i--)
        {
            this.currentFloor = startFloor;
            setDisplay();
            showDisplay();
            if(i == destinationFloor)
            {
                return false;
            }
        }
      }
     return false;
   }

}