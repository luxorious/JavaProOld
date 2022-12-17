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

//    public List<String> getPlayersCard() {
//        return playersCard;
//    }
//
//    public void setPlayersCard(List<String> playersCard) {
//        this.playersCard = playersCard;
//    }


    public int getCards() {
        return cards;
    }

    public void setCards(int cards) {
        this.cards = cards;
    }


}
