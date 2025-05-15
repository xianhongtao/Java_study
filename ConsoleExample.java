import java.io.Console;

public class ConsoleExample {
    public static void main(String[] args) {
        Console console = System.console();
        if (console == null) {
            System.err.println("请在命令行环境中运行此程序");
            System.exit(1);
        }

        // 读取字符串
        String name = console.readLine("请输入您的姓名: ");

        // 读取整数（需要转换）
        int age = Integer.parseInt(console.readLine("请输入您的年龄: "));

        // 读取浮点数（需要转换）
        double height = Double.parseDouble(
                console.readLine("请输入身高（米）: "));

        // 读取密码（不会回显）
        char[] password = console.readPassword("请输入密码: ");

        console.printf("\n用户信息：%n");
        console.printf("姓名: %s%n", name);
        console.printf("年龄: %d%n", age);
        console.printf("身高: %.2f米%n", height);
        console.printf("密码长度: %d%n", password.length);

        // 清除密码字符数组
        java.util.Arrays.fill(password, ' ');
    }
}
