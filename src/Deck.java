import java.util.*;
public class Deck {
  //properties
  private Card[] cardDeck;

  //cardDeck constructor
  public Deck() {
    this.cardDeck = new Card[52];
    int p = 0;
    if (p < 52) {
      for (int i = 1; i <= 4; i++) { //symbol and color
        for (int j = 1; j <= 13; j++) { //value
          if (i == 1) {
            Card Temp = new Card("red", "hearts", j, true);
            cardDeck[p] = Temp;
            p++;
          }
          if (i == 2) {
            Card Temp = new Card("red", "diamonds", j, true);
            cardDeck[p] = Temp;
            p++;
          }
          if (i == 3) {
            Card Temp = new Card("black", "spades", j, true);
            cardDeck[p] = Temp;
            p++;
          }
          if (i == 4) {
            Card Temp = new Card("black", "clubs", j, true);
            cardDeck[p] = Temp;
            p++;
          }
        }
      }
    }
  }

  public Card[] startcardDeck() {
    for (int i = 0; i < 52; i++) {
      Card Temp = new Card("Red", "Heart", 1, true);
      cardDeck[i] = Temp;
    }
    return this.cardDeck;
  }

  public int cardCount() {
    int count = 0;
    count = this.cardDeck.length;
    //System.out.println(this.cardDeck);
    return count;
  }

  public Card getCardAt(int x) {
    Card Temp = this.cardDeck[x];
    Temp.toString();
    return Temp;
  }

  public void shuffle(){
    List<Card> Temp = Arrays.asList(this.cardDeck);
    Collections.shuffle(Temp);
    Temp.toArray(this.cardDeck);
  }
}
