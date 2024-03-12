package ex09_QE170097;

public class LiquidFood extends Food{
    private double viscosity;
    
    public LiquidFood(String name, String description, double calo, double viscosity) {
        super(name, description, calo);
        this.viscosity = viscosity;
    }

    @Override
    public String toString() {
        return super.toString() + ", viscosity:" + viscosity;
    }
    
    
}
