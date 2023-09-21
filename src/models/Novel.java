package models;

import abstracts.CommercialBook;

public class Novel extends CommercialBook {
  private String genre;

  public Novel(String bookCode, String title, Novelis author, Publisher publisher, int price, String genre) {
    super(bookCode, title, author, publisher, price);
    this.genre = genre;
    calculatePrice();
  }

  public Novel() {
  }

  @Override
  public void calculatePrice() {
    double rates = RATES_RATING_NOVELIS.get(((Novelis)getAuthor()).getRating().toUpperCase());
    double result = rates * getPublisher().getProductionCost();
    setPrice(result);
  }


  public String getGenre() {
    return genre;
  }

  public void setGenre(String genre) {
    this.genre = genre;
  }
}
