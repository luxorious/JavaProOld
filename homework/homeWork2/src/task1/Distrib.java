package task1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Distrib {
    private int players;

    final String[] CARDS_DECK = {
            "6♣️", "6♦️", "6♠️", "6♥️",
            "7♣️", "7♦️", "7♠️", "7♥️",
            "8♣️", "8♦️", "8♠️", "8♥️",
            "9♣️", "9♦️", "9♠️", "9♥️",
            "10♣️", "10♦️", "10♠️", "10♥️",
            "J♣️", "J♦️", "J♠️", "J♥️",
            "Q♣️", "Q♦️", "Q♠️", "Q♥️",
            "K♣️", "K♦️", "K♠️", "K♥️",
            "A♣️", "A♦️", "A♠️", "A♥️",
    };

    String[][] userCard = new String[players][5];

    public Distrib(int players) {
        this.players = players;
    }

    public List<String> mixCards(){
        String[] arr = Arrays.asList(CARDS_DECK);
        Collections.shuffle(arr);
        return arr;
    }
}
