package application;


import chess.ChessMatch;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
		 ChessMatch chessMatch = new ChessMatch();
     while(true){
      try{
      UI.clearScreen();
      UI.printBoard(chessMatch.getPieces()); 
      System.out.println();
      System.out.println("Source: ");
      ChessPosition source = UI.readChessPosition(sc);
      
      boolean[][] possibleMoves = chessMatch.possibleMoves(source);
      UI.clearscreen();

      UI.printboard(chessMatch.getPieces(),possibleMoves);
      System.out.println();
      System.out.println("target: ");
      ChessPosition target = UI.readChessPosition(sc); 
      ChessPiece capturedPiece = chessMatch.performChessMove(source,target);
     }
     catch(ChessException e){
       System.out.println(e.getMessage());
       sc.nextLine();
     }
     catch(inputMismatchException e){
       System.out.println(e.getMessage());
       sc.nextLine();
     }

    } 
	

}
