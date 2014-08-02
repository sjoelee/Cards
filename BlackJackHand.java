public class BlackJackHand extends Hand <BlackJackCard> {
    /* 
     * Multiple ways to get score
     */
    public int score() {
        ArrayList<Integer> scores = possibleScores();
        int maxUnder = Integer.MIN_VALUE;
        int minOver = Integer.MaX_VALUE;

        /* 
         * Based on the list of scores you have, set the boundaries for the 
         * scores accordingly.
         */
        for (int score : scores) {
            if (score > 21 && score < minOver) {
                minOver = score;
            } else if (score <= 21 && score > maxUnder) {
                maxUnder = score;
            }
        }
        return maxUnder == Integer.MIN_VALUE ?  minOver : maxUnder;
    }

    private ArrayList<Integer> possibleScores() {
        ArrayList<Integer> scores = new ArrayList<Integer>();
        if (cards.size() == 0) {
            return scores;
        }
        for (BlackJackCard card : cards) {
            addCardToScoreList(card, scores);
        }
        return scores;
    }

    private void addCardToScoreList (BlackJackCard card, ArrayList<Integer> scores) {
        if (scores.size() == 0) {
            scores.add(0);
        }
        int length = scores.size();
        for (int i = 0; i < length; i++) {
            int score = scores.get(i);
            scores.set(i, score + card.minValue());
            if (card.minValue() != card.maxValue()) {
                scores.add(score + card.maxValue());
            }
        }
    }

    public boolean busted () {
        return score() > 21;
    }

    public boolean is21 () {
        return score() == 21;
    }
}
