package test;

import shape.Triangle;
import array.MyArrayList;
import shape.Circle;
import shape.Rectangle;

public class Test {

    public static void input1(MyArrayList<Rectangle> arr) {
        arr.add(new Rectangle());
        arr.add(new Rectangle());
        arr.add(new Rectangle());
        arr.add(new Rectangle());
        arr.add(new Rectangle());
        arr.add(new Rectangle());
        arr.add(new Rectangle());
        arr.add(new Rectangle());
        arr.add(new Rectangle());
        arr.add(new Rectangle());
    }

    public static void input2(MyArrayList<Circle> arr) {
        arr.add(new Circle());
        arr.add(new Circle());
        arr.add(new Circle());
        arr.add(new Circle());
        arr.add(new Circle());
        arr.add(new Circle());
        arr.add(new Circle());
        arr.add(new Circle());
        arr.add(new Circle());
        arr.add(new Circle());
    }

    public static void input3(MyArrayList<Triangle> arr) {
        arr.add(new Triangle());
        arr.add(new Triangle());
        arr.add(new Triangle());
        arr.add(new Triangle());
        arr.add(new Triangle());
        arr.add(new Triangle());
        arr.add(new Triangle());
        arr.add(new Triangle());
        arr.add(new Triangle());
        arr.add(new Triangle());
    }

    public static double maxAreaRectangle(MyArrayList<Rectangle> arr) {
        double max = arr.get(0).area();

        for (int i = 1; i < arr.size(); i++) {
            if (max < arr.get(i).area()) {
                max = arr.get(i).area();
            }
        }

        return max;
    }

    public static double maxAreaCircle(MyArrayList<Circle> arr) {
        double max = arr.get(0).area();

        for (int i = 1; i < arr.size(); i++) {
            if (max < arr.get(i).area()) {
                max = arr.get(i).area();
            }
        }

        return max;
    }

    public static double maxAreaTriangle(MyArrayList<Triangle> arr) {
        double max = arr.get(0).area();

        for (int i = 1; i < arr.size(); i++) {
            if (max < arr.get(i).area()) {
                max = arr.get(i).area();
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

        double max1 = maxAreaRectangle(arr1);
        double max2 = maxAreaCircle(arr2);
        double max3 = maxAreaTriangle(arr3);

        double max = Math.max(Math.max(max1, max2), max3);

        System.out.println(max);
    }
}