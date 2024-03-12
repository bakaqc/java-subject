package ex05_QE170097;

public class Client {
    public static void main(String[] args) {
        WebStore a = new WebStore("A", "abc", "C");
        System.out.println(a);
        
        WebStore b = new WebStore("B", "def", "Java");
        System.out.println(b);
        
        WebStore c = new WebStore("C", "ghi", "Python");
        System.out.println(c);
        
    }
}
