package DTO;

public class BeeColony extends Colony implements Role {

    private String type;

    //Ham khoi tao k doi so
    public BeeColony() {
        super();
    }

    //Ham khoi tao co doi so
    public BeeColony(int size, String colony, String type) {
        super(size, colony);
        this.type = type;
    }

    //Ham get, set
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    //Cai dat phuong thuc
    @Override
    public void createWorker() {
        System.out.println("Worker bees perform all the work off the bees");
    }

    //Ham toString
    @Override
    public String toString() {
        return "BeeColony: " + "The colony’s type is " + type + ", " + super.toString();
    }
}
