package ex09_QE170097;

public class Food {

    private String name;
    private String description;
    private double calo;

    public Food(String name, String description, double calo) {
        this.name = name;
        this.description = description;
        this.calo = calo;
    }

    @Override
    public String toString() {
        return "Food:" + this.name + ", " + description + ", calo:" + calo ;
    }
}
