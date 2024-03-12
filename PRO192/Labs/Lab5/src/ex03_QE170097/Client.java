package ex03_QE170097;

public class Client {
    public static void main(String[] args) {
        TriviaGame game1 = new TriviaGame("Trivia Game 1", 500, 1000);
        System.out.println(game1);
        
        TriviaGame game2 = new TriviaGame("Trivia Game 2", 200, 2000);
        System.out.println(game2);
        
        TriviaGame game3 = new TriviaGame("Trivia Game 3", 1000, 600);
        System.out.println(game3);
    }
}
