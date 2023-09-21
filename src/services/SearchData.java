package services;

import abstracts.CommercialBook;
import models.Author;
import models.Mangaka;
import models.Novelis;
import models.Publisher;

import java.util.*;

public class SearchData {
//  Author
  public static List<Author> getAllMangaka(List<CommercialBook> listAllBook) {
    List<Author> listMangaka = new ArrayList<Author>();

    // validate and filtering data
    for (CommercialBook book : listAllBook) {
      if (book.getAuthor() instanceof Mangaka) {
        if (!(listMangaka.contains(book.getAuthor()))) {
          listMangaka.add(book.getAuthor());
        }
      }
    }
    return listMangaka;
  }

  public static List<Author> getAllNovelis(List<CommercialBook> listAllBook) {
    List<Author> listNovelis = new ArrayList<Author>();

    // validate and filtering data
    for (CommercialBook book : listAllBook) {
      if (book.getAuthor() instanceof Novelis) {
        if (!(listNovelis.contains(book.getAuthor()))) {
          listNovelis.add(book.getAuthor());
        }
      }
    }
    return listNovelis;
  }

  public static List<Author> getAllAuthor(List<CommercialBook> listAllBook) {
    List<Author> listAuthor = new ArrayList<Author>();

    // validate and filtering data
    for (CommercialBook book : listAllBook) {
      if (!(listAuthor.contains(book.getAuthor()))) {
        listAuthor.add(book.getAuthor());
      }
    }
    return listAuthor;
  }

  public static List<Author> getAllAuthorByAge(List<CommercialBook> listAllBook, int age){
    List<Author> listAuthor = new ArrayList<Author>();

    // validate and filtering data
    for(Author author : getAllAuthor(listAllBook)) {
      if (author.getAge() <= age) {
        listAuthor.add(author);
      }
    }

    return listAuthor;
  }

  public static List<Author> getAllAuthorByCountry(List<CommercialBook> listAllBook, String country){
    List<Author> listAuthor = new ArrayList<Author>();

    // validate and filtering data
    for(Author author : getAllAuthor(listAllBook)) {
      if (author.getCountry().equalsIgnoreCase(country)) {
        listAuthor.add(author);
      }
    }

    return listAuthor;
  }

  //  Publisher
  public static List<Publisher> getAllPublisher(List<CommercialBook> listAllBook) {
    List<Publisher> listPublisher = new ArrayList<Publisher>();

    for (CommercialBook book : listAllBook) {
      if (!(listPublisher.contains(book.getPublisher()))) {
        listPublisher.add(book.getPublisher());
      }
    }

    return listPublisher;
  }

  public static Publisher getPublisherByFilter(List<CommercialBook> listAllBook, String filter) {
    List<Double> listProductionCost = new ArrayList<Double>();
    Publisher result = new Publisher();
    double minmax = 0;

    for (Publisher publisher : getAllPublisher(listAllBook)) {
      listProductionCost.add(publisher.getProductionCost());
    }

    if (filter.equalsIgnoreCase("Termahal")) {
      minmax = Collections.max(listProductionCost);
    } else if (filter.equalsIgnoreCase("Termurah")) {
      minmax = Collections.min(listProductionCost);
    }

    for (Publisher publisher : getAllPublisher(listAllBook)) {
      if (publisher.getProductionCost() == minmax) {
        result = publisher;
      }
    }

    return result;
  }

  // Book
  public static List<CommercialBook> getBookByFilter(List<CommercialBook> listAllBook, String filter) {
    List<Double> listPrice = new ArrayList<Double>();
    List<CommercialBook> result = new ArrayList<CommercialBook>();
    double minmax = 0;

    for (CommercialBook book : listAllBook) {
      listPrice.add(book.getPrice());
    }

    if (filter.equalsIgnoreCase("Termahal")) {
      minmax = Collections.max(listPrice);
    } else if (filter.equalsIgnoreCase("Termurah")) {
      minmax = Collections.min(listPrice);
    }

    for (CommercialBook book : listAllBook) {
      if (book.getPrice() == minmax) {
        result.add(book);
      }
    }

    return result;
  }

  public static List<CommercialBook> getAllBookByPrice(List<CommercialBook> listAllBook, double rangePrice){
    List<CommercialBook> listBook = new ArrayList<CommercialBook>();

    // validate and filtering data
    for (CommercialBook book : listAllBook) {
      if (book.getPrice() <= rangePrice) {
        listBook.add(book);
      }
    }

    return listBook;
  }

  public static List<CommercialBook> getAllComic(List<CommercialBook> listAllBook) {
    List<CommercialBook> listComic = new ArrayList<CommercialBook>();

    for (CommercialBook book : listAllBook) {
      if (book.getAuthor() instanceof Mangaka) {
        listComic.add(book);
      }
    }

    return listComic;
  }
  public static List<CommercialBook> getAllComicByMangakaRating(List<CommercialBook> listAllBook, String rating){
    List<CommercialBook> listComic = new ArrayList<CommercialBook>();

    // validate and filtering data
    for (CommercialBook comic : getAllComic(listAllBook)) {
        if (((Mangaka) comic.getAuthor()).getRating().equalsIgnoreCase(rating)) {
          listComic.add(comic);
        }
    }

    return listComic;
  }

  public static List<CommercialBook> getAllBookByPublisherCountry(List<CommercialBook> listAllBook, String country){
    List<CommercialBook> listBook = new ArrayList<CommercialBook>();

    // validate and filtering data
    for (CommercialBook book : listAllBook) {
      if (book.getPublisher().getCountry().equalsIgnoreCase(country)) {
          listBook.add(book);
      }
    }

    return listBook;
  }

  public static List<CommercialBook> getAllBookByAuthorCountry(List<CommercialBook> listAllBook, String country){
    List<CommercialBook> listBook = new ArrayList<CommercialBook>();

    // validate and filtering data
    for (CommercialBook book : listAllBook) {
      if (book.getAuthor().getCountry().equalsIgnoreCase(country)) {
          listBook.add(book);
      }
    }

    return listBook;
  }

  public static List<CommercialBook> getComicMostExpensive(List<CommercialBook> listAllBook) {
    List<Double> listPrice = new ArrayList<Double>();
    List<CommercialBook> result = new ArrayList<CommercialBook>();
    double max = 0;

    for (CommercialBook book : getAllComic(listAllBook)) {
        listPrice.add(book.getPrice());
    }

    max = Collections.max(listPrice);

    for (CommercialBook comic : getAllComic(listAllBook)) {
      if (comic.getPrice() == max) {
        result.add(comic);
      }
    }

    return result;
  }

}
