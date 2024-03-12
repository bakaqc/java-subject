package DTO;

public class FPTUniversity extends University implements Role {

    private String address;

    //Ham khoi tao k doi so
    public FPTUniversity() {
    }

    //Ham khoi tao co doi so
    public FPTUniversity(int size, String name, String address) {
        super(size, name);
        this.address = address;
    }

    //Ham get, set
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    //Cai dat phuong thuc
    @Override
    public void createWorker() {
        System.out.println("Providing human resources");
    }

    //Ham toString
    @Override
    public String toString() {
        return "FPTU has four campuses: Hanoi, HCM, DaNang, CanTho, QuyNhon. \n"
                + super.toString() + "Address: " + address;
    }
}
