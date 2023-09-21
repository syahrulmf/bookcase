package interfaces;

import java.util.HashMap;

public interface InterfaceCommercialBook extends InterfacePrice {
  HashMap<String, Double> RATES_RATING_NOVELIS = new HashMap<String, Double>() {{
    put("NEW COMMER", 1.25);
    put("GOOD", 1.35);
    put("BEST SELLER", 1.5);
    put("VERY GOOD", 1.4);
  }};

  Double RATES_E_BOOK = 1.2;

  HashMap<String, Double> RATES_RATING_MANGAKA_WITH_SERIES = new HashMap<String, Double>() {{
    put("NEW COMMER", 1.35);
    put("GOOD", 1.45);
    put("BEST SELLER", 1.5);
  }};

  HashMap<String, Double> RATES_RATING_MANGAKA_WITH_NO_SERIES = new HashMap<String, Double>() {{
    put("NEW COMMER", 1.25);
    put("GOOD", 1.30);
    put("BEST SELLER", 1.4);
  }};
}
