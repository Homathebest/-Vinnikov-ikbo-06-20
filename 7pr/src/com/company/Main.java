package com.company;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        ArrayList<Integer> Card1 = new ArrayList<>();
        ArrayList<Integer> Card2 = new ArrayList<>();

        System.out.println("Enter 5 first player cards: ");
        for (int i = 0; i < 5; i++) {
            Card1.add(SC.nextInt());
        }

        Scanner SC2 = new Scanner(System.in);
        System.out.println("Enter 5 second player cards: ");
        for (int i = 0; i < 5; i++) {
            Card2.add(SC2.nextInt());
        }

        int count = 0;
        boolean result = false;

        for (int i = 0; i < 106; i++) {
            count++;
            if (((Card1.get(0) > Card2.get(0))
                    && (Card1.get(0) != 0)
                    && (Card2.get(0) != 9)
                    && (Card1.get(0) != 9)
                    && (Card2.get(0) != 0))
                    || ((Card1.get(0) == 0)
                    && (Card2.get(0) == 9))) {
                Card1.add(Card1.get(0));
                Card1.add(Card2.get(0));
            }
            else if (((Card1.get(0) < Card2.get(0))
                    && (Card1.get(0) != 0)
                    && (Card2.get(0) != 9)
                    && (Card1.get(0) != 9)
                    && (Card2.get(0) != 0))
                    || ((Card1.get(0) == 9)
                    && (Card2.get(0) == 0))) {
                Card2.add(Card1.get(0));
                Card2.add(Card2.get(0));
            }
            Card1.remove(0);
            Card2.remove(0);
            if (Card1.size() == 0) {
                System.out.println("Winner: Second");
                System.out.println("Number of moves: " + count);
                result = true;
                break;
            }
            if (Card2.size() == 0) {
                System.out.println("Winner: First");
                System.out.println("Number of moves: " + count);
                result = true;
                break;
            }
        }
        if (!result){
            System.out.println("Tie");
        }
    }
}
