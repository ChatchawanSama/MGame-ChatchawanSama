public class Player {
    private String name;
    private Die[] dice;
    private Board board;
    private Piece piece;

    public void takeTurn(){
        int fvTot=0;
        for(int i=0; i<dice.length; i++){
            dice[i].roll();
            fvTot+=dice[i].getFaceValue();
        }

        Square oldLoc = piece.getLocation();
        Square newLoc = board.getSquare(oldLoc, fvTot);
        piece.setLocation(newLoc);
    }



}
