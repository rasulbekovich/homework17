public class Treangel extends Shape {
    private int length;

    public Treangel(String name, int length) {
        super(name);
        this.length = length;
    }


    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public double perimetr() {
        return length*3;
    }

    @Override
    public String toString() {
        return  super.toString()+
                "Treangel{" +
                "length=" + length +
                "} " ;
    }
}