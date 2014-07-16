/*
 * Create an interface where any card game would require you to implement
 * these methods.
 * 
 * What does a card game have?
 * 1. A goal value
 * 2. An initial number of cards to begin with
 * 3. 
 */
public interface Game <T extends Card>{
    public void setInitNum(int number);
    public void setGoalValue(int value);
    public void setSpecialValues(T[], int[] values);
    public int getCurrentValue();
    public boolean isWinner();
    public boolean isLoser();
}
