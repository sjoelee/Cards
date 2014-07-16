/*
 * Implement a deck of cards for Blackjack
 */
import java.util.*;

public class Deck <T extends Card> {
    /* What does a deck of cards contain?
     *  1. Number of suits
     *  2. Number of cards in each suit
     *  3. And range of numbers
     */

    /* You need an array of cards to provide shuffling */
    private int numSuits;
    private int numCards;
    private int numCardsPerSuit;
    private ArrayList<T> cards;
    private int cardsIndex = 0;
    private boolean isShuffled = false;

    public Deck (int numSuits, int numCardsPerSuit, String[] suitNames) {
        cards = new ArrayList<T>();
        int idx;

        /* 
         * Set instance variables and create local array of reference vars
         * to deck of cards 
         */
        this.numCards = numSuits * numCardsPerSuit;
        this.numSuits = numSuits;
        this.numCardsPerSuit = numCardsPerSuit;

        for (idx = 0; idx < numSuits; idx++) {
            arrSuit.add(new Suit(names[idx], numCardsPerSuit));
            for (Card c : arrSuit.get(idx).getCards()) {
                cards.add(c);
            }
        }
    }

    public T dealCard () {
        return cards.get(cardsIndex++);
    }

    public T[] dealHand(int number) {
        T[] hand = new T[number];
        return hand;
    }

    public int getNumCardsLeft () {
        return this.numCards - cardsIndex;
    }

    public void printDeck () {
        for (T c : cards) {
            System.out.println(c.getSuitName() + " " + c.getVal());
        }
    }

    /* 
     * Will use Collections method shuffle which takes an argument type of List.
     * Exploit polymorphism when needed ;)
     */

    public void peekTop () {
        T c = cards.get(0);
        System.out.println("Top of deck: " + c.getSuitName() + " " + c.getVal());
    }

    public void shuffle () {
    }

    public void shuffleColl () {
        Collections.shuffle(cards);
    }
}
