package triangle;

public class Triangle {

    // khai báo thuộc tính chung
    private double a;
    private double b;
    private double c;

    public Triangle() {
        this.a = 0;
        this.b = 0;
        this.c = 0;
    }

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    // cài đặt phương thức 
    public void tri() {
        if (a <= 0 || b <= 0 || c <= 0) {
            System.out.println("Đây không phải tam giác!");
        } else if (a + b < c || a + c < b || b + c < a) {
            System.out.println("Đây không phải tam giác!");
        } else {
            double p = (a + b + c) / 2;
            System.out.println("Chu vi tam giác: " + 2 * p);
            double s = Math.sqrt(p * (p - a) * (p - b) * (p - c));
            System.out.println("Diện tích tam giác: " + s);
        }
    }

    public static void main(String[] args) {
        //tạo các giá trị riêng
        Triangle t1 = new Triangle();
        t1.tri();
        
        Triangle t2 = new Triangle(5, 6, 7);
        t2.tri();

    }

}
