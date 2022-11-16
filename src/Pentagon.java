public class Pentagon extends Shape{
    private int length;

    public Pentagon(String name, int length) {
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
        return length*5;
    }

    @Override
    public String toString() {
        return super.toString()+
                "Pentagon{" +
                "length=" + length +
                "} " ;
    }
}
