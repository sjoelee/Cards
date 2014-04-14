public abstract class Player {
    private value = 0;
    private ArrayList<Card> hand = new ArrayList<Card> ();

    public int determineNextMove ();
    public void addToHand (Card c);
    private Card removeFromHand (int idx);
}
