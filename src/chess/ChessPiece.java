package chess;

import boardgame.Piece;
import boardgame.Position;

public abstract class ChessPiece extends Piece {
  private Color color;
  private int moveCount;
  
  
  public ChessPiece (Board board, Color color){
    super(board);
    this.color = color;
  }
 
 public color getColor(){
   return color;
 }
 
 public getMoveCount(){
  return moveCount;   
  }
  
 public void  increaseMoveCount(){
   moveCount++;
 }
 public void decreaseMoveCount(){
   moveCount--;
 }
  
 public chessPosition getChessPosition(){
    return ChessPosition.fromPosition(position);
 }
  protected boolean isThereOpponentPiece(Position position){
     ChessPiece p = (ChessPiece)getBoard().piece(position);
     return p != null && p.getColor() != color;
  }
}
