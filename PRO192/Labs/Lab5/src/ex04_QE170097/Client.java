package ex04_QE170097;

public class Client {
    public static void main(String[] args) {
        BoardGame a = new BoardGame("Board game a",1, 5, true);
        System.out.println(a);
        BoardGame b = new BoardGame("Board game b",2, 4, true);
        System.out.println(b);
        BoardGame c = new BoardGame("Board game c",1, 3, true);
        System.out.println(c);
    }
}
