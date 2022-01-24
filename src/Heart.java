import javax.naming.SizeLimitExceededException;

public class Heart {
  // PROPERTIES
  private String color;
  private String size;
  private int calories;
  private double cost;
  private boolean available;
  private int stock;

  //Add remaining heart properties here...

  // CONSTRUCTORS
  public Heart() { // This is the default contructor
    this.color = "";
    this.setSize("");
    this.setCalories(0);
    this.setCost(0.0);
    this.setAvailable(false);
    this.setStock(0);
  }

  //Add overloaded Constructor here...
  public Heart(
    String color,
    String size,
    int calories,
    double cost,
    boolean available,
    int stock
  ) {
    this.color = color;
    this.setSize(size);
    this.setCalories(calories);
    this.setCost(cost);
    this.setAvailable(available);
    this.setStock(stock);
  }

  // ACCESSORS
  public String getColor() {
    return color;
  }

  public int getStock() {
    return stock;
  }

  public boolean isAvailable() {
    return available;
  }

  public double getCost() {
    return cost;
  }

  public int getCalories() {
    return calories;
  }

  public String getSize() {
    return size;
  }

  //Add remaining Accessor methods here...

  // MUTATORS
  public void setColor(String color) {
    this.color = color;
  }

  public void setSize(String size) {
    this.size = size;
  }

  public void setCalories(int calories) {
    this.calories = calories;
  }

  public void setCost(double cost) {
    this.cost = cost;
  }

  public void setAvailable(boolean available) {
    this.available = available;
  }

  public void setStock(int stock) {
    this.stock = stock;
  }

  //Add remaining Mutator methods here...

  public void adjPrice(double percentage){
      this.cost = this.cost * (1+percentage);
  }
  // METHODS
  public String report() {
    return this.color + "\n"; // Add other properties here as you add them to the class
  }
  //Write other methods here (if needed)...
}
git config --global user.name "Mason.Freeman0705"