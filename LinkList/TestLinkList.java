package LinkList;

/**
 * 单链表测试类
 * 在main方法中测试整型和字符型两种类型的单链表
 * 帮助学生理解泛型的使用和链表操作
 */
public class TestLinkList {

    // ==================== 学生需要实现的特殊算法方法 ====================

    /**
     * 使用快慢指针法查找链表的中间结点（学生实现）
     * 算法要求：必须使用快慢指针算法，不能直接计算长度
     * 
     * @param list 要查找中间结点的链表
     * @return 中间位置的元素值
     */
    public static Integer findMiddleElement(LinkListClass<Integer> list) {
        // TODO: 学生需要实现
        // 提示：调用链表对象的findMiddleByFastSlow()方法
        // 算法思路：
        // 1. 设置快指针和慢指针都指向首结点
        // 2. 快指针每次移动两步，慢指针每次移动一步
        // 3. 当快指针到达末尾时，慢指针正好在中间位置
        return list.findMiddleByFastSlow();
    }

    /**
     * 使用二路归并法合并两个有序链表（学生实现）
     * 算法要求：必须使用二路归并算法
     * 
     * @param listA 第一个有序链表
     * @param listB 第二个有序链表
     * @return 合并后的有序链表
     */
    public static LinkListClass<Integer> mergeOrderedLists(
            LinkListClass<Integer> listA, LinkListClass<Integer> listB) {
        // TODO: 学生需要实现
        // 提示：调用LinkListClass的静态方法mergeSortedLists
        // 算法思路：
        // 1. 创建新的结果链表
        // 2. 使用两个指针分别遍历两个输入链表
        // 3. 比较当前结点值，将较小者添加到结果链表
        // 4. 处理剩余结点

    }

    // ==================== 主测试方法 ====================

