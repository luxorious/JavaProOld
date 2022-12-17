import java.util.*;

public class CardsDistribution {
    private int numberPlayers;
    private List<String> mixed;
    ArrayList<Player> listOfPlayers = new ArrayList<>();
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

    public CardsDistribution(int numberPlayers) {
        this.numberPlayers = numberPlayers;
    }

    public CardsDistribution() {
    }
//    1. Напишите программу, которая должна имитировать раздачу карт для игры в покер.
//    Программа получает число n, задаваемое с консоли пользователем, и раздает карты
//    на n игроков (по 5 карт каждому) из рассортированной колоды.
//    Разделяйте пять карт, выданных каждому игроку, пустой строкой.



    public List<String> mixCards(){
        this.mixed = Arrays.asList(CARDS_DECK);
        Collections.shuffle(mixed);
        this.mixed.toArray();
//        for (int i = 0; i < mixed.size(); i++) {
//            System.out.println(mixed.get(i));
//        }
        return this.mixed;
    }
    public ArrayList<Player> distributing(){
        mixCards();
        int numb = 0;
        String[] cardsForOnePerson = new String[5];
        for (int j = 0; j < numberPlayers; j++) {
            Player player = new Player();
            player.setPlayerNumber("player " + (j + 1));
            System.out.println("прохід " + j);
            int l = 0;
            for (int i = numb; i < mixed.size(); i++) {
                System.out.println("etre " + l);
                numb++;
                cardsForOnePerson[l] = this.mixed.get(i);
                System.out.println(this.mixed.get(i));
                l+=1;
                if (l == 0){
                    ;
                } else if (l%5 == 0){
                    break;
                }
            }
            //чомусь додає у всі масиви дані з останнього проходу.
            System.out.println(Arrays.toString(cardsForOnePerson));
            System.out.println(l);
            player.setPlayersCard(cardsForOnePerson);
            listOfPlayers.add(player);
        }
        for(Player name:listOfPlayers) {
            System.out.println(name.getPlayerNumber());
            System.out.println(Arrays.toString(name.getPlayersCard()));
        }
        System.out.println(this.mixed);
        return listOfPlayers;
    }


    public List<String> getMixed() {
        return mixed;
    }
}

// як циклом створити потрібну кількість гравців?