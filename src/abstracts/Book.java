package abstracts;

import models.Author;
import models.Publisher;

public abstract class Book {
  private String bookCode;
  private String title;
  private Author author;
  private Publisher publisher;

  public Book(String bookCode, String title, Author author, Publisher publisher) {
    this.bookCode = bookCode;
    this.title = title;
    this.author = author;
    this.publisher = publisher;
  }

  public Book() {
  }

  public String getBookCode() {
    return bookCode;
  }

  public void setBookCode(String bookCode) {
    this.bookCode = bookCode;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public Author getAuthor() {
    return author;
  }

  public void setAuthor(Author author) {
    this.author = author;
  }

  public Publisher getPublisher() {
    return publisher;
  }

  public void setPublisher(Publisher publisher) {
    this.publisher = publisher;
  }
}
