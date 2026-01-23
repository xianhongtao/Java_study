/**
 * 数据结构实验 - 排序算法
 * 
 * 实验目的：
 * 1. 掌握直接插入排序的基本思想和算法实现
 * 2. 掌握希尔排序的基本思想和算法实现
 * 3. 掌握冒泡排序的基本思想和算法实现
 * 4. 掌握快速排序的基本思想和算法实现
 * 5. 掌握简单选择排序的基本思想和算法实现
 * 
 * 实验要求：
 * 完成下面标注 "TODO" 的各个排序算法的核心代码
 */

/**
 * 顺序表元素类型
 */
class RecType {
    int key; // 存放关键字，假设关键字为int类型
    String data; // 存放其他数据，假设为String类型

    public RecType(int key) { // 构造方法
        this.key = key;
    }
}

/**
 * 顺序表排序类
 */
class SqListSortClass {
    final int MAX_ELEMENTS = 100; // 表示最多元素个数
    RecType[] ElementsList; // 存放排序的元素
    int n; // 实际元素个数

    /**
     * 交换R[i]和R[j]
     */
    public void swap(int i, int j) {
        RecType tmp = ElementsList[i];
        ElementsList[i] = ElementsList[j];
        ElementsList[j] = tmp;
    }

    /**
     * 由关键字序列a构造顺序表R[0..n-1]
     */
    public void CreateR(int[] a) {
        ElementsList = new RecType[MAX_ELEMENTS];
        for (int i = 0; i < a.length; i++)
            ElementsList[i] = new RecType(a[i]);
        n = a.length;
    }

    /**
     * 输出顺序表R[0..n-1]
     */
    public void Disp() {
        for (int i = 0; i < n; i++)
            System.out.print(ElementsList[i].key + " ");
        System.out.println();
    }

    /**
     * 由关键字序列a构造R[1..n]，用于堆排序
     */
    public void CreateR1(int[] a) {
        ElementsList = new RecType[MAX_ELEMENTS];
        for (int i = 0; i < a.length; i++)
            ElementsList[i + 1] = new RecType(a[i]);
        n = a.length;
    }

    /**
     * 输出顺序表R[1..n]，用于堆排序
     */
    public void Disp1() {
        for (int i = 1; i <= n; i++)
            System.out.print(ElementsList[i].key + " ");
        System.out.println();
    }

    // ==================== 以下是需要学生完成的排序算法 ====================

    /**
     * 【实验任务1】直接插入排序
     * 对R[0..n-1]按递增有序进行直接插入排序
     * 
     * 算法思路：
     * 1. 将序列分为有序区R[0..i-1]和无序区R[i..n-1]
     * 2. 每趟将无序区的第一个元素R[i]插入到有序区的适当位置
     * 3. 在有序区中从后向前查找插入位置，边查找边后移元素
     */
    public void InsertSort() {
        RecType tmp;
        int j;

        // TODO: 请在下面完成直接插入排序算法
        // 提示：
        // 1. 外层循环：从第2个元素(即R[1])开始，遍历到最后一个元素
        // 2. 判断R[i]是否小于R[i-1]（即是否反序）
        // 3. 如果反序：
        // a. 用tmp保存R[i]
        // b. 在有序区R[0..i-1]中从右向左找R[i]的插入位置
        // c. 将关键字大于tmp.key的元素后移
        // d. 在找到的位置插入tmp

        /* ========== 在此处编写代码 ========== */
        for (int i = 1; i < n; i++) {
            if (ElementsList[i].key < ElementsList[i - 1].key) {
                tmp = ElementsList[i];
                j = i - 1;
                while (j >= 0 && ElementsList[j].key > tmp.key) {
                    ElementsList[j + 1] = ElementsList[j];
                    j--;
                }
                ElementsList[j + 1] = tmp;
            }
        }
        /* ========== 代码结束 ========== */
    }

