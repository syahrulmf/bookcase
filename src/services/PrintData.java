package services;

import abstracts.CommercialBook;
import models.Author;
import models.Mangaka;
import models.Novelis;
import models.Publisher;

import java.util.List;

public class PrintData {
  public static void printDataAuthor(List<Author> listData, String title) {
    int number = 1;
    String formatTabel = "| %-3s | %-12s | %-5s | %-19s | %-12s |%n";

    System.out.println("===================================================================");
    System.out.format("| %-63s |%n", title);
    System.out.println("===================================================================");
    System.out.printf(formatTabel, "No", "Country", "Age", "Name", "Rating");
    System.out.println("===================================================================");

    // iterates over the list
    for(Author data: listData){
      String rating = "";
      if (data instanceof Mangaka) {
        rating = ((Mangaka)data).getRating();
      }else if (data instanceof Novelis) {
        rating = ((Novelis)data).getRating();
      }else {
        rating = "-";
      }
      System.out.format(formatTabel, number, data.getCountry(), data.getAge(), data.getFullName(), rating);
      number++;
    }
    System.out.println("===================================================================");
  }

  public static void printDataPublisher(Publisher data, String title) {
    int number = 1;
    String formatTabel = "| %-3s | %-22s | %-9s | %-16s |%n";

    System.out.println("===============================================================");
    System.out.format("| %-59s |%n", title);
    System.out.println("===============================================================");
    System.out.printf(formatTabel, "No", "Publisher Name", "Country", "Production Cost");
    System.out.println("===============================================================");
    System.out.format(formatTabel, number, data.getPublisherName(), data.getCountry(),  String.format("%.1f", data.getProductionCost()));
    System.out.println("===============================================================");
  }

  public static void printDataBook(List<CommercialBook> listData, String title) {
    int number = 1;
    String formatTabel = "| %-3s | %-12s | %-55s | %-19s | %-24s | %-6s |%n";

    System.out.println("==========================================================================================================================================");
    System.out.format("| %-134s |%n", title);
    System.out.println("==========================================================================================================================================");
    System.out.printf(formatTabel, "No", "Book Code", "Title", "Author", "Publisher", "Price");
    System.out.println("==========================================================================================================================================");

    // iterates over the list
    for (CommercialBook data : listData) {
      System.out.format(formatTabel, number, data.getBookCode(), data.getTitle(), data.getAuthor().getFullName(), data.getPublisher().getPublisherName(), String.format("%.1f", data.getPrice()));

      number++;
    }

    System.out.println("==========================================================================================================================================");
  }

  public static void printMenu(String title, String[] listMenu) {
    int number = 1;
    String formatTabel = "| %-3s | %-48s |%n";
    System.out.println(title);
    System.out.println("==========================================================");
    System.out.printf(formatTabel, "No", "Menu");
    System.out.println("==========================================================");

    for (String menu : listMenu) {
      if (number == listMenu.length) {
        System.out.printf(formatTabel, 0, menu);
      }else {
        System.out.printf(formatTabel, number, menu);
      }
      number++;
    }
    System.out.println("==========================================================");
  }
}
