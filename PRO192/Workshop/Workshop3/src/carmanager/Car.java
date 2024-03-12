package carmanager;

public class Car {

    private String colour;
    private int enginePower;
    private boolean convertible;
    private boolean parkingBrake;

    public Car() {
        this.colour = "yellow";
        this.enginePower = 0;
        this.convertible = true;
        this.parkingBrake = true;
    }

    public Car(String Colour, int EnginePower, boolean Convertible, boolean ParkingBrake) {
        this.colour = Colour;
        this.enginePower = EnginePower;
        this.convertible = Convertible;
        this.parkingBrake = ParkingBrake;
    }

    public String getColour() {
        return colour;
    }

    public int getEnginePower() {
        return enginePower;
    }

    public boolean isConvertible() {
        return convertible;
    }

    public boolean isParkingBrake() {
        return parkingBrake;
    }

    public void setColour(String Colour) {
        this.colour = Colour;
    }

    public void setEnginePower(int EnginePower) {
        this.enginePower = EnginePower;
    }

    public void setConvertible(boolean Convertible) {
        this.convertible = Convertible;
    }

    public void setParkingBrake(boolean ParkingBrake) {
        this.parkingBrake = ParkingBrake;
    }

    public void pressStartButton(){
        System.out.println("You have pressed the start button");
    }
    
    public void pressAcceleratorButton(){
        System.out.println("You have pressed the Accelerator button");
    }

    @Override
    public String toString() {
        return "Car: " + "colour=" + colour + ", enginePower=" + enginePower 
                + ", convertible=" + convertible + ", parkingBrake=" + parkingBrake;
    }
    
    
    
}
