package ex07_QE170097;

public class Client {
    public static void main(String[] args) {
        Circle a = new Circle(5);
        System.out.println("Perimeter:" + a.Perimeter());
        System.out.println("Area:" + a.Area());
        Circle b = new Circle(7);
        System.out.println("Perimeter:" + b.Perimeter());
        System.out.println("Area:" + b.Area());
        Circle c = new Circle(10);
        System.out.println("Perimeter:" + c.Perimeter());
        System.out.println("Area:" + c.Area());
        
        System.out.println();
        
        Rectangle h = new Rectangle(50, 10);
        System.out.println("Perimeter:" + h.Perimeter());
        System.out.println("Area:" + h.Area());
        Rectangle i = new Rectangle(2, 3);
        System.out.println("Perimeter:" + i.Perimeter());
        System.out.println("Area:" + i.Area());
        Rectangle k = new Rectangle(2.5, 3.7);
        System.out.println("Perimeter:" + k.Perimeter());
        System.out.println("Area:" + k.Area());
    }
       
}