    /**
     * 主方法 - 程序入口
     * 
     * @param args 命令行参数
     */
    public static void main(String[] args) {
        System.out.println("================ 单链表实验测试 ================");

        // ========== 测试1：整型数据单链表基本操作 ==========
        System.out.println("\n========== 测试1：整型数据单链表基本操作 ==========");

        // 1. 创建一个存储Integer类型的单链表对象
        System.out.println("1. 创建整型单链表：");
        // TODO: 学生需要实现
        // 提示：LinkListClass<Integer> intList = new LinkListClass<>();

        // 2. 测试尾插法createListR方法：用数组整体创建单链表
        System.out.println("\n2. 测试尾插法createListR方法：");
        System.out.println("用数组{10, 20, 30, 40, 50}创建单链表");
        Integer[] arr = { 10, 20, 30, 40, 50 };
        // TODO: 学生需要实现
        // 提示：
        // intList.createListR(arr);
        // System.out.println("创建后的链表：" + intList.toString());
        // System.out.println("链表长度：" + intList.size());

        // 3. 测试头插法createListF方法：用数组整体创建单链表
        System.out.println("\n3. 测试头插法createListF方法：");
        System.out.println("用数组{1, 2, 3}创建新链表（注意：会覆盖原链表）");
        LinkListClass<Integer> intList2 = new LinkListClass<>();
        Integer[] arr2 = { 1, 2, 3 };
        intList2.createListF(arr2);
        System.out.println("头插法创建的链表：" + intList2.toString());
        System.out.println("注意：头插法创建的链表元素顺序与数组相反");

        // 继续使用尾插法创建的链表进行后续测试

        // 4. 测试add方法：向单链表末尾添加元素
        System.out.println("\n4. 测试add方法：");
        System.out.println("向链表末尾添加元素60, 70");
        // TODO: 学生需要实现
        // 提示：
        // intList.add(60);
        // intList.add(70);
        // System.out.println("添加后的链表：" + intList.toString());
        // System.out.println("链表长度：" + intList.size());

        // 5. 测试getElem和setElem方法
        System.out.println("\n5. 测试getElem和setElem方法：");
        // TODO: 学生需要实现
        // 提示：
        // System.out.println("获取索引为2的元素：" + intList.getElem(2));
        // intList.setElem(1, 999);
        // System.out.println("将索引为1的元素设置为999后：" + intList.toString());

        // 6. 测试getNo方法：查找元素
        System.out.println("\n6. 测试getNo方法：");
        // TODO: 学生需要实现
        // 提示：
        // int pos1 = intList.getNo(30);
        // int pos2 = intList.getNo(100);
        // System.out.println("值为30的元素索引位置：" + pos1);
        // System.out.println("值为100的元素索引位置：" + pos2 + "（-1表示不存在）");

        // 7. 测试insert方法：在指定位置插入元素
        System.out.println("\n7. 测试insert方法：");
        System.out.println("在索引为2的位置插入元素25");
        // TODO: 学生需要实现
        // 提示：
        // intList.insert(2, 25);
        // System.out.println("插入后的链表：" + intList.toString());
        // System.out.println("链表长度：" + intList.size());

        // 8. 测试delete方法：删除指定位置的元素
        System.out.println("\n8. 测试delete方法：");
        System.out.println("删除索引为0的元素");
        // TODO: 学生需要实现
        // 提示：
        // System.out.println("删除前：" + intList.toString());
        // intList.delete(0);
        // System.out.println("删除后：" + intList.toString());
        // System.out.println("链表长度：" + intList.size());

        // 9. 测试swap方法：交换两个位置的元素
        System.out.println("\n9. 测试swap方法：");
        System.out.println("交换索引为0和索引为2的元素");
        // TODO: 学生需要实现
        // 提示：
        // System.out.println("交换前：" + intList.toString());
        // intList.swap(0, 2);
        // System.out.println("交换后：" + intList.toString());

        // 10. 测试setSize方法：设置链表长度
        System.out.println("\n10. 测试setSize方法：");
        System.out.println("将链表长度设置为4");
        // TODO: 学生需要实现
        // 提示：
        // System.out.println("设置前：" + intList.toString() + "，长度：" + intList.size());
        // intList.setSize(4);
        // System.out.println("设置后：" + intList.toString() + "，长度：" + intList.size());

        // 11. 测试异常处理
        System.out.println("\n11. 测试异常处理：");
        System.out.println("尝试访问无效索引...");
        // TODO: 学生需要实现
        // 提示：
        // try {
        // intList.getElem(-1); // 无效索引
        // } catch (IllegalArgumentException e) {
        // System.out.println("捕获异常：" + e.getMessage());
        // }
        //
        // try {
        // intList.getElem(100); // 超出范围的索引
        // } catch (IllegalArgumentException e) {
        // System.out.println("捕获异常：" + e.getMessage());
        // }

        // ========== 测试2：特殊算法 - 快慢指针法寻找中间结点 ==========
        System.out.println("\n\n========== 测试2：特殊算法 - 快慢指针法寻找中间结点 ==========");

        // 创建测试链表
        System.out.println("创建测试链表用于快慢指针算法：");
        LinkListClass<Integer> middleTestList = new LinkListClass<>();
        Integer[] testArr = { 1, 2, 3, 4, 5, 6, 7 };
        middleTestList.createListR(testArr);
        System.out.println("测试链表：" + middleTestList.toString());
        System.out.println("链表长度：" + middleTestList.size());

        // 测试快慢指针法
        System.out.println("\n测试快慢指针法寻找中间结点：");
        try {
            Integer middle = findMiddleElement(middleTestList); // 调用学生实现的方法
            System.out.println("链表的中间元素是：" + middle);
        } catch (Exception e) {
            System.out.println("异常：" + e.getMessage());
        }

        // 测试不同长度的链表
        System.out.println("\n测试不同长度链表的中间元素：");

        // 测试偶数长度
        LinkListClass<Integer> evenList = new LinkListClass<>();
        Integer[] evenArr = { 1, 2, 3, 4 };
        evenList.createListR(evenArr);
        System.out.println("偶数长度链表：" + evenList.toString());
        try {
            System.out.println("中间元素：" + findMiddleElement(evenList));
        } catch (Exception e) {
            System.out.println("异常：" + e.getMessage());
        }

        // 测试奇数长度
        LinkListClass<Integer> oddList = new LinkListClass<>();
        Integer[] oddArr = { 1, 2, 3, 4, 5 };
        oddList.createListR(oddArr);
        System.out.println("奇数长度链表：" + oddList.toString());
        try {
            System.out.println("中间元素：" + findMiddleElement(oddList));
        } catch (Exception e) {
            System.out.println("异常：" + e.getMessage());
        }

        // ========== 测试3：特殊算法 - 二路归并法合并有序链表 ==========
        System.out.println("\n\n========== 测试3：特殊算法 - 二路归并法合并有序链表 ==========");

        // 创建两个有序链表进行测试
        System.out.println("创建两个有序链表进行合并测试：");
        LinkListClass<Integer> sortedListA = new LinkListClass<>();
        LinkListClass<Integer> sortedListB = new LinkListClass<>();

        Integer[] arrA = { 1, 3, 5, 7, 9 };
        Integer[] arrB = { 2, 4, 6, 8, 10, 12 };

        sortedListA.createListR(arrA);
        sortedListB.createListR(arrB);

        System.out.println("有序链表A：" + sortedListA.toString());
        System.out.println("有序链表B：" + sortedListB.toString());

        // 测试二路归并
        System.out.println("\n使用二路归并法合并两个有序链表：");
        try {
            LinkListClass<Integer> mergedList = mergeOrderedLists(sortedListA, sortedListB); // 调用学生实现的方法
            System.out.println("合并后的有序链表：" + mergedList.toString());
            System.out.println("合并后链表长度：" + mergedList.size());
        } catch (Exception e) {
            System.out.println("异常：" + e.getMessage());
        }

        // 测试其他情况的二路归并
        System.out.println("\n测试其他情况的二路归并：");

        // 测试一个链表为空的情况
        LinkListClass<Integer> emptyList = new LinkListClass<>();
        LinkListClass<Integer> normalList = new LinkListClass<>();
        Integer[] normalArr = { 1, 2, 3 };
        normalList.createListR(normalArr);

        try {
            LinkListClass<Integer> merged1 = mergeOrderedLists(emptyList, normalList);
            System.out.println("空链表与正常链表合并：" + merged1.toString());
        } catch (Exception e) {
            System.out.println("异常：" + e.getMessage());
        }

        // 测试长度不同的链表
        LinkListClass<Integer> shortList = new LinkListClass<>();
        LinkListClass<Integer> longList = new LinkListClass<>();
        Integer[] shortArr = { 1, 5 };
        Integer[] longArr = { 2, 3, 4, 6, 7, 8 };
        shortList.createListR(shortArr);
        longList.createListR(longArr);

        try {
            LinkListClass<Integer> merged2 = mergeOrderedLists(shortList, longList);
            System.out.println("短链表：" + shortList.toString());
            System.out.println("长链表：" + longList.toString());
            System.out.println("合并结果：" + merged2.toString());
        } catch (Exception e) {
            System.out.println("异常：" + e.getMessage());
        }

        // ========== 测试4：字符型数据单链表 ==========
        System.out.println("\n\n========== 测试4：字符型数据单链表 ==========");
        System.out.println("演示泛型的使用 - 同一个链表类可以存储不同类型的数据");

        // 1. 创建一个存储Character类型的单链表对象
        System.out.println("\n1. 创建字符型单链表：");
        // TODO: 学生需要实现
        // 提示：LinkListClass<Character> charList = new LinkListClass<>();

        // 2. 测试createListR方法：用字符数组创建单链表
        System.out.println("\n2. 用字符数组{'A', 'B', 'C', 'D'}创建单链表：");
        Character[] charArr = { 'A', 'B', 'C', 'D' };
        // TODO: 学生需要实现
        // 提示：
        // charList.createListR(charArr);
        // System.out.println("字符链表：" + charList.toString());
        // System.out.println("链表长度：" + charList.size());

        // 3. 测试add方法：添加更多字符
        System.out.println("\n3. 添加字符'E', 'F'：");
        // TODO: 学生需要实现
        // 提示：
        // charList.add('E');
        // charList.add('F');
        // System.out.println("添加后的字符链表：" + charList.toString());

        // 4. 测试insert方法：在中间插入字符
        System.out.println("\n4. 在索引为2的位置插入字符'X'：");
        // TODO: 学生需要实现
        // 提示：
        // charList.insert(2, 'X');
        // System.out.println("插入后的字符链表：" + charList.toString());

        // 5. 测试getElem方法：获取指定位置的字符
        System.out.println("\n5. 获取索引为3的字符：");
        // TODO: 学生需要实现
        // 提示：
        // Character ch = charList.getElem(3);
        // System.out.println("索引为3的字符是：" + ch);

        // 6. 测试getNo方法：查找字符
        System.out.println("\n6. 查找字符'C'的位置：");
        // TODO: 学生需要实现
        // 提示：
        // int pos = charList.getNo('C');
        // System.out.println("字符'C'的位置：" + pos);

        // 7. 演示字符型有序链表的二路归并
        System.out.println("\n7. 演示字符型有序链表的二路归并：");
        LinkListClass<Character> charListA = new LinkListClass<>();
        LinkListClass<Character> charListB = new LinkListClass<>();

        Character[] charArrA = { 'A', 'C', 'E', 'G' };
        Character[] charArrB = { 'B', 'D', 'F', 'H' };

        charListA.createListR(charArrA);
        charListB.createListR(charArrB);

        System.out.println("字符链表A：" + charListA.toString());
        System.out.println("字符链表B：" + charListB.toString());

        try {
            LinkListClass<Character> charMerged = LinkListClass.mergeSortedLists(charListA, charListB);
            System.out.println("合并后的字符链表：" + charMerged.toString());
        } catch (Exception e) {
            System.out.println("异常：" + e.getMessage());
        }

        // 8. 总结对比
        System.out.println("\n8. 总结对比不同类型的链表：");
        // TODO: 学生需要实现
        // 提示：输出最终状态的各种链表
        // System.out.println("整型链表最终状态：" + intList.toString());
        // System.out.println("字符型链表最终状态：" + charList.toString());
        // System.out.println("\n总结：同一个LinkListClass类，通过泛型可以存储不同类型的数据！");

        System.out.println("\n================ 测试完成 ================");
        System.out.println("请确保你的实现通过了所有测试用例！");
        System.out.println("特别注意：");
        System.out.println("1. 快慢指针法必须使用两个指针，快指针每次移动两步，慢指针每次移动一步");
        System.out.println("2. 二路归并法要求输入的链表必须是有序的");
        System.out.println("3. 注意头插法和尾插法创建链表时元素顺序的不同");
        System.out.println("4. 学生需要完成：findMiddleElement()和mergeOrderedLists()两个方法的实现");
    }
}
