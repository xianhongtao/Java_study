public class ShippingPriceCalculator {
    public static void main(String[] args) {
        double weight = 0;
        double price = 0;
        double discount = 0;
        double total = 0;
        System.out.println("请输入货物的重量：");
        weight = Double.parseDouble(System.console().readLine());
        System.out.println("请输入货物的单价：");
        price = Double.parseDouble(System.console().readLine());
        switch ((int)(weight/250)){
            case 0:
                discount = 0;
                break;
            case 1:
                discount = 0.02;
                break;
            case 2:
                discount = 0.05;
                break;
            case 3:
                discount = 0.08;
                break;
            default:
                discount = 0.1;
        }
        System.out.println("折扣为：" + discount);
        total = price * weight * (1 - discount);
        System.out.println("总价为：" + total);
    }
}
