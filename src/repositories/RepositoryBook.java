package repositories;

import abstracts.CommercialBook;
import models.*;

import java.util.Arrays;
import java.util.List;

public class RepositoryBook {

  public static List<CommercialBook> getAllBook(){

    //Author
    Author author1 = new Author("Haidar", "Musyafa", "Indonesia", 30);
    Author author2 = new Author("Bert", "Bates", "United State", 50);
    Author author3 = new Author("Barry", "Burd", "United State", 52);
    Author author4 = new Author("Mark", "Manson", "United State", 38);
    Author author5 = new Author("Andi", "Susanto", "Indonesia", 32);
    Author author6 = new Author("Adi", "Sutanto", "Indonesia", 27);

    // Novelis
    Novelis novelis1 = new Novelis("J.K", "Rowling", "England", 57, "Best Seller", true);
    Novelis novelis2 = new Novelis("Tere", "Liye", "Indonesia", 35, "Best Seller", true);
    Novelis novelis3 = new Novelis("Dee", "Lestari", "Indonesia", 30, "Good", true);
    Novelis novelis4 = new Novelis("Faisal", "Syahreza", "Indonesia", 40, "New Commer", true);
    Novelis novelis5 = new Novelis("Julia", "Golding", "England", 41, "Best Seller", false);

    // Mangaka
    Mangaka mangaka1 = new Mangaka("Masashi", "Kisimoto", "Japan", 48, "Best Seller");
    Mangaka mangaka2 = new Mangaka("Yoshihiro", "Togashi", "Japan", 56, "Good");
    Mangaka mangaka3 = new Mangaka("Eiichiro", "Oda", "Japan", 57, "Best Seller");
    Mangaka mangaka4 = new Mangaka("Rizki", "Anwar", "Indonesia", 25, "New Commer");
    Mangaka mangaka5 = new Mangaka("Yusuf", "Fadli", "Indonesia", 32, "New Commer");

    // Publisher
    Publisher publisher1 = new Publisher("Bloombry", "United Kingdom", 30.0);
    Publisher publisher2 = new Publisher("Gramedia", "Indonesia", 50.0);
    Publisher publisher3 = new Publisher("Mizan", "Indonesia", 25.0);
    Publisher publisher4 = new Publisher("Shueisha", "Japan", 25.0);
    Publisher publisher5 = new Publisher("Elex Media Komputindo", "Indonesia", 12.0);
    Publisher publisher6 = new Publisher("Gramedia Pustaka Utama", "Indonesia", 15.0);
    Publisher publisher7 = new Publisher("Lion Hudson", "England", 15.0);
    Publisher publisher8 = new Publisher("O Reilly Media", "United State", 30.0);
    Publisher publisher9 = new Publisher("Harper One", "United State", 25.0);

    //Book
    EBook book1 = new EBook("Book - 001", "Mehamami Hamka", author1, publisher3, 0);
    EBook book2 = new EBook("Book - 002", "Head First Java: Your Brain on Java - A Learner's Guide", author2,
            publisher8, 0);
    EBook book3 = new EBook("Book - 003", "Java For Dummies", author2, publisher8, 0);
    EBook book4 = new EBook("Book - 004", "Flutter For Dummies", author2, publisher8, 0);
    EBook book5 = new EBook("Book - 005", "The Subtle Art of Not Giving", author4, publisher9, 0);
    EBook book6 = new EBook("Book - 006", "Will", author4, publisher9, 0);
    EBook book7 = new EBook("Book - 007", "Sejarah Indonesia", author5, publisher2, 0);
    EBook book8 = new EBook("Book - 008", "Teknologi Baru", author6, publisher5, 0);

    // Novel
    Novel novel1 = new Novel("Novel - 001", "Harry Potter and the Philosopher's Stone", novelis1, publisher1, 0,
            "Fantasy");
    Novel novel2 = new Novel("Novel - 002", "Harry Potter and the Chamber of Secrets", novelis1, publisher1, 0,
            "Fantasy");
    Novel novel3 = new Novel("Novel - 003", "Harry Potter and the Prisoner of Azkaban", novelis1, publisher1, 0,
            "Fantasy");
    Novel novel4 = new Novel("Novel - 004", "Ayah Aku Berbeda", novelis3, publisher2, 0, "Drama");
    Novel novel5 = new Novel("Novel - 005", "Madre", novelis2, publisher2, 0, "Drama");
    Novel novel6 = new Novel("Novel - 006", "Lagu untuk Renjana", novelis4, publisher3, 0, "Drama");
    Novel novel7 = new Novel("Novel - 007", "Semoga Lekas Lega", novelis4, publisher3, 0, "Drama");
    Novel novel8 = new Novel("Novel - 008", "The Abbey Mystery", novelis5, publisher7, 0, "Fiction");

    // Comic
    Comic comic1 = new Comic("Comic - 001", "Uzumaki Naruto", mangaka1, publisher4, 0, 0, true);
    Comic comic2 = new Comic("Comic - 002", "The Worst Client", mangaka1, publisher4, 0, 0, true);
    Comic comic3 = new Comic("Comic - 003", "For the Sake of Dreams...!", mangaka1, publisher4, 0, 0, true);
    Comic comic4 = new Comic("Comic - 004", "Hunter X Hunter : The Day of Departure", mangaka2, publisher4, 0, 0, true);
    Comic comic5 = new Comic("Comic - 005", "Hunter x Hunter : A Struggle in the Mist", mangaka2, publisher4, 0, 0, true);
    Comic comic6 = new Comic("Comic - 006", "One Piece", mangaka3, publisher6, 0, 0, true);
    Comic comic7 = new Comic("Comic - 007", "Petuangan di Indonesia", mangaka4, publisher6, 0, 0, false);
    Comic comic8 = new Comic("Comic - 008", "Petuangan di Jakarta", mangaka5, publisher5, 0, 0, false);

    List<CommercialBook> listAllBook = Arrays.asList(book1, book2, book3, book4, book5, book6, book7, book8, novel1, novel2, novel3, novel4, novel5, novel6, novel7, novel8, comic1, comic2, comic3, comic4, comic5, comic6, comic7, comic8);

    return listAllBook;
  }
}
