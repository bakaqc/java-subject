package DTO;

import java.util.Scanner;

public class Statue extends Item {

    private int weight;
    private String colour;

    //Ham khoi tao k doi so
    public Statue() {
        super();
    }

    //Ham khoi tao co doi so
    public Statue(int weight, String colour, int value, String creator) {
        super(value, creator);
        this.weight = weight;
        this.colour = colour;
    }

    //Ham get, set
    public int getWeight() {
        return weight;
    }

    public String getColour() {
        return colour;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    //Ham input,output
    @Override
    public void input() {
        super.input();
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Weight: ");
        this.weight = s.nextInt();

        System.out.println("Enter colour: ");
        this.colour = s.nextLine();
    }

    public void outputStatue() {
        super.output();
        System.out.println("Weight: " + this.weight);
        System.out.println("Colour: " + this.colour);
    }

    //Ham toString
//    @Override
//    public String toString() {
//        return "Statue{" + super.toString() + "weight=" + this.weight + ", colour=" + this.colour + '}';
//    }
    
}
