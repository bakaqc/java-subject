package DTO;

import java.util.Scanner;

public class Item {

    protected int value;
    protected String creator;

    //Ham khoi tao k doi so
    public Item() {
        this.value = 1;
        this.creator = "";
    }

    //Ham khoi tao co doi so
    public Item(int value, String creator) {
        this.value = value;
        this.creator = creator;
    }

    //Ham get, set
    public int getValue() {
        return this.value;
    }

    public String getCreator() {
        return this.creator;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    //Ham input, output
    public void input() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Value: ");
        this.value = s.nextInt();

        System.out.println("Enter Creator: ");
        this.creator = s.nextLine();
        while (true) {
            creator = s.nextLine();
            if (this.value > 0 && this.creator == "") {
                System.err.println("Creator is empty!");
                System.err.print("Enter again: ");
            } else {
                this.creator = creator;
                break;
            }
        }

    }

    public void output() {
        System.out.println("Value: " + this.value);
        System.out.println("Creator: " + this.creator);
    }

//    //Ham toString
//    @Override
//    public String toString() {
//        return "Item{" + "value=" + this.value + ", creator=" + this.creator + '}';
//    }

}
