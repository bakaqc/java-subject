package ex06_QE170097;

public class Restaurant extends Store{
    
    private int people;
    private double price;
            
    public Restaurant(String name, int people, double price) {
        super(name);
        this.people = people;
        this.price = price;
    }

    @Override
    public String toString() {
        return super.toString() + " Restaurant," + " people:" + people + ", price:" + price + '}';
    }
    
//    public String tax(){
//        return tax;
//    }
    
    
}
