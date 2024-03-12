package array_of_double;

import shape.Triangle;
import employee.MyArrayList;
import shape.Circle;
import shape.Rectangle;

public class Test {
    
    public static void input1(MyArrayList<Rectangle> a){
        a.add(new Rectangle(5, 6));
        a.add(new Rectangle(1, 2));
        a.add(new Rectangle(3, 4));
        a.add(new Rectangle(7, 8));
        
    }
    
    public static double maxArea1(MyArrayList<Rectangle> a){
        double max = a.get(0).area();
        for(int i = 0; i < a.size(); i++){
            if(a.get(i).area() > max){
                max = a.get(i).area();
            }
            
        }
        return max;
        
    }
    
    public static void input2(MyArrayList<Circle> c) {
        c.add(new Circle(5));
        c.add(new Circle(9));
        c.add(new Circle(15));
        c.add(new Circle(7));
        c.add(new Circle(2));

    }

    public static double maxArea2(MyArrayList<Circle> c){
        double max = c.get(0).area();
        for(int i = 0; i < c.size(); i++){
            if(c.get(i).area() > max){
                max = c.get(i).area();
            }
            
        }
        return max;
        
    }
    
    public static void input3(MyArrayList<Triangle> b) {
        b.add(new Triangle(1, 2, 3));
        b.add(new Triangle(4, 5, 36));
        b.add(new Triangle(8, 2, 3));
        b.add(new Triangle(1, 10, 3));
        b.add(new Triangle(15, 2, 3));

    }

    public static double maxArea3(MyArrayList<Triangle> b){
        double max = b.get(0).area();
        for(int i = 0; i < b.size(); i++){
            if(b.get(i).area() > max){
                max = b.get(i).area();
            }
            
        }

        return max;
        
    }
    
    public static void main(String[] args) {
        MyArrayList<Rectangle> arr1 = new MyArrayList<>();
        MyArrayList<Circle> arr2 = new MyArrayList<>();
        MyArrayList<Triangle> arr3 = new MyArrayList<>();

        input1(arr1);
        input2(arr2);
        input3(arr3);

        double max1 = maxArea1(arr1);
        double max2 = maxArea2(arr2);
        double max3 = maxArea3(arr3);

        double max = Math.max(Math.max(max1, max2), max3);

        System.out.println(max);

    }
}
