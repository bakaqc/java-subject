package ex05_QE170097;

public class WebStore extends Store{
    private String itnadr;
    private String prglg;

    public WebStore(String name, String itnadr, String prglg) {
        super(name);
        this.itnadr = itnadr;
        this.prglg = prglg;
    }

    @Override
    public String toString() {
        return super.toString()+ " " + "WebStore:" + " itnadr:" + itnadr + ", prglg:" + prglg;
    }

    
    
    
}
