public class BlackjackPlayer extends Player implements Blackjack {
    public void addToHand (Card c) {
        hand.add(c);
    }

    private int interpretCard (int val) {
        switch (val) {
        case 11:
        case 12:
        case 13:
            return 10;
            break;
        default:
            break;
        }
        return val;
    }

    public void determineNextMove () {

    }
}
