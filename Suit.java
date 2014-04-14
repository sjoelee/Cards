import java.util.*;
import java.io.IOException;

public class Suit {
    private String name;
    private int numCards;
    private ArrayList<Card> cards = new ArrayList<Card>();

    public Suit(String name, int numCards) {
        int idx;

        try {
            setName(name);
            setNumCards(numCards);

            /* Create an array of cards of the same suit */
            for (idx = 1; idx <= this.numCards; idx++) {
                cards.add(new Card(idx, this.name));
            }
        } catch (IOException emp) {
            System.out.println("Empty name");
        }
    }

    public ArrayList<Card> getCards() {
        if (cards.isEmpty()) {
            System.out.println("ArrayList cards is empty");
        }
        return cards;
    }

    public void setName (String name) throws IOException {
        if (name.isEmpty()) {
            throw new IOException("Empty name!");
        } else {
            this.name = name;
        }
    }

    public void setNumCards (int numCards) {
        if (numCards > 0) {
            this.numCards = numCards;
        } else {
            System.out.println("Number of cards specified is nonpositive");
        }
    }

    public void printCards () {
        if (cards.isEmpty()) {
            System.out.println("Nothing to print");
        } else {
            for (Card c : cards) {
                System.out.println(c.getSuitName() + " " + c.getVal());
            }
        }
    }
}
