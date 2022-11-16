public class Square extends Shape {
    private int length;

    public Square(String name, int length) {
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

        return length*4;
    }

    @Override
    public String toString() {
        return super.toString()+
                "Square{" +
                "length=" + length +
                "} " ;
    }
}





