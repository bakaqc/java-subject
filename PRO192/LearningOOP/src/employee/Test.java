package employee;

public class Test {
    
    public static void test(){
        Employee cha = new Employee();
        cha.input();
        System.out.println(cha.toString());
        
        cha = new Regular();
        cha.input();
        System.out.println(cha.toString());
        System.out.println(cha.computeSalary());
        
        cha = new Contract();
        cha.input();
        System.out.println(cha.toString());
        System.out.println(cha.computeSalary());
    }
    public static void main(String[] args) {
        // cha new cha: goi truc tiep vao cac ham cua cha Person
//        Person a = new Person();
//        a.input();;
//        a.output();;
//        System.out.println(a.toString());
//        a.hamCuaChaPerson();
//        
//        //con new con: goi truc tiep vao cac ham cua con, thua ke thi dung ham cua cha neu con chua co
//        Employee e = new Employee();
//        e.input();
//        e.output();
//        System.out.println(e.toString());
//        e.hamCuaChaPerson();
//        e.hamCuaConEmployee();
//        
//        //tinh da hinh khi chay
//        //cha new con: goi truc tiep vao cac ham cua cha nhung ham nao giong nhau thi nhay qua ham cua con
//        Person c = new Employee();
//        c.input();
//        c.output();
//        c.hamCuaChaPerson();
//        System.out.println(c.toString());

          test();
    }
    
}
