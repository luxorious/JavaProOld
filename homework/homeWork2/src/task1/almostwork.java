//package task1;
//
//import java.util.*;
//
//public class CardsDistribution {
//    private int numberPlayers;
//    private List<String> mixed;
//    ArrayList<Player> listOfPlayers = new ArrayList<>();
//    final String[] CARDS_DECK = {
//            "6♣️", "6♦️", "6♠️", "6♥️",
//            "7♣️", "7♦️", "7♠️", "7♥️",
//            "8♣️", "8♦️", "8♠️", "8♥️",
//            "9♣️", "9♦️", "9♠️", "9♥️",
//            "10♣️", "10♦️", "10♠️", "10♥️",
//            "J♣️", "J♦️", "J♠️", "J♥️",
//            "Q♣️", "Q♦️", "Q♠️", "Q♥️",
//            "K♣️", "K♦️", "K♠️", "K♥️",
//            "A♣️", "A♦️", "A♠️", "A♥️",
//    };
//
//    public CardsDistribution(int numberPlayers) {
//        this.numberPlayers = numberPlayers;
//    }
//
//    public CardsDistribution() {
//    }
////    1. Напишите программу, которая должна имитировать раздачу карт для игры в покер.
////    Программа получает число n, задаваемое с консоли пользователем, и раздает карты
////    на n игроков (по 5 карт каждому) из рассортированной колоды.
////    Разделяйте пять карт, выданных каждому игроку, пустой строкой.
//
//    public List<String> mixCards(){
//        this.mixed = Arrays.asList(CARDS_DECK);
//        Collections.shuffle(mixed);
//        return this.mixed;
//    }
//
//    public ArrayList<Player> distributing(){
//        mixCards();
//        int numb = 0;
//
//        for (int j = 0; j < numberPlayers; j++) {
//            String[] cardsForOnePerson = new String[5];
//            Player player = new Player();
//            player.setPlayerNumber("player " + (j + 1));
//            int l = 0;
//            for (int i = numb; i < mixed.size(); i++) {
//                numb++;
//                cardsForOnePerson[l] = this.mixed.get(i);
////                this.mixed.remove(0);
//                l+=1;
//                if (l == 0){
//                    ;
//                } else if (l%5 == 0){
//                    break;
//                }
//            }
//            player.setPlayersCard(cardsForOnePerson);
//            listOfPlayers.add(player);
//        }
//        return listOfPlayers;
//    }
//
//
//
////    public ArrayList<Player> distributing(){
////        mixCards();
////        int numb = 0;
////
////        for (int j = 0; j < numberPlayers; j++) {
////            String[] cardsForOnePerson = new String[5];
////            Player player = new Player();
////            player.setPlayerNumber("player " + (j + 1));
////            int l = 0;
////            for (int i = numb; i < mixed.size(); i++) {
////                numb++;
////                cardsForOnePerson[l] = this.mixed.get(i);
////                l+=1;
////                if (l == 0){
////                    ;
////                } else if (l%5 == 0){
////                    break;
////                }
////            }
////            player.setPlayersCard(cardsForOnePerson);
////            listOfPlayers.add(player);
////        }
////        return listOfPlayers;
////    }
//
//
//    public List<String> getMixed() {
//        return mixed;
//    }
//
//    public void setMixed(List<String> mixed) {
//        this.mixed = mixed;
//    }
//}