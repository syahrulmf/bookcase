package abstracts;

import interfaces.InterfaceCommercialBook;
import models.Author;
import models.Publisher;

public class CommercialBook extends Book implements InterfaceCommercialBook {
  private double price;

  public CommercialBook(String bookCode, String title, Author author, Publisher publisher, double price) {
    super(bookCode, title, author, publisher);
    this.price = price;
  }

  public CommercialBook() {
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  @Override
  public void calculatePrice() {

  }
}
