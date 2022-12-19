package task1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Distrib distrib = new Distrib(3);

        System.out.println(distrib.mixCards());




//        Scanner scanner = new Scanner(System.in);
//        int numberPlayers = 0;
//        while (true) {
//            try {
//                System.out.println("Enter number of players");
//                numberPlayers = scanner.nextInt();
//                if (numberPlayers > 0 && numberPlayers < 6) {
//                    break;
//                }
//            } catch (InputMismatchException e) {
//                System.out.println("Not A Number!!!!\nTry again");
//                scanner.next();
//                continue;
//            }
//        }

        CardsDistribution cards = new CardsDistribution(3);
        ArrayList <Player> arr= cards.distributing();
        for (int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i).getPlayerNumber());
            System.out.println(Arrays.toString(arr.get(i).getPlayersCard()));
            System.out.println();
        }
        System.out.println(cards.getMixed());
    }
}