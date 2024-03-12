package point;

public class Point {
    private int x;
    private int y;
    
    public Point(){
        this.x = 0;
        this.y = 0;
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }    
    
    double distance(Point b){
        return Math.sqrt(Math.pow(this.x - b.x, 2) + Math.pow(this.y - b.y, 2));
    }
    double area(Point b, Point c){
        double ab = this.distance(b);
        double ac = this.distance(c);
        double bc = b.distance(c);
        
        // xét điều kiện tam giác
        if(ab + ac < bc || ab + bc < ac || ac + bc < ab)return 0;
        double p =(ab + bc + ac)/2;
        return Math.sqrt(p*(p - ab)*(p - ac)*(p - bc));
        // tính chu vi
    }
    
    double perimeter(Point b, Point c){
        double ab = this.distance(b);
        double ac = this.distance(c);
        double bc = b.distance(c);
        
        if(ab + ac < bc || ab + bc < ac || ac + bc < ab)return 0;
        return ab + ac + bc;
        
    }
    public static void main(String[] args) {
        Point a = new Point();       
        Point b = new Point(7, 7);       
        Point c = new Point(7, 0);
        
        System.out.println(a.area(b,c));
        System.out.println(a.perimeter(b,c));
    }
 
}
