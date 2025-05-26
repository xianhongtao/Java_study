package Experience4.Q1;

public class AreaAndLength {
    public static void main(String args[]) {
        double length, area;
        Circle circle1 = null, circle2;
        Trangle trangle;
        Lader lader;
        circle1 = new Circle(2.3);
        circle2 = new Circle(0);
        circle2.setCircle(3);
        trangle = new Trangle(3, 4, 5);
        lader = new Lader(3, 8, 5);
        length = circle1.getLength();

        System.out.println("圆1的周长:" + length);
        area = circle1.getArea();
        System.out.println("圆1的面积:" + area);
        length = circle2.getLength();

        System.out.println("圆2的周长:" + length);
        area = circle2.getArea();
        System.out.println("圆2的面积:" + area);
        length = trangle.getLength();

        System.out.println("三角形的周长:" + length);
        area = trangle.getArea();
        System.out.println("三角形的面积:" + area);
        area = lader.getArea();
        System.out.println("梯形的面积:" + area);
        trangle.changTrangle(12, 34, 1);

        length = trangle.getLength();

        System.out.println("三角形的面积:" + area);
        area = trangle.getArea();

        System.out.println("三角形的周长:" + length);

        circle2.changRadius(114514); // 修改半径并输出
        System.out.println("圆2的半径改变为:" + 114514);
        System.out.println("圆2的周长:" + circle2.getLength());
        System.out.println("圆2的面积:" + circle2.getArea());

    }
}

class Trangle {
    public double sideA;
    double sideB;
    private double sideC;
    private boolean boo;

    public Trangle(double a, double b, double c) {
        sideA = a;
        sideB = b;
        sideC = c;
        if (a < b + c && b < a + c && c < a + b) {
            boo = true;
        } else {
            boo = false;
        }
    }

    public void setTrangle(double a, double b, double c) {
        sideA = a;
        sideB = b;
        sideC = c;
        if (a < b + c && b < a + c && c < a + b) {
            boo = true;
        } else {
            boo = false;
        }
    }

    public void changTrangle(double newA, double newB, double newC) {
        sideA = newA;
        sideB = newB;
        sideC = newC;
        if (sideA < sideB + sideC && sideB < sideA + sideC && sideC < sideA + sideB) {
            boo = true;
        } else {
            boo = false;
        }

    }

    public double getLength() {
        double length;
        length = sideA + sideB + sideC;
        return length;
    }

    public double getArea() {
        if (boo) {
            double area;
            double p = (sideA + sideB + sideC) / 2.0;
            area = Math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideC));
            return area;
        } else {
            System.out.println("不是一个三角形,不能计算面积");
            return 0;
        }
    }

    public double getSideA() { // 返回A边
        return sideA;
    }

    public double getSideB() { // 返回B边
        return sideB;
    }

    public double getSideC() { // 返回C边
        return sideC;
    }

}

class Lader {
    private double above;
    private double bottom;
    private double height;

    Lader(double a, double b, double h) {
        above = a;
        bottom = b;
        height = h;
    }

    double getArea() {
        double area;
        area = (above + bottom) * height / 2;
        return area;
    }
}

class Circle {
    private double radius;

    Circle(double r) {
        radius = r;
    }

    public void setCircle(double r) {
        radius = r;
    }

    double getArea() {
        return 3.14 * radius * radius;
    }

    double getLength() {
        return 2 * 3.14 * radius;
    }

    void changRadius(double newRadius) {
        radius = newRadius;
    }

}
