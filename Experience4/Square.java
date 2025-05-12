package Experience4;

public class Square extends Rectangle {
    public double side = 10, area;
    public Square() {
        length = side;
        width = side;
    }
    
    @Override
    public void show() {
        System.out.println("side = " + side);
        System.out.println("area = " + area);
        System.out.println("circumference = " + circumference);
    }
}