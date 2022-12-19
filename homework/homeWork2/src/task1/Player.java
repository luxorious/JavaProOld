package task1;

import java.util.Arrays;

public class Player extends CardsDistribution{
//    private List<String> playersCard;
    private String playerNumber;

    public String getPlayerNumber() {
        return playerNumber;
    }

    public void setPlayerNumber(String playerNumber) {
        this.playerNumber = playerNumber;
    }

    private String[] playersCard = new String[5];

    private int cards;

    public Player(int numberPlayers) {
        super(numberPlayers);
    }

    public Player() {
    }

    public String[] getPlayersCard() {
        return playersCard;
    }

    public void setPlayersCard(String[] playersCard) {
        this.playersCard = playersCard;
    }

    @Override
    public String toString() {
        return "Player{" +
                "playerNumber='" + playerNumber + '\'' +
                ", playersCard=" + Arrays.toString(playersCard) +
                '}';
    }

}
