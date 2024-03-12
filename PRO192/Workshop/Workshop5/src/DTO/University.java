package DTO;

public class University extends Organization {

    private String name;

    //Ham khoi tao k doi so
    public University() {
        super();
    }

    //Ham khoi tao co doi so
    public University(int size, String name) {
        super(size);
        this.name = name;
    }

    //Cai dat phuong thuc
    @Override
    public void communicateByTool() {
        System.out.println("In the university, people communicate by voice");
    }

    public void enroll() {
        System.out.println("The registration for enrollment is only valid when the University has received all enrollment documents and enrollment fees");
    }

    public void educate() {
        System.out.println("Provide education at university standard");
    }

    //Ham toString
    @Override
    public String toString() {
        return "Encourage the advancement and development of knowledge.\n"
                + "Name: " + this.name + "\n";
    }

}
