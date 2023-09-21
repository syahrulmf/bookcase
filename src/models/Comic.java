package models;

import abstracts.TaxCommercialBook;

public class Comic extends TaxCommercialBook {
  private boolean isVolumeSeries;

  public Comic(String bookCode, String title, Mangaka author, Publisher publisher, int price, double tax, boolean isVolumeSeries) {
    super(bookCode, title, author, publisher, price, tax);
    this.isVolumeSeries = isVolumeSeries;
    calculatePrice();
    calculateTax();
  }

  public Comic() {
  }

  @Override
  public void calculateTax() {
    double totalTax = RATES_TAX * getPrice();
    setTax(totalTax);
  }

  @Override
  public void calculatePrice() {
    double rates = 0;
    double result = 0;

    if (isVolumeSeries) {
      rates = RATES_RATING_MANGAKA_WITH_SERIES.get(((Mangaka)getAuthor()).getRating().toUpperCase());
    }else {
      rates = RATES_RATING_MANGAKA_WITH_NO_SERIES.get(((Mangaka)getAuthor()).getRating().toUpperCase());
    }

    result = rates * getPublisher().getProductionCost();

    setPrice(result);
  }

  public boolean isVolumeSeries() {
    return isVolumeSeries;
  }

  public void setVolumeSeries(boolean volumeSeries) {
    this.isVolumeSeries = volumeSeries;
  }
}
