package model;

import inputter.Inputter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Library extends ArrayList<Book> {

    //Khởi tạo ArrayList<Book> 
    public Library() {
        super();
        this.loadData();
    }

    //Hàm list all Book trong ArrayList<Book>
    public void listBook() {
        this.listBook(this);
    }

    //Hàm list Book bất kì
    public void listBook(ArrayList<Book> List) {
        if (this.isEmpty()) {
            System.out.println("Empty list! ");
            return;
        } else {
            System.out.println("Book list: ");
            for (int i = 0; i < this.size(); i++) {
                System.out.println(this.get(i));
            }
            System.out.println("Total: " + List.size() + " books.");
        }
    }

    //Hàm lấy dữ liệu từ file text đưa vào ArrayList<Book>
    private void loadData() {
        File f = new File("lib.txt");
        try ( Scanner s = new Scanner(f)) {//Đọc từng dòng của tệp bằng lớp Scanner

            while (s.hasNextLine()) {//hasNextLine: ktra neu phia sau con hang thi return true, nguoc lai return false
                String line = s.nextLine();
                String[] row = line.split(":");

                try {
                    int yearPublished = Integer.parseInt(row[3]);
                    this.add(new Book(row[0], row[1], row[2], yearPublished));

                } catch (Exception e) {
                    e.printStackTrace();//hien thi loi ngoai le
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //Search bằng BookID
    public ArrayList<Book> searchByID(String BookID) {
        ArrayList<Book> List = new ArrayList<>();
        BookID = BookID.trim().toUpperCase();
        for (int i = 0; i < this.size(); i++) {
            if (this.get(i).getBookID().contains(BookID)) {
                List.add(this.get(i));
            }
        }
        if (List.isEmpty()) {
            System.out.println("Not Found!");
        }
        return List;
    }

    //Search bằng tên sách
    public ArrayList<Book> searchByBookTitle(String BookTitle) {
        ArrayList<Book> List = new ArrayList<>();
        BookTitle = BookTitle.trim();
        for (int i = 0; i < this.size(); i++) {
            if (this.get(i).getBookTitle().toLowerCase().contains(BookTitle.toLowerCase())) {
                List.add(this.get(i));
            }
        }
        if (List.isEmpty()) {
            System.out.println("Not Found!");
        }
        return List;
    }

    //Search bằng tên tác giả
    public ArrayList<Book> searchByAuthor(String Author) {
        ArrayList<Book> List = new ArrayList<>();
        Author = Author.trim();
        for (int i = 0; i < this.size(); i++) {
            if (this.get(i).getAuthor().toLowerCase().contains(Author.toLowerCase())) {
                List.add(this.get(i));
            }
        }
        if (List.isEmpty()) {
            System.out.println("Not Found!");
        }
        return List;
    }

    //Search bằng năm xuất bản
    public ArrayList<Book> searchByYearPublished(int YearPublished) {
        ArrayList<Book> List = new ArrayList<>();
        for (int i = 0; i < this.size(); i++) {
            if (this.get(i).getYearPublished() == YearPublished) {
                List.add(this.get(i));
            }
        }
        if (List.isEmpty()) {
            System.out.println("Not Found!");
        }
        return List;
    }

    //Add new book vào ArrayList<Book> và file
    public void addNewBook() {
        System.out.println("Add new book");
        System.out.println("--------------------------------");

        String newBookID = null;
        String newBookTitle = null;
        String newAuthor = null;
        int newYearPublished = 0;

        Scanner s = new Scanner(System.in);

        while (true) {
            //Mặc định form BookID cho người dùng nhập
            newBookID = Inputter.inputPattern("Enter Book ID (st. ID B0000): ", "[bB][\\d]{4}");
            newBookID = newBookID.trim().toUpperCase().replaceAll("\\s+", " ");
            //Dùng hàm checkBookID để kiểm tra ID nhập đã tồn tại hay k
            if (checkBookID(newBookID) == 0) {
                break;
            } else {
                System.out.println("This Book ID already exist!");
                System.out.println("Please enter again!");
            }
        }

        System.out.println("Enter Book Title: ");
        newBookTitle = s.nextLine();
        newBookTitle = newBookTitle.trim().replaceAll("\\s+", " ");

        System.out.println("Enter Author: ");
        newAuthor = s.nextLine();
        newAuthor = newAuthor.trim().replaceAll("\\s+", " ");

//        do {
//            System.out.println("Enter Year of published ( >=1800 ): ");
//            newYearPublished = s.nextInt();
//        } while (newYearPublished < 1800);
        
        newYearPublished = Inputter.inputInt("Enter Year Published", 1800, Integer.MAX_VALUE);
        
        Book newBook = new Book(newBookID, newBookTitle, newAuthor, newYearPublished);
        this.add(newBook);
        this.addNewBookToFile(newBook);
    }

    //Ghi newBook vao file
    private void addNewBookToFile(Book book) {
        try {
            File file = new File("lib.txt");
            FileWriter pw = new FileWriter(file, true);

            String newBook = book.getBookID() + ":" + book.getBookTitle() + ":" + book.getAuthor() + ":" + book.getYearPublished();
            pw.append("\n" + newBook);
            pw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //Ham check BookID da co hay chua
    private int checkBookID(String bookID) {
        for (int i = 0; i < this.size(); i++) {
            //equalsIgnoreCase(): so sánh nội dung 2 chuỗi k phân biệt hoa thường
            if (this.get(i).getBookID().equalsIgnoreCase(bookID)) {
                return 1;
            }
        }
        return 0;
    }

}
