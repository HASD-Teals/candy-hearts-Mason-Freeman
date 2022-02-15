import java.util.*;

public class CardClient {

  public static void main(String[] args) throws Exception {
    Deck deck1 = new Deck();
    Deck deck2 = new Deck();
    // deck1.cardCount();
    deck1.shuffle();
    deck2.shuffle();
    matchCards(deck1, deck2);

    Card Test1 = new Card("", "spades", 2, true);
    Card Test2 = new Card("", "spades", 2, true);
    // Test1.toString();
    // Test1.equals(Test2);
  }

  public static void matchCards(Deck deck1, Deck deck2) {
    int count = 0;
    for (int i = 0; i < 51; i++) {
      if (deck1.getCardAt(i).equals(deck2.getCardAt(i))) {
        System.out.println(
          "Deck 1 Card at " +
          i +
          ": (" +
          deck1.getCardAt(i) +
          ") matches Deck 2's card at " +
          i +
          " (" +
          deck2.getCardAt(i) +
          ")"
        );
        count++;
      }
    }
    System.out.println(count + " match found");
  }
}
