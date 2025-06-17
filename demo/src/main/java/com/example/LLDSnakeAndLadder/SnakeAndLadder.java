package com.example.LLDSnakeAndLadder;

import java.util.Deque;
import java.util.LinkedList;

import com.example.LLDSnakeAndLadder.Model.Cell;
import com.example.LLDSnakeAndLadder.Model.Dice;
import com.example.LLDSnakeAndLadder.Model.GameBoard;
import com.example.LLDSnakeAndLadder.Model.Player;

public class SnakeAndLadder
{
    Deque<Player> players;
    GameBoard board;
    Player winner;
    Dice dice;
    public SnakeAndLadder()
    {
       players = new LinkedList<>();

       //Creating 2 players Samiran and Siddharth and add them to the list and intialize the currentpos to 0......

       Player player1 = new Player("Samiran",0);
       Player player2 = new Player("Siddharth",0);
       players.add(player1);
       players.add(player2);


       board = new GameBoard(10,5,4);

       //Intializing the count to 1 as only one dice is use to play this game.....
       dice = new Dice(1);

       //Intializing the winner to null as currently there is no winner in this game.....
       winner = null;
    } 
    public String startGame()
    {
       while(winner==null)
       {
          // check whose turn is now....
          Player playerTurn =  findPlayerTurn();
          System.out.println("player turn is: " + playerTurn.name + " current position is: " + playerTurn.currentpos);

          //roll the dice 
         int num = dice.rollsDice();
         int newPos = playerTurn.currentpos + num;
         newPos = jumpCheck(newPos);
        
         playerTurn.currentpos = newPos;
         if(newPos>=board.cells.length*board.cells.length-1)
         {
            winner = playerTurn;
         }
         players.addLast(playerTurn);
       }
       return winner.name;
    }
    public int jumpCheck(int newPos)
    {
        Cell cell = board.getCell(newPos);
        if(cell.jump!=null && cell.jump.start==newPos)
        {
            newPos =  cell.jump.end;
        }
        return newPos;
    }
    public Player findPlayerTurn()
    {
        Player player1 = players.removeFirst();
        players.addLast(player1);
        return player1;
    }
}