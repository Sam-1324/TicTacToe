package com.example.LLDTicTacToe;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import com.example.LLDTicTacToe.Model.Board;
import com.example.LLDTicTacToe.Model.Pair;
import com.example.LLDTicTacToe.Model.PieceType;
import com.example.LLDTicTacToe.Model.Player;
import com.example.LLDTicTacToe.Model.PlayingPieceX;
import com.example.LLDTicTacToe.Model.PlayingPieceY;

public class TicTacToeGame
{
    Deque<Player> players;
    Board gameBoard;

    TicTacToeGame()
    {
        players =  new LinkedList<>();

        //Creating 2 players.......
        PlayingPieceX pieceX = new PlayingPieceX();
        Player player1 = new Player("Samiran",pieceX);
        PlayingPieceY pieceY = new PlayingPieceY();
        Player player2 = new Player("Siddharth", pieceY);
        
        players.add(player1);
        players.add(player2);

        //intializing Board........

        gameBoard = new Board(3);
    }

    public String startGame()
    {
        boolean noWinner = true;
        while(noWinner)
        {
            //Taking out the player first from the list then putting the palyer in the list back .....
            Player playerTurn = players.removeFirst();

            //get the free space from the board 
            gameBoard.printBoard();

            List<Pair<Integer,Integer>> freeSpaces = gameBoard.getFreeCells();
            if(freeSpaces.isEmpty())
            {
                noWinner = false;
                continue;
            }

            //read the user input

            System.out.println("Player: " + playerTurn.name + " Enter row,columm: ");
            Scanner inputScanner = new Scanner(System.in);
            String s = inputScanner.nextLine();
            String[] values = s.split(",");

            int inputRow = Integer.valueOf(values[0]);
            int inputColumn = Integer.valueOf(values[1]);

            //place the piece
            boolean pieceAddedSuccessfully = gameBoard.addPiece(inputRow,inputColumn,playerTurn.piece);
            if(!pieceAddedSuccessfully)
            {
                // Player can not insert the piece into this cell , player has to choose another cell
                System.out.println("Incorrect position chosen , try again");
                players.addFirst(playerTurn);
                continue;
            }
            players.addLast(playerTurn);
            boolean winner = isThereWinner(inputRow,inputColumn,playerTurn.piece.type);
            if(winner)
            {
              return playerTurn.name;
            }

            
        }
       return "tie";
        
    }
    public boolean isThereWinner(int row,int column, PieceType pieceType)
    {
      boolean rowMatch = true;
      boolean columnMatch = true;
      boolean diagonalMatch = true;
      boolean antidiagonal = true;
      
      //need to check in the row 
      for(int i=0;i<gameBoard.size;i++)
      {
        if(gameBoard.board[row][i] == null || gameBoard.board[row][i].type != pieceType)
         {
           rowMatch = false;
         }
      }

      //need to check the column
      for(int i=0;i<gameBoard.size;i++)
      {
        if(gameBoard.board[i][column] == null || gameBoard.board[i][column].type!=pieceType)
        {
            columnMatch = false;
        }
      }
    
      //need to chdck for the diagonals
      for(int i=0, j=0; i<gameBoard.size;i++,j++)
       {
        if(gameBoard.board[i][j]==null || gameBoard.board[i][j].type!=pieceType)
         {
           diagonalMatch = false;
         }
       }
       
       //need to check for the anti- diagonals
       for(int i=0,j=gameBoard.size-1;i<gameBoard.size;i++,j--)
       {
         if(gameBoard.board[i][j]==null || gameBoard.board[i][j].type!=pieceType)
         {
          antidiagonal = false;
         }
       }
      return rowMatch || columnMatch || diagonalMatch || antidiagonal ;
    }
}