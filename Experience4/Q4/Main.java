package Experience4.Q4;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee();
        System.out.println("员工姓名: " + employee.employeeName);
        System.out.println("员工性别: " + (employee.isGenderMale ? "男" : "女"));
        System.out.println("工作年限: " + employee.totalWorkYears + "年");
        System.out.println("基本工资: " + employee.baseSalary + "元");
        System.out.println("岗位津贴: " + employee.positionAllowance + "元");
        System.out.println("绩效奖金: " + employee.performanceBonus + "元");
        System.out.println("应纳税额: " + employee.calculateTax() + "元");
        System.out.println("实际工资: " + employee.actualSalary() + "元");
    }

}

class Employee {
    String employeeName;
    boolean isGenderMale;
    int totalWorkYears;
    double baseSalary;
    double positionAllowance;
    double performanceBonus;

    Employee() {
        employeeName = "周雪刚";
        isGenderMale = true;
        totalWorkYears = 10;
        baseSalary = 10000;
        positionAllowance = 2000;
        performanceBonus = 5000;
    }

    double calculateTax() {
        double tax = 0;
        double totalSalary = baseSalary + positionAllowance + performanceBonus;
        if (totalSalary <= 3500) {
            tax = 0;
        } else {
            double var = totalSalary - 3500;
            tax = var * 0.03;
        }
        return tax;
    }

    double actualSalary() {
        double totalSalary = baseSalary + positionAllowance + performanceBonus;
        double tax = calculateTax();
        return totalSalary - tax;
    }
}