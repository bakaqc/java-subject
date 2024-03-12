package employee.view;

import employee.model.Address;
import employee.model.Contract;
import employee.model.Date;
import employee.model.Employee;
import employee.model.Regular;
import java.util.Scanner;

public class ViewR {

    public static Regular inputRegular() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first name: ");
        String FirstName = sc.nextLine();

        System.out.println("Enter last name: ");
        String LastName = sc.nextLine();

        System.out.println("Enter gender: ");
        boolean Gender = sc.nextBoolean();

        System.out.println("Enter phone: ");
        String phone = sc.nextLine();

        System.out.println("Enter day of birth:");
        System.out.println("Enter year:");
        int year = sc.nextInt();
        System.out.println("Enter month: ");
        int month = sc.nextInt();
        System.out.println("Enter day: ");
        int day = sc.nextInt();

        System.out.println("Enter home address:");
        System.out.println("Enter number: ");
        String number = sc.nextLine();
        System.out.println("Enter street: ");
        String street = sc.nextLine();
        System.out.println("Enter district: ");
        String district = sc.nextLine();
        System.out.println("Enter city: ");
        String city = sc.nextLine();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter id: ");
        String id = scanner.nextLine();

        System.out.println("Enter office: ");
        String office = scanner.nextLine();

        System.out.println("Enter allowance: ");
        double allowance = scanner.nextDouble();

        System.out.println("Enter salary: ");
        double salary = scanner.nextDouble();

        System.out.println("Enter yearsOfExperience: ");
        double yearsOfExperience = scanner.nextInt();

        System.out.println("Enter rate: ");
        double rate = scanner.nextDouble();

        System.out.println("Enter basicsalary: ");
        double basicsalary = scanner.nextDouble();

        return new Regular(FirstName, LastName, Gender, phone,
                new Date(day, month, year),
                new Address(number, street, district, city), id, office, allowance, salary, year, rate, basicsalary);
    }

    public static void main(String[] args) {

    }
}
