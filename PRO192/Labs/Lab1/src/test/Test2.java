package test;

import array.MyArrayList;
import java.util.Scanner;
import shape.Circle;
import shape.Rectangle;
import shape.Shape;
import shape.Square;
import shape.Triangle;

public class Test2 {

    public static double maxArea(MyArrayList<Shape> arr) {
        double max = arr.get(0).area();

        for (int i = 1; i < arr.size(); i++) {
            if (max < arr.get(i).area()) {
                max = arr.get(i).area();
            }
        }

        return max;
    }

    public static void input(MyArrayList<Shape> arr) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("1. Rectangle");
            System.out.println("2. Circle");
            System.out.println("3. Triangle");
            System.out.println("4. Square");

            int choice = sc.nextInt();

            switch (choice) {
                case 1 -> {
                    arr.add(new Rectangle(sc.nextDouble(), sc.nextDouble()));
                }

                case 2 -> {
                    arr.add(new Circle(sc.nextDouble()));
                }

                case 3 -> {
                    arr.add(new Triangle(sc.nextDouble(), sc.nextDouble(), sc.nextDouble()));
                }

                case 4 -> {
                    arr.add(new Square(sc.nextDouble()));
                }
            }
        }
    }

    public static void main(String[] args) {
        var arr = new MyArrayList<Shape>();

        input(arr);

        arr.add(new Rectangle(10, 40));
        arr.add(new Circle(10));
        arr.add(new Triangle(30, 40, 50));
        arr.add(new Square(30));
        double max = maxArea(arr);

        System.out.println(max);
    }
}
