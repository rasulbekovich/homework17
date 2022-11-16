public class Main {
    public static void main(String[] args) {
        Shape square=new Square("sguare",4);
        System.out.println(square+" "+square.perimetr());
        Shape treangel=new Treangel("treangel",4);
        System.out.println(treangel+" "+treangel.perimetr());
        Shape pentagon=new Pentagon("pentagon",4);
        System.out.println(pentagon+" "+pentagon.perimetr());
            }
}