    /**
     * 【实验任务2】希尔排序
     * 对R[0..n-1]按递增有序进行希尔排序
     * 增量序列取 d1=n/2, d(i+1)=d(i)/2
     * 
     * 算法思路：
     * 1. 选取增量d，将元素分成d组
     * 2. 对每组进行直接插入排序
     * 3. 缩小增量d，重复上述过程，直到d=1
     */
    public void ShellSort() {
        RecType tmp;
        int d = n / 2; // 增量置初值

        // TODO: 请在下面完成希尔排序算法
        // 提示：
        // 1. 外层循环：当d>0时循环
        // 2. 中层循环：对所有相隔d位置的元素组采用直接插入排序，i从d开始
        // 3. 内层循环：对相隔d位置的元素进行比较和移动
        // 4. 每趟结束后，d = d / 2

        /* ========== 在此处编写代码 ========== */
        while (d > 0) {
            for (int i = d; i < n; i++) {
                if (ElementsList[i].key < ElementsList[i - d].key) {
                    tmp = ElementsList[i];
                    int j = i - d;
                    while (j >= 0 && ElementsList[j].key > tmp.key) {
                        ElementsList[j + d] = ElementsList[j];
                        j -= d;
                    }
                    ElementsList[j + d] = tmp;
                }
            }
            d = d / 2;
        }

        /* ========== 代码结束 ========== */
    }

    /**
     * 【实验任务3】冒泡排序
     * 对R[0..n-1]按递增有序进行冒泡排序
     * 
     * 算法思路：
     * 1. 从无序区的最后一个元素开始，相邻元素两两比较
     * 2. 如果反序则交换，使最小元素"冒泡"到无序区的最前端
     * 3. 如果某趟没有发生交换，说明已有序，可提前结束
     */
    public void BubbleSort() {
        boolean exchange = false;

        // TODO: 请在下面完成冒泡排序算法
        // 提示：
        // 1. 外层循环：进行n-1趟，i从0到n-2
        // 2. 每趟开始前将exchange置为false
        // 3. 内层循环：j从n-1到i+1，比较R[j]和R[j-1]
        // 4. 如果R[j].key < R[j-1].key，交换它们，并将exchange置为true
        // 5. 如果某趟exchange仍为false，说明已有序，提前返回

        /* ========== 在此处编写代码 ========== */
        for (int i = 0; i < n - 1; i++) {
            exchange = false;
            for (int j = n - 1; j >= i + 1; j--) {
                if (ElementsList[j].key < ElementsList[j - 1].key) {
                    swap(j, j - 1);
                    exchange = true;
                }
            }
            if (!exchange) {
                return;
            }
        }

        /* ========== 代码结束 ========== */
    }

    /**
     * 【实验任务4-1】快速排序的划分算法
     * 对R[s..t]进行一次划分，返回基准的最终位置
     * 
     * 算法思路：
     * 1. 以R[s]为基准base
     * 2. 从两端向中间遍历，将小于base的元素放左边，大于base的元素放右边
     * 3. 最后将基准放到最终位置
     */
    private int Partition(int s, int t) {
        int leftPointer = s, rightPointer = t;
        RecType base = ElementsList[s]; // 以表首元素为基准

        // TODO: 请在下面完成划分算法
        // 提示：
        // 1. 当i != j时循环
        // 2. 从后向前找一个小于base的元素R[j]
        // while (j > i && R[j].key >= base.key) j--;
        // 3. 如果j > i，将R[j]前移到R[i]位置，然后i++
        // 4. 从前向后找一个大于base的元素R[i]
        // while (i < j && R[i].key <= base.key) i++;
        // 5. 如果i < j，将R[i]后移到R[j]位置，然后j--
        // 6. 循环结束后，R[i] = base（基准归位）
        // 7. 返回i

        /* ========== 在此处编写代码 ========== */
        while (leftPointer != rightPointer) {
            while (rightPointer > leftPointer && ElementsList[rightPointer].key >= base.key) {
                rightPointer--;
            }
            if (rightPointer > leftPointer) {
                ElementsList[leftPointer] = ElementsList[rightPointer];
                leftPointer++;
            }
            while (leftPointer < rightPointer && ElementsList[leftPointer].key <= base.key) {
                leftPointer++;
            }
            if (leftPointer < rightPointer) {
                ElementsList[rightPointer] = ElementsList[leftPointer];
                rightPointer--;
            }
        }
        ElementsList[leftPointer] = base;
        /* ========== 代码结束 ========== */

        return leftPointer; // 如果上面代码中已有return语句，可删除此行
    }

    /**
     * 【实验任务4-2】快速排序
     * 对R[0..n-1]的元素按递增进行快速排序
     */
    public void QuickSort() {
        QuickSort1(0, n - 1);
    }

