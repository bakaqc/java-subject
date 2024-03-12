package guitar;

public class Tester {

    public static void main(String[] args) {
        Guitar obj1 = new Guitar();
        System.out.println("State of obj1:");
        System.out.println(obj1);

        Guitar obj2 = new Guitar("G123", 2000, "Sony", "Model123", "hardWood", "softWood");
        System.out.println("State of obj2:");
        System.out.println(obj2);

        System.out.println("set price = 3000 of obj1");
        obj1.setPrice(3000);
        System.out.println("get price of obj1:" + obj1.getPrice() );
    }
}
