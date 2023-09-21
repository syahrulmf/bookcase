package services;

import abstracts.CommercialBook;
import repositories.RepositoryBook;

import java.util.List;

public class Utils {
  public static java.util.Scanner scanner = new java.util.Scanner(System.in);

  public static List<CommercialBook> listAllBook = RepositoryBook.getAllBook();

  public static String regexNumber = "^[0-9]+$";

  public static String regexHuruf = "^[a-zA-Z ]+$";

  public static String validasiInput(String question, String errorMessage, String regex) {
    String result;
    boolean isLooping = true;
    do {
      System.out.print(question);
      result = scanner.nextLine();

      //validasi menggunakan matches
      if (result.matches(regex)) {
        isLooping = false;
      }else {
        System.out.println(errorMessage);
      }
    } while (isLooping);

    return result;
  }

  public static int validasiNumberWithRange(String question, String errorMessage, String regex, int max, int min) {
    int result;
    boolean isLooping = true;

    do {
      result = Integer.valueOf(validasiInput(question, errorMessage, regex));
      if (result >= min && result <= max) {
        isLooping = false;
      }else {
        System.out.println(errorMessage);
      }
    } while (isLooping);

    return result;
  }

  public static boolean konfirmasiPilihanMenu(String question) {
    boolean isLooping = true;

    var pilihan = validasiInput(question, "Hanya menerima inputan (Ya/Tidak)!", regexHuruf);
    if (pilihan.equalsIgnoreCase("Tidak")) {
      isLooping = false;
    }

    return isLooping;
  }
}
