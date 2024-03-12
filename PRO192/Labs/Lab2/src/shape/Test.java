package shape;

import employee.MyArrayList;
import person.Validation;
import java.util.Scanner;

public class Test {

    public static void input(MyArrayList<Shape> arr) {
        Shape cha;
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter number of array: ");
        int n = kb.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("1. Square, 2. Rectangle, 3. Circle, 4 Triangle: ");
            System.out.println("Enter your choice: ");
            int choice = Validation.checkIntputIntLinmit(1, 4);
            switch (choice) {
                case 1:
                    cha = new Square();
                    cha.input();
                    arr.add(cha);
                    break;
                case 2:
                    cha = new Rectangle();
                    cha.input();
                    arr.add(cha);
                    break;
                case 3:
                    cha = new Circle();
                    cha.input();
                    arr.add(cha);
                    break;
                case 4:
                    cha = new Triangle();
                    cha.input();
                    arr.add(cha);
                    break;

            }
        }

    }

    public static double maxArea(MyArrayList<Shape> a) {
        double max = a.get(0).area();
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i).area() > max) {
                max = a.get(i).area();
            }

        }
        return max;

    }

    public static void main(String[] args) {
        MyArrayList<Shape> a = new MyArrayList<>();
        input(a);
        System.out.println(a.toString());
        System.out.println(maxArea(a));

    }
}
