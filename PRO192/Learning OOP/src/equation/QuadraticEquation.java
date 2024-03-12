package equation;

public class QuadraticEquation {
    double a;
    double b;
    double c;
    
    public QuadraticEquation() 
    {
        this.a = 2;
        this.b = 4;
        this.c = 6;
    }

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    
    public void quadratic()
    {
        double del = b*b - 4*a*c;
        if(del < 0)
        {
            System.out.println("Vo nghiem");
        }
        if(del == 0)
        {
            double t = -b/2/a;
            if(t < 0) System.out.println("Vo nghhiem");
            else
            {
                double x1 = Math.sqrt(t);
                double x2 = Math.sqrt(t);
                System.out.println("Nghiem x1 = "+ x1);
                System.out.println("Nghiem x2 = "+ x2);
            }
        }    
        if(del > 0)
        {
            double t1 = (-b + Math.sqrt(del))/2/a;
            double t2 = (-b - Math.sqrt(del))/2/a;
            if(t1 < 0 && t2 < 0) System.out.println("Vo nghiem");
            if(t1 < 0 && t2 >= 0)
            {
                double x3 = Math.sqrt(t2);
                double x4 = -Math.sqrt(t2);        
                System.out.println("Nghiem x3 = "+ x3);  
                System.out.println("Nghiem x4 = "+ x4); 
            }
            if(t1 >= 0 && t2 < 0)
            {
                double x1 = Math.sqrt(t1);
                double x2 = -Math.sqrt(t1);        
                System.out.println("Nghiem x1 = "+ x1);  
                System.out.println("Nghiem x2 = "+ x2); 
            }
            if(t1 >= 0 && t2 >= 0)
            {
                double x1 = Math.sqrt(t1);
                double x2 = -Math.sqrt(t1);        
                System.out.println("Nghiem x1 = "+ x1);  
                System.out.println("Nghiem x2 = "+ x2); 
                double x3 = Math.sqrt(t2);
                double x4 = -Math.sqrt(t2);        
                System.out.println("Nghiem x3 = "+ x3);  
                System.out.println("Nghiem x4 = "+ x4); 
            }
        }
    }        
    public static void main(String[] args) {
        QuadraticEquation a = new QuadraticEquation();
        a.quadratic();
        
        QuadraticEquation b = new QuadraticEquation(1,1,0);
        b.quadratic();
    }    
}


