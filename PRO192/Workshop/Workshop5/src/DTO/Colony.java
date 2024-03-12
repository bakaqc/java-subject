package DTO;

public class Colony extends Organization {

    private String colony;

    //Ham khoi tao k doi so
    public Colony() {
        super();
    }

    //Ham khoi tao co doi so
    public Colony(int size, String colony) {
        super(size);
        this.colony = colony;
    }

    //Cai dat cac phuong thuc
    @Override
    public void communicateByTool() {
        System.out.println("The colony communicate by sound");
    }

    public void grow() {
        System.out.println("An annual cycle of growth that begins in spring");
    }

    public void reproduce() {
        System.out.println("Colony can reproduce itself through a process");
    }

    //Ham toString
    @Override
    public String toString() {
        return "The colony size is " + colony + ", " + super.toString();
    }

}
