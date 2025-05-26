package Experience4.Q1;

public class Main {
    public static void main(String[] args) {
        Cone cone = new Cone(5, 10);
        System.out.println("底面积: " + cone.GetBottomArea());
        System.out.println("体积: " + cone.GetVolume());
    }
}

class Cone {
    double radius, height;

    public Cone(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    public double GetBottomArea() {
        return Math.PI * radius * radius;
    }

    public double GetVolume() {
        return (1.0 / 3) * Math.PI * radius * radius * height;
    }
}