package file;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class WriteFile {
    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
        PrintWriter a = new PrintWriter("C:\\Users\\Quoc Chuong\\Documents\\PRO192 - Workshop\\file\\File.txt", "UTF-8");
        a.println("Hello everyone!");
        a.println("My name is Chuong");
        Book b = new Book("Math", 20);
        a.println(b);
        a.flush();
        a.close();
        
        
    }
}
