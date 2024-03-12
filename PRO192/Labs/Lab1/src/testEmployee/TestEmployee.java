package testEmployee;

import array.MyArrayList;
import employee.*;

public class TestEmployee {
    
    public static void input(MyArrayList<Employee> arr) {
        arr.add(new Regular(
                "Hihi", "Haha", true, "113",
                new Date(9, 9, 1999),
                new Address("11", "Tran Hung Dao", "QN", "BD"),
                "HIHI_1", "FPT", 10, 10, 10, 10, 10
        ));
        
        arr.add(new Contract(
                "hdfh fg", "f 54oqf", true, "676544",
                new Date(1, 1, 2006),
                new Address("13", "kajsd", "TT", "PY"),
                "1234", "uiaskdf", 4532, 2343, 234
        ));
        
        arr.add(new Regular(
                "Hohi", "Hoha", false, "112",
                new Date(9, 9, 2003),
                new Address("179", "Hoang Van Thu", "QN", "BD"),
                "HIHI_1", "FPT", 10, 10, 10, 10, 10
        ));
        
        arr.add(new Contract(
                "akjhebf", "67ygrg", true, "344t",
                new Date(1, 1, 2002),
                new Address("13", "kajsd", "TT", "PY"),
                "1234", "uiaskdf", 4532, 2343, 234
        ));
        
        arr.add(new Regular(
                "Hiho", "Haho", true, "1136",
                new Date(9, 9, 204),
                new Address("11", "Tran Hung Dao", "QN", "BD"),
                "HIHI_1", "FPT", 10, 10, 10, 10, 10
        ));
        
        arr.add(new Contract(
                "46", "2 yh", true, "2738742",
                new Date(1, 1, 2002),
                new Address("13", "kajsd", "TT", "PY"),
                "1234", "uiaskdf", 4532, 2343, 234
        ));
        
        arr.add(new Regular(
                "Hi", "Ha", true, "1176543",
                new Date(9, 9, 2003),
                new Address("11", "Tran Hung Dao", "TS", "BD"),
                "HIHI_1", "FPT", 10, 10, 10, 10, 10
        ));
        
        arr.add(new Contract(
                "asdage", "wrht", true, "2738742",
                new Date(1, 1, 2005),
                new Address("13", "kajsd", "TT", "PY"),
                "1234", "uiaskdf", 4532, 2343, 2434
        ));
        
        arr.add(new Regular(
                "Hihi", "Haha", true, "113",
                new Date(9, 1, 2010),
                new Address("11", "Tran Hung Dao", "HA", "BD"),
                "HIHI_1", "FPT", 10, 10, 10, 10, 10
        ));
        
        arr.add(new Contract(
                "akjhebf", "foqf", true, "2738742",
                new Date(1, 1, 2002),
                new Address("13", "kajsd", "TT", "PY"),
                "1234", "uiaskdf", 4532, 2343, 234
        ));
    }
    
    public static Employee maxSalary(MyArrayList<Employee> arr) {
        Employee max = arr.get(0);
        
        for (int i = 0; i < arr.size(); i++) {
            if (max.computeSalary() < arr.get(i).computeSalary()) {
                max = arr.get(i);
            }
        }
        
        return max;
    }
    
    public static void printRegular(MyArrayList<Employee> arr) {
        for (int i = 0; i < arr.size(); i++) {
            Employee e = arr.get(i);
            
            if (e instanceof Regular) {
                System.out.println(e);
            }
        }
    }
    
    public static void removeContract(MyArrayList<Employee> arr) {
        for (int i = 0; i < arr.size();) {
            Employee e = arr.get(i);
            
            if (e instanceof Contract) {
                arr.remove(i);
            } else {
                i++;
            }
        }
    }
    
    public static void printYear2k3(MyArrayList<Employee> arr) {
        for (int i = 0; i < arr.size(); i++) {
            Employee e = arr.get(i);
            
            if (e.getDob().getYear() == 2003) {
                System.out.println(e);
            }
        }
    }
    
    public static void changeSalaryFromQN(MyArrayList<Employee> arr) {
        for (int i = 0; i < arr.size(); i++) {
            Employee e = arr.get(i);
            
            if (e.getHomeAddress().getDistrict().equals("QN")) {
                e.setSalary(2000);
            }
        }
    }
    
    public static void main(String[] args) {
        MyArrayList<Employee> arr = new MyArrayList<>();
        
        input(arr);
        
    }
}
