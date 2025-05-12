package Experience4;

public class Circle {
    public double radius = 10, area, circumference;
    public void getLength() {
        circumference = 2 * Math.PI * radius;
    }
    public void getArea() {
        area = Math.PI * radius * radius;
    }
    public void show() {
        System.out.println("radius = " + radius);
        System.out.println("area = " + area);
        System.out.println("circumference = " + circumference);
    }
}
