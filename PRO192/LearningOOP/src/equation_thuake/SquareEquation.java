package equation_thuake;

public class SquareEquation extends LinearEquation {

    //khai báo thuộc tính chung
    private double a;

    public SquareEquation() {
        super();   // gọi hàm khởi tạo k đối số của cha
    }

    public SquareEquation(double a, double b, double c) {
        super(b, c);  // gọi hàm khởi tạo có đối số của cha
        this.a = a;
    }

    // cài đặt phương thức
    public void solve() {
        if (a == 0) {
            super.solve();
        } else {
            double delta = (float) (b * b - 4 * a * c);
            double x1;
            double x2;
            if (delta > 0) {
                x1 = (float) ((-b + Math.sqrt(delta)) / (2 * a));
                x2 = (float) ((-b - Math.sqrt(delta)) / (2 * a));
                System.out.println("Phương trình có 2 nghiệm là: "
                        + "x1 = " + x1 + " và x2 = " + x2);
            } else if (delta == 0) {
                x1 = (-b / (2 * a));
                System.out.println("Phương trình có nghiệm kép: "
                        + "x1 = x2 = " + x1);
            } else {
                System.out.println("Phương trình vô nghiệm!");
            }
        }
    }

    public static void main(String[] args) {
        // tạo các đối tượng riêng
        SquareEquation s1 = new SquareEquation();
        s1.solve();

        SquareEquation s2 = new SquareEquation(1, 5, 6);
        s2.solve();

    }
}