    /**
     * 对R[s..t]的元素进行快速排序（递归）
     */
    private void QuickSort1(int s, int t) {
        // TODO: 请在下面完成快速排序的递归算法
        // 提示：
        // 1. 判断s < t（表中至少存在两个元素）
        // 2. 调用Partition(s, t)进行划分，返回基准位置i
        // 3. 对左子表R[s..i-1]递归排序
        // 4. 对右子表R[i+1..t]递归排序

        /* ========== 在此处编写代码 ========== */
        if (s < t) {
            int i = Partition(s, t);
            QuickSort1(s, i - 1);
            QuickSort1(i + 1, t);
        }
        /* ========== 代码结束 ========== */
    }

    /**
     * 【实验任务5】简单选择排序
     * 对R[0..n-1]元素进行简单选择排序
     * 
     * 算法思路：
     * 1. 每趟从无序区R[i..n-1]中选出最小元素R[minj]
     * 2. 将R[minj]与无序区的首元素R[i]交换
     * 3. 有序区扩大一个元素，无序区缩小一个元素
     */
    public void SelectSort() {
        // TODO: 请在下面完成简单选择排序算法
        // 提示：
        // 1. 外层循环：进行n-1趟，i从0到n-2
        // 2. 设minj = i，表示当前最小元素的位置
        // 3. 内层循环：在R[i+1..n-1]中找最小元素
        // 如果R[j].key < R[minj].key，则minj = j
        // 4. 如果minj != i，交换R[i]和R[minj]

        /* ========== 在此处编写代码 ========== */
        for (int i = 0; i < n - 1; i++) {
            int minj = i;
            for (int j = i + 1; j < n; j++) {
                if (ElementsList[j].key < ElementsList[minj].key) {
                    minj = j;
                }
            }
            if (minj != i) {
                swap(i, minj);
            }
        }
        /* ========== 代码结束 ========== */
    }
}

/**
 * 主类 - 测试排序算法
 */
public class SortingExperiment {
    public static void main(String[] args) {
        // 测试数据
        int[] testData = { 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 };

        System.out.println("============ 排序算法实验 ============");
        System.out.println("原始数据: ");
        for (int i = 0; i < testData.length; i++) {
            System.out.print(testData[i] + " ");
        }
        System.out.println("\n");

        // 测试1：直接插入排序
        System.out.println("【测试1】直接插入排序");
        SqListSortClass sort1 = new SqListSortClass();
        sort1.CreateR(testData.clone());
        System.out.print("排序前: ");
        sort1.Disp();
        sort1.InsertSort();
        System.out.print("排序后: ");
        sort1.Disp();
        System.out.println();

        // 测试2：希尔排序
        System.out.println("【测试2】希尔排序");
        SqListSortClass sort2 = new SqListSortClass();
        sort2.CreateR(testData.clone());
        System.out.print("排序前: ");
        sort2.Disp();
        sort2.ShellSort();
        System.out.print("排序后: ");
        sort2.Disp();
        System.out.println();

        // 测试3：冒泡排序
        System.out.println("【测试3】冒泡排序");
        SqListSortClass sort3 = new SqListSortClass();
        sort3.CreateR(testData.clone());
        System.out.print("排序前: ");
        sort3.Disp();
        sort3.BubbleSort();
        System.out.print("排序后: ");
        sort3.Disp();
        System.out.println();

        // 测试4：快速排序
        System.out.println("【测试4】快速排序");
        SqListSortClass sort4 = new SqListSortClass();
        sort4.CreateR(testData.clone());
        System.out.print("排序前: ");
        sort4.Disp();
        sort4.QuickSort();
        System.out.print("排序后: ");
        sort4.Disp();
        System.out.println();

        // 测试5：简单选择排序
        System.out.println("【测试5】简单选择排序");
        SqListSortClass sort5 = new SqListSortClass();
        sort5.CreateR(testData.clone());
        System.out.print("排序前: ");
        sort5.Disp();
        sort5.SelectSort();
        System.out.print("排序后: ");
        sort5.Disp();
        System.out.println();

        // 额外测试：使用不同的测试数据
        System.out.println("============ 额外测试 ============");
        int[] testData2 = { 6, 8, 7, 9, 0, 1, 3, 2, 4, 5 };
        System.out.println("测试数据2: ");
        for (int i = 0; i < testData2.length; i++) {
            System.out.print(testData2[i] + " ");
        }
        System.out.println("\n");

        // 对测试数据2进行快速排序测试
        System.out.println("【快速排序测试】");
        SqListSortClass sort6 = new SqListSortClass();
        sort6.CreateR(testData2.clone());
        System.out.print("排序前: ");
        sort6.Disp();
        sort6.QuickSort();
        System.out.print("排序后: ");
        sort6.Disp();

        System.out.println("\n============ 实验结束 ============");
    }
}
