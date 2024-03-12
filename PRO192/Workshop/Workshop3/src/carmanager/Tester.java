package carmanager;

public class Tester {

    public static void main(String[] args) {
        Car c = new Car();
        c.pressStartButton();
        c.pressAcceleratorButton();
        System.out.println(c);
        System.out.println();
        
        Car c1 = new Car("red", 100, true, true);
        c1.pressAcceleratorButton();
        c1.setColour("black");
        System.out.println("Colour of c1:" + c1.getColour());
        System.out.println(c1);
        System.out.println();
        
        Car c2 = new Car();
        c2.pressStartButton();
        c2.setColour("blue");
        c2.setEnginePower(200);
        c2.setConvertible(true);
        c2.setParkingBrake(false);       
        System.out.println("Colour of c2:" + c2.getColour());
        System.out.println(c2);
    }
}
