public class Card {
    private int val;
    private Suit suit;

    public Card (int val, Suit suit) {
        this.val = val;
        this.suit = suit;
    }

    public String getSuit () {
        return this.suit;
    }

    public int getVal () {
        return this.val;
    }

    public void setSpecialValues() {
    }
}
