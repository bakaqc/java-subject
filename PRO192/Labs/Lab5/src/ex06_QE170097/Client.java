package ex06_QE170097;

public class Client {
    public static void main(String[] args) {
        Restaurant a = new Restaurant("A", 50, 2000);
        System.out.println(a);
        
        Restaurant b = new Restaurant("B", 10, 1000);
        System.out.println(b);
        
        Restaurant c = new Restaurant("C", 20, 1500);
        System.out.println(c);
    }
}
