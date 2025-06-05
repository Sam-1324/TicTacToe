# TicTacToe
LLD Design and Code of basic Tic-Tac-Toe game

# Creation of Enum(PieceType):-
-> There are two type of Objects X and Y , with which 2 users will play...

# Creation of Playing Piece CLASS 
-> It is a class in which where piece type is defined , it is a parent class of PlayingPieceX and PlayingPieceY
   
   Variables:
   1- Type


# Creation of Playing PieceX and PlayingPieceY CLASS 
-> These classes are child classes of PlayingPiece , we can also extend other classes if more types are defined..

# BOARD Class

-> The board class is defined on which the game will be played

   Variables:-
   1- int size
   2- PlayingPiece[][] board 
   
   Methods:-
   1- getFreeCells():- It is used to check free cells in the board , where the users will place their bets...
   2- printBoard():- It is used to print the Board
   

# PLAYER Class

-> It is used to define Players in the board , in this class player is defined along with the piece type. Example:- Samiran is playing with piece X and Sid with Y respectively.....
    Variables:-

    1- String name 
    2- PlayingPiece piece

# Business Logic

-> 1- Contructor calling...
      -> The constructor is called to assign players with the types , simulataneously the board size if defined.

    2- Methods
      -> startGame():- 
      a- Starts the game with checking free spaces in the board , if no spaces are there it means all the spaces are full and curretly their are no winners in the game and it will return "tie"...
      b- If free spaces are availaible then player will put the piece in the board and then biz logic will check if the winner is decided if yes then player name is returned otherwise the loop will contine until the winner is found or otherwise it will return "tie"



