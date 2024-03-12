package ex09_QE170097;

public class Client {
    public static void main(String[] args) {
        LiquidFood a = new LiquidFood("cafe", "help stay awake", 100, 2.0);
        System.out.println(a);
        
        LiquidFood b = new LiquidFood("beer", "cause loss of consciousness", 50, 1.0);
        System.out.println(b);
        
        LiquidFood c = new LiquidFood("orange juice", "delicious and nutritious", 200, 1.5);
        System.out.println(c);
        
        System.out.println();
        
        Fruit h = new Fruit("Apple", "Sweet water and contains a lot of vitamin A", 300, "fall");
        System.out.println(h);
        
        Fruit i = new Fruit("Banana", "Rich in nutrients and cure some diseases", 350, "all season");
        System.out.println(i);
        
        Fruit k = new Fruit("Mangosteen", "Anti-aging and anti-cancer", 400, "summer");
        System.out.println(k);
        
    }
    
    
}
