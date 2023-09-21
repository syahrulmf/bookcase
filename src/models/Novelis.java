package models;

public class Novelis extends Author {
  private String rating;
  private boolean serial;

  public Novelis(String firstName, String lastName, String country, int age, String rating, boolean serial) {
    super(firstName, lastName, country, age);
    this.rating = rating;
    this.serial = serial;
  }

  public Novelis() {
  }

  public boolean isSerial() {
    return serial;
  }

  public void setSerial(boolean serial) {
    this.serial = serial;
  }

  public String getRating() {
    return rating;
  }

  public void setRating(String rating) {
    this.rating = rating;
  }
}
