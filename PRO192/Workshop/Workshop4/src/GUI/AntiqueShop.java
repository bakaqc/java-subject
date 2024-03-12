package GUI;

import DTO.Item;
import DTO.Painting;
import DTO.Statue;
import DTO.Vase;
import java.util.Scanner;

public class AntiqueShop {

    public static void menu() {
        String[] options = {"Create a Vase", "Create a Statue", "Create a Painting", "Display the Item"};
        Item item = null;
        int choice = 0;
        Scanner sc = new Scanner(System.in);
        do {
            choice = Menu.getChoice(options);

            switch (choice) {

                case 1 -> {
                    item = new Vase();
                    item.input();
                    break;
                }
                case 2 -> {
                    item = new Statue();
                    item.input();
                    break;
                }
                case 3 -> {
                    item = new Painting();
                    item.input();
                    break;
                }
                case 4 -> {
                    if (item != null) {
                        if (item instanceof Vase) {
                            ((Vase) item).outputVase();
//                            ((Vase) item).toString();
                        } else if (item instanceof Statue) {
                            ((Statue) item).outputStatue();
//                            ((Statue) item).toString();
                        } else if (item instanceof Painting) {
                            ((Painting) item).outputPainting();
//                            ((Painting) item).toString();
                        }
                    } else {
                        System.out.println("you need to create an object");
                    }
                    break;
                }
                default -> {
                    System.out.println("Thank you and see you again!");
                    break;
                }
            }
        } while (choice <= 4);
    }

    public static void main(String[] args) {
        menu();
    }

}
