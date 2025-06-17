package com.example.LLDSnakeAndLadder.Model;

import java.util.concurrent.ThreadLocalRandom;

public class GameBoard 
{ 
    public Cell[][] cells;

    public GameBoard(int boardSize,int snakes,int ladder)
    {
      intializeBoard(boardSize);
      addSnakesLadder(cells,snakes,ladder);
    }
    private void intializeBoard(int boardSize)
    {
      cells = new Cell[boardSize][boardSize];
      for(int i=0;i<boardSize;i++)
      {
        for(int j=0;j<boardSize;j++)
        {
          Cell cellObj = new Cell();
          cells[i][j] = cellObj; 
        }
      }
    }
    private void addSnakesLadder(Cell[][]cells,int snakes,int ladder)
    {
      while(snakes>0)
      {
        int snakeHead = ThreadLocalRandom.current().nextInt(1,cells.length*cells.length-1); 
        int snakeTail = ThreadLocalRandom.current().nextInt(1,cells.length*cells.length-1);
        if(snakeTail>=snakeHead)
            continue;
        Jump snakeObj = new Jump();
        snakeObj.start = snakeHead;
        snakeObj.end = snakeTail;

        Cell cell = getCell(snakeHead);
        cell.jump = snakeObj;
        snakes--;
      } 
      while(ladder>0)
      {
        int ladderStart = ThreadLocalRandom.current().nextInt(1,cells.length*cells.length-1);
        int ladderEnd = ThreadLocalRandom.current().nextInt(1,cells.length*cells.length-1);
        if(ladderStart>=ladderEnd)
         continue;
        Jump ladderObj = new Jump();
        ladderObj.start = ladderStart;
        ladderObj.end = ladderEnd;
        
        Cell cell = getCell(ladderStart);
        cell.jump = ladderObj;
        ladder--;

      }
    }
    public Cell getCell(int value)
    {
        int row = value/cells.length;
        int column = value % cells.length;
        return cells[row][column];
    }

}
