package DTO;

public abstract class Organization {

    protected int size;

    //Ham khoi tao k doi so
    public Organization() {
        this.size = 0;
    }

    //Ham khoi tao co doi so
    public Organization(int size) {
        this.size = size;
    }

    //Ham get,set
    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    //Ham abstract
    public abstract void communicateByTool();

    //Ham toString
    @Override
    public String toString() {
        return "The organization’s size is " + size;
    }

}
