public class Card {
    private int val;
    private String suitName;

    public Card (int val, String suitName) {
        this.val = val;
        this.suitName = suitName;
    }

    public String getSuitName () {
        return this.suitName;
    }

    public int getVal () {
        return this.val;
    }
}
