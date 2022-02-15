import javax.naming.SizeLimitExceededException;

public class Card {
  // PROPERTIES
  private String color;
  private String symbol;
  private int value;
  private boolean playable;

  // CONSTRUCTORS
  public Card() { // This is the default contructor
    this.setColor("");
    this.symbol = " ";
    this.value = (0);
    this.playable = false;
  }

  public boolean isPlayable() {
    return playable;
  }

  public void setPlayable(boolean playable) {
    this.playable = playable;
  }

  public int getValue() {
    return value;
  }

  public void setValue(int value) {
    this.value = value;
  }

  public String getSymbol() {
    return symbol;
  }

  public void setSymbol(String symbol) {
    this.symbol = symbol;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  //Add overloaded Constructor here...
  public Card(String color, String symbol, int value, boolean playable) {
    this.setColor(color);
    this.setSymbol(symbol);
    this.setValue(value);
    this.setPlayable(playable);
  }

  // METHODS
  public String toString() {
    String cardProfile = "";
    if (this.value > 1 && this.value < 11) {
      cardProfile = (this.value) + " of " + (this.symbol);
    }
    if (this.value == 1) {
      cardProfile = "Ace of " + (this.symbol);
    }
    if (this.value == 11) {
      cardProfile = "Jack of " + (this.symbol);
    }
    if (this.value == 12) {
      cardProfile = "Queen of " + (this.symbol);
    }
    if (this.value == 13) {
      cardProfile = "King of " + (this.symbol);
    }
    return cardProfile;
  }

  public boolean equals(Card cardCompare) {
    boolean equals = false;
    int count = 0;
    //count = 3 if all properties are equal
    if (cardCompare.getSymbol() == this.symbol) count += 1;
    if (cardCompare.getColor() == this.color) count += 1;
    if (cardCompare.getValue() == this.value) count += 1;
    
    if (count == 3) equals = true; else equals = false;
    return equals;
  }
}
