public abstract class Shape {
    private String name;

    public String getName() {
        return name;
    }
    public abstract double perimetr();

    public void setName(String name) {
        this.name = name;
    }

    public Shape(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "name='" + name + '\'' +
                '}';
    }
}
