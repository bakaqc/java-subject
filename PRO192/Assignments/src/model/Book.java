package model;

public class Book implements Comparable<Book> {

    private String bookID;
    private String bookTitle;
    private String author;
    private int yearPublished;

    //Ham khoi tao k doi so
    public Book() {
        this.bookID = "";
        this.bookTitle = "";
        this.author = "";
        this.yearPublished = 0;
    }

    //Ham khoi tao co doi so
    public Book(String bookID, String bookTitle, String author, int yearPublished) {
        this.bookID = bookID;
        this.bookTitle = bookTitle;
        this.author = author;
        this.yearPublished = yearPublished;
    }

    //Ham Getters & Setters
    public String getBookID() {
        return bookID;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public String getAuthor() {
        return author;
    }

    public int getYearPublished() {
        return yearPublished;
    }

    public void setBookID(String bookID) {
        this.bookID = bookID;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setYearPublished(int yearPublished) {
        this.yearPublished = yearPublished;
    }

    //Ham toString
    @Override
    public String toString() {
        return "Book{" + this.bookID + " - " + this.bookTitle + " - " + this.author + " - " + this.yearPublished + '}';
    }

    //Ham so sanh bookID
    @Override
    public int compareTo(Book o) {
        if (this.bookID.compareTo(o.bookID) == 0) {
            return 0;
        } else {
            if (this.bookID.compareTo(o.bookID) > 0) {
                return 1;
            } else {
                return -1;
            }
        }

    }

}

















//    public void setBookID(String bookID) {
//        //isBlank() method dùng để kiểm tra một chuỗi là empty hoặc chỉ chứa các ký tự khoảng trắng
//        if (bookID != null && !bookID.isEmpty() && !bookID.isBlank()) {
//            this.bookID = bookID.trim().toUpperCase();
//        }
//    }
//
//    public void setBookTitle(String bookTitle) {
//        if (bookTitle != null && !bookTitle.isEmpty() && !bookTitle.isBlank()) {
//            this.bookTitle = bookTitle.trim().toUpperCase();
//        }
//    }
//
//    public void setAuthor(String author) {
//        if (author != null && !author.isEmpty() && !author.isBlank()) {
//            this.author = author.trim().toUpperCase();
//        }
//    }
//
//    public void setYearPublished(int yearPublished) {
//        if (yearPublished >= 1000) {
//            this.yearPublished = yearPublished;
//        }
//    }