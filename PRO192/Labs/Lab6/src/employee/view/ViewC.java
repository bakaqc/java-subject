package employee.view;

import employee.model.Address;
import employee.model.Contract;
import employee.model.Date;
import employee.model.Employee;
import java.util.Scanner;

public class ViewC {

    public static Contract inputContract() {
//        Scanner s = new Scanner(System.in);
//        String firstname = s.nextLine();
//        String lastname = s.nextLine();
//        boolean gender = s.nextBoolean();
//        String phone = s.nextLine();
//        Date dob1 = null;
//        Address diaChiNha1 = null;
//        String id = s.nextLine();
//        String office = s.nextLine();
//        double allowance = 0;
//        double salary = 0;
//        double grateSlary = 0;
//
//        Contract ct = new Contract(firstname, lastname, gender, phone, dob1, diaChiNha1, id, office, allowance, salary, grateSlary);
//        return ct;
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

        System.out.println("Enter gratesalary: ");
        double gratesalary = scanner.nextDouble();
        
        return new Contract(FirstName, LastName, Gender, phone, 
               new Date(day, month, year), 
               new Address(number, street, district, city), id, office, allowance, salary, gratesalary);
    }

    public static void main(String[] args) {
        
    }
}
