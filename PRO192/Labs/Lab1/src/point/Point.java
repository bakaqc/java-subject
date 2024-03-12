package point;

public class Point {

    private double x;
    private double y;

    public Point() {
        this.x = 0;
        this.y = 0;
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point{" + "x=" + x + ", y=" + y + '}';
    }
    
    public double distance(Point other) {
        return Math.sqrt(Math.pow(this.x - other.x, 2) + Math.pow(this.y - other.y, 2));
    }

    public double area(Point b, Point c) {
        double ab = this.distance(b);
        double bc = b.distance(c);
        double ac = this.distance(c);
        double p = (ab + bc + ac) / 2;

        return Math.sqrt(p * (p - ab) * (p - bc) * (p - ac));
    }
    
    public double perimeter(Point b, Point c) {
        double ab = this.distance(b);
        double bc = b.distance(c);
        double ac = this.distance(c);
        
        return ab + bc + ac;
    }

    public static void main(String[] args) {
        Point p1 = new Point();
        System.out.println("(" + p1.x + ", " + p1.y + ")");

        Point p2 = new Point(12, 12);
        System.out.println("(" + p2.x + ", " + p2.y + ")");

        Point p3 = new Point(43, 34);
        System.out.println("(" + p3.x + ", " + p3.y + ")");
        
        double area = p1.area(p2, p3);
        System.out.println(area);
    }
}
