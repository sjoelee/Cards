/* 
 * Game interface
 * 
 * This interface should determine the type of behavior that is acceptable 
 * to a player: what are the possible actions a player can use and any special
 * values of the card that the player should be aware of.
 * - convert the values of 11(J), 12(Q), 13(K) to 10
 * - have a goal value 
 * - allowable moves
 */

import java.util.*;
//public class Blackjack implements CardGame {
public class Blackjack extends Game<Card>{
    private Deck gameDeck;//access to global set of cards. Should only be one deck for the game.
    private ArrayList<Card> hand = null;
    public void setDeck(Deck d) {
        gameDeck = d;
    }
    public void getInitHand(int number) {
        hand = new ArrayList<Card>(Arrays.asList(d.getHand(number));
    }
}
