package ex03_QE170097;

public class TriviaGame extends Game{
    private int ultimatePrize;
    private int numQuestions;

    public TriviaGame(String description) {
        super(description);
    }

    public TriviaGame(String description, int ultimatePrize, int numQuestions) {
        super(description);
        
        this.ultimatePrize = ultimatePrize;
        this.numQuestions = numQuestions;
    }

    @Override
    public String toString() {
        return "Description: " + super.getDescription() + ", Ultimate Prize: $" + this.ultimatePrize + ", Number of Questions: " + this.numQuestions;
    }
}
