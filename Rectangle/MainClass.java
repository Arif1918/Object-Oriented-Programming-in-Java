package Rectangle;

public class MainClass {
    public static void main(String[] args) {

        Rectangle rc = new Rectangle(20,10);

        rc.setWidth(55);
        rc.setHeight(15);

        System.out.println("Area: "+rc.area());
        System.out.println("Perimeter: "+rc.perimeter());
    }
}
