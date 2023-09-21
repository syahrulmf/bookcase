package services;

import abstracts.CommercialBook;
import interfaces.InterfaceMenu;
import models.Author;
import models.Publisher;

import java.util.List;


public class BookCaseAction implements InterfaceMenu {
  public static void showMainMenu(){
    boolean isLooping = true;

    do {
      PrintData.printMenu("Main Menu", MAIN_MENU);

      int input = Utils.validasiNumberWithRange("Pilih : ", "Pilihan tidak sesuai!", Utils.regexNumber, 3, 0);

      if (input == 1){
        showMenuBook();
      } else if (input == 2){
        showMenuAuthor();
      } else if (input == 3){
        showMenuPublisher();
      } else if (input == 0) {
        isLooping = false;
      }
    } while(isLooping);

    System.out.println("\nAplikasi Berhenti!.\n");
  }

  public static void showMenuBook() {
    boolean isLooping = true;
    String messagePilihan = "Apakah Anda Ingin Mencari Data Buku Lainnya? (Ya/Tidak) : ";

    do {
      PrintData.printMenu("Book Search Menu", BOOK_MENU);

      int input = Utils.validasiNumberWithRange("Pilih : ", "Pilihan tidak sesuai!", Utils.regexNumber, 7, 0);

      if (input == 1){
        List<CommercialBook> bookTermurah = SearchData.getBookByFilter(Utils.listAllBook, "Termurah");
        PrintData.printDataBook(bookTermurah, "Data Buku Termurah");
        isLooping = Utils.konfirmasiPilihanMenu(messagePilihan);

      } else if (input == 2){
        List<CommercialBook> bookTermahal = SearchData.getBookByFilter(Utils.listAllBook, "Termahal");
        PrintData.printDataBook(bookTermahal, "Data Buku Termahal");
        isLooping = Utils.konfirmasiPilihanMenu(messagePilihan);

      } else if (input == 3){
        int rangePrice = Utils.validasiNumberWithRange("Masukan Range Price : ", "Inputan harus berupa number positif!", Utils.regexNumber, Integer.MAX_VALUE, 0);
        List<CommercialBook> listBookByRangePrice = SearchData.getAllBookByPrice(Utils.listAllBook, rangePrice);
        PrintData.printDataBook(listBookByRangePrice, "List Data Buku Berdasarkan Range Harga " + rangePrice);
        isLooping = Utils.konfirmasiPilihanMenu(messagePilihan);

      } else if (input == 4){
        String rating = Utils.validasiInput("Masukan Rating Mangaka : ", "Inputan harus berupa huruf!", Utils.regexHuruf);
        List<CommercialBook> listBookByMangakaRating = SearchData.getAllComicByMangakaRating(Utils.listAllBook, rating);
        PrintData.printDataBook(listBookByMangakaRating, "List Data Mangaka Dengan Rating " + rating);
        isLooping = Utils.konfirmasiPilihanMenu(messagePilihan);

      } else if (input == 5){
        String country = Utils.validasiInput("Masukan Negara Asal Publisher : ", "Inputan harus berupa huruf!", Utils.regexHuruf);
        List<CommercialBook> listBookByPublisherCountry = SearchData.getAllBookByPublisherCountry(Utils.listAllBook, country);
        PrintData.printDataBook(listBookByPublisherCountry, "List Data Buku Berdasarkan Publisher Dari Negara " + country);
        isLooping = Utils.konfirmasiPilihanMenu(messagePilihan);

      } else if (input == 6) {
        String country = Utils.validasiInput("Masukan Negara Asal Author : ", "Inputan harus berupa huruf!", Utils.regexHuruf);
        List<CommercialBook> listBookByAuthorCountry = SearchData.getAllBookByAuthorCountry(Utils.listAllBook, country);
        PrintData.printDataBook(listBookByAuthorCountry, "List Data Buku Berdasarkan Author Dari Negara " + country);
        isLooping = Utils.konfirmasiPilihanMenu(messagePilihan);

      } else if (input == 7) {
        List<CommercialBook> listComicMostExpensive = SearchData.getComicMostExpensive(Utils.listAllBook);
        PrintData.printDataBook(listComicMostExpensive, "List Data Comic Termahal");
        isLooping = Utils.konfirmasiPilihanMenu(messagePilihan);

      } else if (input == 0) {
        isLooping = false;

      } else {
        System.out.println("\nPilihan tidak dimengerti!.\n");
      }
    } while(isLooping);
  }

