package models;

import abstracts.CommercialBook;

public class EBook extends CommercialBook {
  public EBook(String bookCode, String title, Author author, Publisher publisher, int price) {
    super(bookCode, title, author, publisher, price);
    calculatePrice();
  }

  public EBook() {
  }

  @Override
  public void calculatePrice() {
    double totalPrice = getPublisher().getProductionCost() * RATES_E_BOOK;
    setPrice(totalPrice);
  }
}
