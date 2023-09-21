package interfaces;

public interface InterfaceMenu {
  String[] MAIN_MENU = {"Book", "Author", "Publisher", "Exit"};

  String[] BOOK_MENU = {"Cari Data Book yang Memiliki Price Paling Murah", "Cari Data Book yang Memiliki Price Paling Mahal", "Cari Data Book Berdasarkan Range Price", "Cari Comic Berdasarkan Rating Mangaka", "Cari Book Berdasarkan Country Dari Publishernya", "Cari Book Berdasarkan Country Dari Authornya", "Cari Data Comic yang Memiliki Price Paling Mahal", "Back To Main Menu"};

  String[] AUTHOR_MENU = {"Cari Data Semua Mangaka", "Cari Data Semua Author", "Cari Data Semua Novelis", "Cari Author Berdasarkan Range Umur", "Cari Author Berdasarkan Country", "Back To Main Menu"};

  String[] PUBLISHER_MENU = {"Production Cost Termahal", "Production Cost Termurah", "Back To Main Menu"};
}
