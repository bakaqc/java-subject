package ex09_QE170097;

public class Fruit extends Food {

    private String season;
    public Fruit(String name, String description, double calo, String season) {
        super(name, description, calo);
        this.season = season;
    }

    @Override
    public String toString() {
        return super.toString() + ", season:" + this.season;
    }


}
