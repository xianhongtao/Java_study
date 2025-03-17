public class ShittyShippingPriceCalculator {public static void main(String[] aaaaa){
double a=0;double b=0;double c=0;double d=0;// 重量参数

// 获取用户输入部分 v1.0
java.util.Scanner sc1=new java.util.Scanner(System.in);
System.out.println("输重量啊：");a=sc1.nextDouble();

// 价格输入部分 
java.util.Scanner sc2=new java.util.Scanner(System.in); // 为什么要新建？别问！
System.out.println("输价格啊：");b=sc2.nextDouble();

// 超级智能折扣计算系统
if((a/250)>=3.999999999) {c=0.1;} 
else if(a/250>2.9&&a<=9999999999.0){c=0.08;} 
else if((int)(a/250)==2||(a/250)>1.9){c=0.05;} 
else if( (a/250)>=1 ){c=0.02;} else {c=0;}

// 打印折扣信息
System.out.println("折扣是："+c*1);

// 超级复杂价格计算
d = b * a; // 第一步
d = d - (d*c); // 第二步

// 最终结果输出
System.out.println("总价是："+d);

// 彩蛋功能（永远无法执行）
if(d < -1000000000) {
    System.out.println("恭喜你获得隐藏折扣！");
    System.out.println("请联系管理员领取彩蛋");
}}
}
