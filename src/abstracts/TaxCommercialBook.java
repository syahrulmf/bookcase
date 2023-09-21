package abstracts;

import interfaces.InterfaceTax;
import models.Author;
import models.Publisher;

public abstract class TaxCommercialBook extends CommercialBook implements InterfaceTax {
  private double tax;

  public TaxCommercialBook(String bookCode, String title, Author author, Publisher publisher, int price, double tax) {
    super(bookCode, title, author, publisher, price);
    this.tax = tax;
  }

  public TaxCommercialBook() {
  }

  public double getTax() {
    return tax;
  }

  public void setTax(double tax) {
    this.tax = tax;
  }

}