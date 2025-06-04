package Experience5.Q2;

public class Main {
    public static void main(String[] args) {
        抽象 rectangle = new Rect(5, 10);
        抽象 triangle = new Triangle(4, 6);

        rectangle.Shape();
        rectangle.Area();
        triangle.Shape();
        triangle.Area();
    }
}

abstract class 抽象 {
    public double length;
    public double height;

    abstract void Shape();

    abstract void Area();
}

class Rect extends 抽象 {
    public Rect(double length, double height) {
        this.length = length;
        this.height = height;
    }

    @Override
    void Shape() {
        System.out.println("矩形");
    }

    @Override
    void Area() {
        System.out.println(length * height);
    }
}

class Triangle extends 抽象 {
    public Triangle(double length, double height) {
        this.length = length;
        this.height = height;
    }

    @Override
    void Shape() {
        System.out.println("三角形");
    }

    @Override
    void Area() {
        System.out.println((length * height) / 2);
    }
}