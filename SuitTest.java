import java.io.IOException;

public class SuitTest {
    public static void main (String [] args) {
        Suit s = new Suit("", 13);
        s.printCards();
        s = new Suit("Clubs", 13);
        s.printCards();
        s = new Suit("Clubs", 0);
        s.printCards();
        s = new Suit("Hearts", 13);
        s.printCards();
    }
}
