package ex02_QE170097;

public class Client {
    public static void main(String[] args) {
        PCGame game1 = new PCGame("Elden Ring 1", 64, 50, 2.8);
        System.out.println(game1);
        
        PCGame game2 = new PCGame("Elden Ring 2", 16, 20, 3.0);
        System.out.println(game2);
        
        PCGame game3 = new PCGame("Elden Ring 3", 32, 30, 3.5);
        System.out.println(game3);
    }
}
