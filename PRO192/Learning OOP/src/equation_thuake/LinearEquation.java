package equation_thuake;

public class LinearEquation {
    //khai báo thuộc tính chung
    protected double b;
    protected double c;

    public LinearEquation() 
    {
        this.b = 0;
        this.c = 0;
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
