package ex04_QE170097;

public class Game {
    private String description;

    public Game(String description) {
        this.description = description;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String newDescription) {
        this. description = newDescription;
    }

    @Override
    public String toString() {
        return "Description: " + this.description;
    }
}
