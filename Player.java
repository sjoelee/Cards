/* public abstract class Player { */
/*     private targetValue = 0; */
/*     private ArrayList<Card> hand = new ArrayList<Card> (); */

/*     public int determineNextMove (); */
/*     public void addToHand (Card c); */
/*     private Card removeFromHand (int idx); */
/* } */

public class Player {
    private targetValue = 21;
    private currValue = 0;

    private ArrayList<Card> hand = new ArrayList<Card> ();
    
    public void decideMove () {
        if (currValue < targetValue) {
            hitMe();
        } else {
            pass();
        }
    }

    /* This doesn't make sense. How does the player obtain the Card c? */
    /* If a player decides on "hitMe" that should tell the dealer or computer
      to extract the card from the top of the deck and hand it to the player*/
    public void hitMe (Card c) {
        currValue += c.val;
    }

    public void pass () {
        return;
    }

    public int print
}
