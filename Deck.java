import java.util.*;

public class Deck {
    /* What does a deck of cards contain?
     *  1. Number of suits
     *  2. Number of cards in each suit
     *  3. And range of numbers
     */

    /* You need an array of cards to provide shuffling */
    private int numSuits;
    private int numCards;
    private int lowerBound;
    private int upperBound;
    private int numCardsPerSuit;
    private ArrayList<Suit> arrSuit;
    private Card[] arrCard;
    private List<Card> arrCardList;

    public Deck (int numSuits, int numCardsPerSuit, String[] names) {
        arrSuit = new ArrayList<Suit>();
        int idx;

        /* Set instance variables and create local array of reference vars
         * to deck of cards */
        setNumSuits(numSuits);
        setNumCardsPerSuit(numCardsPerSuit);
        arrCard = new Card[numCards];
        int cardCount = 0;
        for (idx = 0; idx < numSuits; idx++) {
            arrSuit.add(new Suit(names[idx], numCardsPerSuit));
            for (Card c : arrSuit.get(idx).getCards()) {
                arrCard[cardCount] = c;
                cardCount++;
            }
        }
        /* IMPORTANT: This does not create another ArrayList, but uses 
         * java.util.Array.ArrayList (not java.util.ArrayList) and creates a
         * list view of the original array. Hence return type is List. NEAT!
         */
        arrCardList = Arrays.asList(arrCard);
    }

    public void setNumCardsPerSuit (int numCardsPerSuit) {
        if (numCardsPerSuit > 0) {
            this.numCardsPerSuit = numCardsPerSuit;
            this.numCards = this.numCardsPerSuit * this.numSuits;
        } else {
            System.out.println("Number of cards per suit is nonpositive");
        }
    }

    public void setNumSuits (int numSuits) {
        if (numSuits > 0) {
            this.numSuits = numSuits;
        } else {
            System.out.println("Number of suits is nonpositive");
        }
    }

    public Card dealCard () {
        return arrCardList.remove(0);
    }

    public void printDeck () {
        for (Card c : arrCard) {
            System.out.println(c.getSuitName() + " " + c.getVal());
        }
    }

    /* 
     *  Will use Collections method shuffle which takes an argument type of List.
     * Exploit polymorphism when needed ;)
     */

    public void peekTop () {
        Card c = arrCardList.get(0);
        System.out.println("Top of deck: " + c.getSuitName() + " " + c.getVal());
    }

    public void shuffle () {
        Collections.shuffle(arrCardList);
    }
}
