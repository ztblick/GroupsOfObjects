import java.util.ArrayList;

public class Deck {

    private ArrayList<Card> deck;

    public Deck() {
        deck = new ArrayList<Card>();
        for (int i = 2; i < 10; i++) {
            deck.add(new Card("Hearts", i));
        }
    }

    public void add(Card c) {
        deck.add(c);
    }

    public boolean add(Card c, int index) {
        if (index >= 0 && index < deck.size()) {
            deck.add(index, c);
            return true;
        }
        return false;
    }

    public Card draw() {
        if (deck.isEmpty()) {
            return null;
        }
        return deck.remove(0);
    }

    public static void main(String[] args) {
        // Create a Deck object
        Deck gameDeck = new Deck();

        // Create a hand of cards
        ArrayList<Card> hand = new ArrayList<Card>();

        // Get the first five Cards and add them to hand
        for (int i = 0; i < 5; i++) {
            hand.add(gameDeck.draw());
        }

        // Print your hand
        for (Card c : hand)
            System.out.println(c);

        System.out.println("~~~~~~~~");
        System.out.println(hand);
    }
}
