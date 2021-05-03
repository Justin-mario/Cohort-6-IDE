package javaClass;

public class DeckOfCards {
    public static void main(String[] args) {
        int[] deck = new int[53];
        String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
        String[] ranks= {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};

        for(int counter = 0; counter < deck.length; counter++){
            deck[counter] = counter;
        }

        for (int counter = 0; counter < deck.length; counter++){
            int index = (int)(Math.random () * deck.length);
            int temp = deck[counter];
            deck[counter] = deck[index];
            deck[index] = temp;
        }

        for (int counter = 0; counter < 4; counter++){
            String suit = suits[deck[counter] / 13];
            String rank = ranks[deck[counter] % 13];
            System.out.println ("Card No:\t" + deck[counter] + "\t:\t" + rank + "\tOf\t" + suit);
        }
    }
}
