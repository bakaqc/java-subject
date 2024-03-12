package DTO;

import java.util.Scanner;

public class Painting extends Item {

    private int width;
    private int height;
    private boolean isWaterColour;
    private boolean isFramed;

    //Ham khoi tao k doi so
    public Painting() {
        super();
    }

    //Ham khoi tao co doi so
    public Painting(int width, int height, boolean isWaterColour, boolean isFramed, int value, String creator) {
        super(value, creator);
        this.width = width;
        this.height = height;
        this.isWaterColour = isWaterColour;
        this.isFramed = isFramed;
    }

    //Ham get, set
    public int getWidth() {
        return this.width;
    }

    public int getHeight() {
        return this.height;
    }

    public boolean isIsWaterColour() {
        return this.isWaterColour;
    }

    public boolean isIsFramed() {
        return this.isFramed;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setIsWaterColour(boolean isWaterColour) {
        this.isWaterColour = isWaterColour;
    }

    public void setIsFramed(boolean isFramed) {
        this.isFramed = isFramed;
    }

    //Ham input, output
    @Override
    public void input() {
        super.input();
        Scanner s = new Scanner(System.in);
        System.out.println("Enter width: ");
        this.width = s.nextInt();

        System.out.println("Enter height: ");
        this.height = s.nextInt();

        System.out.println("Enter isWaterColour: ");
        this.isWaterColour = s.nextBoolean();

        System.out.println("Enter isFramed: ");
        this.isFramed = s.nextBoolean();
    }

    public void outputPainting() {
        super.output();
        System.out.println("Width: " + this.width);
        System.out.println("Height: " + this.height);
        System.out.println("WaterColour: " + this.isWaterColour);
        System.out.println("Framed: " + this.isFramed);
    }

    //Ham toString
//    @Override
//    public String toString() {
//        return "Painting{" + super.toString() + "width=" + this.width + ", height=" + this.height 
//                + ", isWaterColour=" + this.isWaterColour + ", isFramed=" + this.isFramed + '}';
//    }

}
