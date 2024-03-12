package equation;

public class LinearEquation {
    //khai báo thuộc tính chung
    double b;
    double c;

    public LinearEquation() 
    {
        this.b = 3;
        this.c = 6;
    }

    public LinearEquation(double b, double c) 
    {
        this.b = b;
        this.c = c;
    }    
       
    // cài đặt phương thức
    public void solve(){
        if(b == 0 &&  c == 0)
        {
            System.out.println("Phương trình có vô số nghiệm");
        }
        else
        {
           if(b == 0 && c != 0) System.out.println("Phương trình vô nghiệm");
           else
           {
               System.out.println("Phương trình có nghiệm: " + (-c)/b);
           }
        }
      
    }
    public static void main(String[] args) {
        // tạo các đối tượng riêng
        LinearEquation e1 = new LinearEquation();
        e1.solve();
        
        LinearEquation e2 = new LinearEquation(0, 0);
        e2.solve();
        
        
    }
}
