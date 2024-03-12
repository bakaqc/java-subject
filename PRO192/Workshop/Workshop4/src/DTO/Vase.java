package DTO;

import java.util.Scanner;

public class Vase extends Item {

    private int height;
    private String material;

    //Ham khoi tao k doi so
    public Vase() {
        super();
    }

    //Ham khoi tao co doi so
    public Vase(int height, String material, int value, String creator) {
        super(value, creator);
        this.height = height;
        this.material = material;
    }

    //Ham get, set
    public int getHeight() {
        return height;
    }

    public String getMaterial() {
        return material;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    //Ham input, output
    @Override
    public void input() {
        super.input();
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Height: ");
        this.height = s.nextInt();
        s.nextLine();
        
        System.out.println("Enter Material: ");
        this.material = s.nextLine();

    }

    public void outputVase() {
        super.output();
        System.out.println("Height: " + this.height);
        System.out.println("Material: " + this.material);
    }

    //Ham toString
//    @Override
//    public String toString() {
//        return "Vase{" + super.toString() +"height=" + this.height + ", material=" + this.material + '}';
//    }
    
}
