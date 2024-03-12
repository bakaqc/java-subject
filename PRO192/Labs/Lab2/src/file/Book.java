package file;

public class Book {
    private String name;
    private double cost;

    public Book(String name, double cost) {
        this.name = name;
        this.cost = cost;
    }
    
    @Override
    public String toString() {
        return "Book{" + "name=" + name + ", cost=" + cost + '}';
    }
    
    
}
