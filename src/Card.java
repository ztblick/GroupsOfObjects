public class Card {

    private String suit;
    private int rank;

    public Card(String suit, int rank) {
        this.suit = suit;
        this.rank = rank;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        if (rank >= 2 && rank <= 10)
            this.rank = rank;
    }

    public String getSuit() {
        return suit;
    }

    public void setSuit(String suit) {
            this.suit = suit;
    }

    public String toString() {
        return rank + " of " + suit;
    }
}
