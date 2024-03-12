package view;

import inputter.Inputter;
import java.util.ArrayList;
import java.util.Scanner;
import model.Book;
import model.Library;

public class LibraryManagement extends Menu<String> {

    //Khai bao doi tuong Library
    private Library lib;
    
    private static String[] options = {
        "List all books",
        "Search book",
        "Add new book",
        "Exit"
    };

    public LibraryManagement(String td, String[] mc, Library lib) {
        super(td, mc);
        this.lib = lib;
    }

    private void menuSearch() {
        String[] selection = {
            "Find by BookID",
            "Find by BookTitle",
            "Find by Author",
            "Find by YearPublished",
            "Return"
        };
        Menu<String> menu = new Menu<String>("Book Searching", selection) {
//          Triển khai thêm phương thức trong Object
            @Override
            public void execute(int n) {
                Scanner s = new Scanner(System.in);
                switch (n) {
                    case 1:
                        String bid = null;
                        bid = Inputter.inputPattern("Enter Book ID (st. ID B0000): ", "[bB][\\d]{4}");
                        ArrayList<Book> a = lib.searchByID(bid);
                        for (int i = 0; i < a.size(); i++) {
                            System.out.println(a.get(i));
                        }
                        break;
                    case 2:
                        System.out.println("Enter Book Title: ");
                        String btt = s.nextLine();
                        ArrayList<Book> b = lib.searchByBookTitle(btt);
                        for (int i = 0; i < b.size(); i++) {
                            System.out.println(b.get(i));
                        }
                        break;
                    case 3:
                        System.out.println("Enter Author: ");
                        String at = s.nextLine();
                        ArrayList<Book> c = lib.searchByAuthor(at);
                        for (int i = 0; i < c.size(); i++) {
                            System.out.println(c.get(i));
                        }
                        break;
                    case 4:
                        System.out.println("Enter Year Of Published: ");
                        int yb = s.nextInt();
                        ArrayList<Book> d = lib.searchByYearPublished(yb);
                        for (int i = 0; i < d.size(); i++) {
                            System.out.println(d.get(i));
                        }
                        break;
                    default:
                        System.out.println("Thanks!");
                        break;
                }
            }
        };
        menu.run();
    }

    @Override
    public void execute(int choice) {
        switch (choice) {
            case 1:
                this.lib.listBook();
                break;
            case 2:
                menuSearch();
                break;
            case 3:
                this.lib.addNewBook();
                break;
            default:
                System.out.println("Thank you and Goodbye!");
                break;

        }
    }

    public static void main(String[] args) {
        LibraryManagement lm = new LibraryManagement("Library Management", options, new Library());
        lm.run();
    }
}
