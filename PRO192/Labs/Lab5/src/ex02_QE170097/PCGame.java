package ex02_QE170097;

public class PCGame extends Game{
    private int minRAM;
    private int hardDriveSpace;
    private double minCPUPerformance;

    public PCGame(String description, int minRAM, int hardDriveSpace, double minCPUPerformance) {
        super(description);
        
        this.minRAM = minRAM;
        this.hardDriveSpace = hardDriveSpace;
        this.minCPUPerformance = minCPUPerformance;
    }

    @Override
    public String toString() {
        return "Description: " + super.getDescription() + ", Minimum RAM: " + this.minRAM + " MB, Hard Drive Space: " + this.hardDriveSpace + " MB, Minimum CPU Performance: " + this.minCPUPerformance + " GHz";
    }
}