  public static void showMenuAuthor() {
    boolean isLooping = true;
    String messagePilihan = "Apakah Anda Ingin Mencari Data Author Lainnya? (Ya/Tidak) :";

    do {
      PrintData.printMenu("Author Search Menu", AUTHOR_MENU);

      int input = Utils.validasiNumberWithRange("Pilih : ", "Pilihan tidak sesuai!", Utils.regexNumber, 5, 0);

      if (input == 1){
        List<Author> listDataMangaka = SearchData.getAllMangaka(Utils.listAllBook);
        PrintData.printDataAuthor(listDataMangaka, "List Data Mangaka");
        isLooping = Utils.konfirmasiPilihanMenu(messagePilihan);

      } else if (input == 2){
        List<Author> listDataAuthor = SearchData.getAllAuthor(Utils.listAllBook);
        PrintData.printDataAuthor(listDataAuthor, "List Data Author");
        isLooping = Utils.konfirmasiPilihanMenu(messagePilihan);

      } else if (input == 3){
        List<Author> listDataNovelis = SearchData.getAllNovelis(Utils.listAllBook);
        PrintData.printDataAuthor(listDataNovelis, "List Data Novelis");
        isLooping = Utils.konfirmasiPilihanMenu(messagePilihan);

      } else if (input == 4){
        int age = Utils.validasiNumberWithRange("Masukan Range Umur Atuhor : ", "Inputan tidak sesuai!", Utils.regexNumber, 99, 0);
        List<Author> listDataAuthorByAge = SearchData.getAllAuthorByAge(Utils.listAllBook, age);
        PrintData.printDataAuthor(listDataAuthorByAge, "List Data Author Berdasarkan Range Umur " + age);
        isLooping = Utils.konfirmasiPilihanMenu(messagePilihan);

      } else if (input == 5){
        String country = Utils.validasiInput("Masukan Asal Negara Author : ", "Inputan harus berupa huruf!", Utils.regexHuruf);
        List<Author> listDataAuthorByCountry = SearchData.getAllAuthorByCountry(Utils.listAllBook, country);
        PrintData.printDataAuthor(listDataAuthorByCountry, "List Data Author Dari " + country);
        isLooping = Utils.konfirmasiPilihanMenu(messagePilihan);

      } else if (input == 0) {
        isLooping = false;

      } else {
        System.out.println("\nPilihan tidak dimengerti!.\n");
      }
    } while(isLooping);
  }

  public static void showMenuPublisher() {
    boolean isLooping = true;
    String messagePilihan = "Apakah Anda Ingin Mencari Data Publisher Lainnya? (Ya/Tidak) : ";

    do {
      PrintData.printMenu("Publisher Search Menu", PUBLISHER_MENU);

      int input = Utils.validasiNumberWithRange("Pilih : ", "Pilihan tidak sesuai!", Utils.regexNumber, 2, 0);

      if (input == 1){
        Publisher listPublisherTermahal = SearchData.getPublisherByFilter(Utils.listAllBook, "Termahal");
        PrintData.printDataPublisher(listPublisherTermahal, "List Publisher Dengan Productin Cost Termahal");
        isLooping = Utils.konfirmasiPilihanMenu(messagePilihan);

      } else if (input == 2){
        Publisher listPublisherTermurah = SearchData.getPublisherByFilter(Utils.listAllBook, "Termurah");
        PrintData.printDataPublisher(listPublisherTermurah, "List Publisher Dengan Productin Cost Termurah");
        isLooping = Utils.konfirmasiPilihanMenu(messagePilihan);

      } else if (input == 0) {
        isLooping = false;

      } else {
        System.out.println("\nPilihan tidak dimengerti!.\n");
      }
    }while(isLooping);
  }

}
