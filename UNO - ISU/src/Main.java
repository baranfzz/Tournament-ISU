import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> shuffledDeck = new ArrayList<String>();
        ArrayList<String> deck = new ArrayList<String>();
        ArrayList<String> player1 = new ArrayList<String>();
        ArrayList<String> player2 = new ArrayList<String>();
        deck.add("0R");
        deck.add("1R");
        deck.add("1R");
        deck.add("2R");
        deck.add("2R");
        deck.add("3R");
        deck.add("3R");
        deck.add("4R");
        deck.add("4R");
        deck.add("5R");
        deck.add("5R");
        deck.add("6R");
        deck.add("6R");
        deck.add("7R");
        deck.add("7R");
        deck.add("8R");
        deck.add("8R");
        deck.add("9R");
        deck.add("9R");
        deck.add("Draw 2 R");
        deck.add("Draw 2 R");
        deck.add("Skip R");
        deck.add("Skip R");
        deck.add("0B");
        deck.add("1B");
        deck.add("1B");
        deck.add("2B");
        deck.add("2B");
        deck.add("3B");
        deck.add("3B");
        deck.add("4B");
        deck.add("4B");
        deck.add("5B");
        deck.add("5B");
        deck.add("6B");
        deck.add("6B");
        deck.add("7B");
        deck.add("7B");
        deck.add("8B");
        deck.add("8B");
        deck.add("9B");
        deck.add("9B");
        deck.add("Draw 2 B");
        deck.add("Draw 2 B");
        deck.add("Skip B");
        deck.add("Skip B");
        deck.add("0G");
        deck.add("1G");
        deck.add("1G");
        deck.add("2G");
        deck.add("2G");
        deck.add("3G");
        deck.add("3G");
        deck.add("4G");
        deck.add("4G");
        deck.add("5G");
        deck.add("5G");
        deck.add("6G");
        deck.add("6G");
        deck.add("7G");
        deck.add("7G");
        deck.add("8G");
        deck.add("8G");
        deck.add("9G");
        deck.add("9G");
        deck.add("Draw 2 G");
        deck.add("Draw 2 G");
        deck.add("Skip G");
        deck.add("Skip G");
        deck.add("0Y");
        deck.add("1Y");
        deck.add("1Y");
        deck.add("2Y");
        deck.add("2Y");
        deck.add("3Y");
        deck.add("3Y");
        deck.add("4Y");
        deck.add("4Y");
        deck.add("5Y");
        deck.add("5Y");
        deck.add("6Y");
        deck.add("6Y");
        deck.add("7Y");
        deck.add("7Y");
        deck.add("8Y");
        deck.add("8Y");
        deck.add("9Y");
        deck.add("9Y");
        deck.add("Draw 2 Y");
        deck.add("Draw 2 Y");
        deck.add("Skip Y");
        deck.add("Skip Y");
        deck.add("Wild Card");
        deck.add("Wild Card");
        deck.add("Wild Card");
        deck.add("Wild Card");
        deck.add("Wild Draw 4");
        deck.add("Wild Draw 4");
        deck.add("Wild Draw 4");
        deck.add("Wild Draw 4");
        for (int i = 0; i < deck.toArray().length; i++) {
            i = (int) (Math.random() * (100 - 1 + 1) + 1);
            String newCard = deck.get(i);
            shuffledDeck.add(newCard);
        }
        for (int i = 0; i < 7; i++) {
            shuffledDeck.remove(i);
            player1.add(shuffledDeck.get(i));
        }
        for (int i = 0; i < 7; i++) {
            shuffledDeck.remove(i);
            player2.add(shuffledDeck.get(i));
        }
        if (player1.contains(shuffledDeck.get(0))) {
            System.out.println("Place your card");

            player1.get();
        }
    }
}