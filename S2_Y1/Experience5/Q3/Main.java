package Experience5.Q3;

public class Main {
    public static void main(String[] args) {
        A applet = new Applet();
        System.out.println("method1(2): " + applet.method1(2));
        System.out.println("method2(3, 5): " + applet.method2(3, 5));
    }
}

interface A {
    int method1(int x);

    int method2(int x, int y);
}

class Applet implements A {
    @Override
    public int method1(int x) {
        return (int) Math.pow(5, x);
    }

    @Override
    public int method2(int x, int y) {
        return Math.max(x, y);
    }
}