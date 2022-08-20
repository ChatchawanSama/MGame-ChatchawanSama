public class MGame {
    private int roundCnt;
    private Die[] dice;
    private Player[] players;
    private Board board;

    private static final int N = 20;

    public void playGame(int roundCut){
        for(roundCnt=0;roundCnt<N;roundCnt++){
            playRound();
        }

    }

    private void playRound(){
        for(int i=0; i<players.length; i++){
            players[i].takeTurn();
        }
    }
}
