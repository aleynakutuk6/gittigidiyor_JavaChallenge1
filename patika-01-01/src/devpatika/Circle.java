package devpatika;

import java.util.Objects;

public class Circle {

    // instance variables (fields)
    private double radius;
    private String color;

    //constructors
    public Circle(double radius) {
        this.radius = radius;
    }
    public Circle() {
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    // custom methods

    public double getArea() {
        // double result = Math.PI * Math.pow(this.getRadius(),2);
        return Math.PI * Math.pow(this.getRadius(),2);
    }

    // getters & setters
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    // equals & hashCode & toString

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Circle)) return false;
        Circle circle = (Circle) o;
        return Double.compare(circle.getRadius(), getRadius()) == 0 && getColor().equals(circle.getColor());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getRadius(), getColor());
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }
}
