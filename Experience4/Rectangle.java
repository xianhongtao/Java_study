package Experience4;

public class Rectangle {
    public double length = 10, width = 8, area, circumference;
    public void getLength() {
        circumference = 2 * (length + width);
    }
    public void getArea() {
        area = length * width;
    }
    public void show() {
        System.out.println("length = " + length);
        System.out.println("width = " + width);
        System.out.println("area = " + area);
        System.out.println("circumference = " + circumference);
    }
}
