package devpatika;

public class TestArea {
    public static void main(String[] args) {
        Circle circle = new Circle(2.0, "Black");
        System.out.println(circle.getColor() + " Circle area is: " + circle.getArea());

        Cylinder cylinder = new Cylinder(2.0, "Blue", 2.0 );
        System.out.println(" Cylinder volume is: " + cylinder.getVolume());
        System.out.println(cylinder.getColor() + " Cylinder area is: " + cylinder.getArea());

    }
}
