public class Board {
    private Square[] squares;
    public Square getSquare(Square location, int step){
        //I design without UML because it doesn't have in UML
        Square newLoc = new Square();
        for(int i=0; i<squares.length;i++){
            if( squares[i]==location){
                newLoc = squares[i+step];
                break;
            }
        }
        return newLoc;
    }
}
