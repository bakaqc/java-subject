package ex06_QE170097;

public class Store {

    public final double SALESJAXJATE = 0.06;
    private String name;
    
    public Store(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Store " + "SALESJAXJATE:" + SALESJAXJATE + ", name:" + this.name;
    }
    
    
}
