package square;

public class Square {
    // khai báo thuộc tính chung
    double a;

    public Square() 
    {
        this.a = 2;
    }

    public Square(double a) 
    {
        this.a = a;
    }
       
    // cài đặt phương thức chung 
    double area()
    {       
        return a*a;
    }
    
    double circumference()
    {
        return 4*a;
    }
    
    public static void main(String[] args) {
        // tạo các đối tượng riêng
        Square s1 = new Square();
        System.out.println("Area: " + s1.area());
        System.out.println("Circumference: " + s1.circumference());
        System.out.println();
        Square s2 = new Square(5);
        System.out.println("Area: " + s2.area());
        System.out.println("Circumference: " + s2.circumference());
        
    }
}
