public class DeckTest {
    public static void main (String [] args) {
        String[] suitNames = new String[4];
        suitNames[0] = "Clubs";
        suitNames[1] = "Diamonds";
        suitNames[2] = "Hearts";
        suitNames[3] = "Spades";
        
        int numCardsPerSuit = 13;
        int numSuits = 4;

        Deck typDeck = new Deck(numSuits, numCardsPerSuit, suitNames);
        typDeck.printDeck();
        typDeck.shuffle();
        typDeck.printDeck();
        typDeck.peekTop();
        Card c = typDeck.dealCard();
        typDeck.peekTop();
        System.out.println(typDeck.getNumCardsLeft());
    }
}
