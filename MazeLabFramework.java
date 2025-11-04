/**
 * 数据结构实验:栈和队列的应用——迷宫问题求解
 * 
 * 实验说明:
 * 本实验包含四个主要部分:
 *   第一部分:顺序栈类的实现
 *   第二部分:循环队列类的实现
 *   第三部分:用栈求解迷宫问题(深度优先搜索)
 *   第四部分:用队列求解迷宫问题(广度优先搜索)
 * 
 * 学生需要完成的内容:
 *   1. 顺序栈类的成员变量声明和四个基本方法
 *   2. 循环队列类的成员变量声明和四个基本方法
 *   3. 用栈求解迷宫问题的核心算法
 *   4. 用队列求解迷宫问题的核心算法
 */

// ==================== 第一部分:顺序栈类(学生完成)====================

/**
 * 顺序栈泛型类
 * 
 * 【设计说明】
 * 1. 使用数组data存储栈元素
 * 2. top指针指向栈顶元素的位置
 * 3. 初始时top=-1表示空栈
 * 4. 栈满时需要扩容
 */
class SqStackClass<E> {

    // ========== 学生任务1:声明类的成员变量 ==========
    /**
     * 【学生任务】请声明以下成员变量:
     * 
     * 1. final int initcapacity = 10; // 顺序栈的初始容量(常量)
     * 2. private int capacity; // 存放顺序栈的当前容量
     * 3. private E[] data; // 存放顺序栈中的元素
     * 4. private int top; // 存放栈顶指针,指向栈顶元素
     * 
     * 请在下方编写代码:
     */
    // TODO: 学生完成 - 声明上述4个成员变量

    final int initcapacity = 10;
    private int capacity;
    private E[] data;
    private int top;

    /**
     * 构造方法:初始化顺序栈
     */
    @SuppressWarnings("unchecked")
    public SqStackClass() {
        data = (E[]) new Object[initcapacity]; // 强制转换为E类型数组
        capacity = initcapacity;
        top = -1; // 初始时栈为空
    }

    /**
     * 扩容方法:当栈满时,将容量扩大为原来的2倍(已完成)
     */
    @SuppressWarnings("unchecked")
    private void updatecapacity(int newcapacity) {
        E[] newdata = (E[]) new Object[newcapacity];
        for (int i = 0; i <= top; i++) {
            newdata[i] = data[i];
        }
        capacity = newcapacity;
        data = newdata;
    }

    // ========== 学生任务2:实现栈的四个基本运算 ==========

    /**
     * 判断栈是否为空
     * 
     * 【学生任务】请完成此方法
     * 
     * 【算法思路】
     * - 空栈的条件是:top == -1
     * - 返回该条件的判断结果
     * 
     * @return 栈空返回true,否则返回false
     */
    public boolean empty() {
        // TODO: 学生完成
        if (top == -1) {
            return true;
        } else {
            return false;
        } // 请修改
    }

    /**
     * 进栈操作
     * 
     * 【学生任务】请完成此方法
     * 
     * 【算法思路】
     * 1. 判断栈是否已满:检查 top == capacity - 1
     * 2. 如果栈满,调用 updatecapacity(2 * (top + 1)) 扩容
     * 3. 将 top 指针加1
     * 4. 将元素 e 存入 data[top] 位置
     * 
     * @param e 要压入栈的元素
     */
    public void push(E e) {
        // TODO: 学生完成
        if (top == capacity - 1) {
            updatecapacity(2 * (top + 1));
        }
        top++;
        data[top] = e;
    }

    /**
     * 出栈操作
     * 
     * 【学生任务】请完成此方法
     * 
     * 【算法思路】
     * 1. 判断栈是否为空,如果为空则抛出异常:
     * throw new IllegalArgumentException("栈空");
     * 2. 取出栈顶元素:E e = (E)data[top];
     * 3. 将 top 指针减1
     * 4. 如果满足缩容条件(容量大于初始容量 且 元素个数仅为容量的1/4),
     * 则调用 updatecapacity(capacity / 2) 缩容
     * 5. 返回取出的元素 e
     * 
     * @return 栈顶元素
     * @throws IllegalArgumentException 如果栈为空
     */
    public E pop() {
        // TODO: 学生完成
        if (empty()) {
            throw new IllegalArgumentException("栈空");
        } else {
            E e = (E) data[top];
            top--;
            if (capacity > initcapacity && top + 1 <= capacity / 4) {
                updatecapacity(capacity / 2);
            }
            return e; // 请修改
        }
    }

    /**
     * 取栈顶元素(不出栈)
     * 
     * 【学生任务】请完成此方法
     * 
     * 【算法思路】
     * 1. 判断栈是否为空,如果为空则抛出异常:
     * throw new IllegalArgumentException("栈空");
     * 2. 直接返回 data[top],不修改 top 指针
     * 
     * @return 栈顶元素
     * @throws IllegalArgumentException 如果栈为空
     */
    public E peek() {
        // TODO: 学生完成
        if (empty()) {
            throw new IllegalArgumentException("栈空");
        } else {
            E e = (E) data[top];
            return e; // 请修改
        }
    }
}

// ==================== 第二部分:循环队列类(学生完成)====================

/**
 * 循环队列泛型类
 * 
 * 【设计说明】
 * 1. 使用数组data存储队列元素
 * 2. front指向队头元素的前一个位置
 * 3. rear指向队尾元素的位置
 * 4. 初始时front=0, rear=0表示空队
 * 5. 采用"少用一个元素空间"的方法区分队空和队满
 */
class CSqQueueClass<E> {

    // ========== 学生任务3:声明类的成员变量 ==========
    /**
     * 【学生任务】请声明以下成员变量:
     * 
     * 1. final int MaxSize = 100; // 循环队列的容量(常量)
     * 2. private E[] data; // 存放队列中的元素
     * 3. private int front; // 队头指针
     * 4. private int rear; // 队尾指针
     * 
     * 请在下方编写代码:
     */
    // TODO: 学生完成 - 声明上述4个成员变量

    final int MaxSize = 100;
    private E[] data;
    private int front;
    private int rear;

    /**
     * 构造方法:初始化循环队列
     */
    @SuppressWarnings("unchecked")
    public CSqQueueClass() {
        data = (E[]) new Object[MaxSize];
        front = 0;
        rear = 0; // 初始时队列为空
    }

    // ========== 学生任务4:实现队列的四个基本运算 ==========

    /**
     * 判断队列是否为空
     * 
     * 【学生任务】请完成此方法
     * 
     * 【算法思路】
     * - 队空的条件是:front == rear
     * - 返回该条件的判断结果
     * 
     * @return 队空返回true,否则返回false
     */
    public boolean empty() {
        // TODO: 学生完成
        if (front == rear) {
            return true;
        }
        return false; // 请修改
    }

    /**
     * 进队操作
     * 
     * 【学生任务】请完成此方法
     * 
     * 【算法思路】
     * 1. 判断队列是否已满:检查 (rear + 1) % MaxSize == front
     * 2. 如果队满,抛出异常:throw new IllegalArgumentException("队满");
     * 3. 将 rear 指针循环加1:rear = (rear + 1) % MaxSize
     * 4. 将元素 e 存入 data[rear] 位置
     * 
     * @param e 要加入队列的元素
     * @throws IllegalArgumentException 如果队列已满
     */
    public void push(E e) {
        // TODO: 学生完成
        if ((rear + 1) % MaxSize == front) {
            throw new IllegalArgumentException("队满");
        } else {
            rear = (rear + 1) % MaxSize;
            data[rear] = e;
        }
    }

    /**
     * 出队操作
     * 
     * 【学生任务】请完成此方法
     * 
     * 【算法思路】
     * 1. 判断队列是否为空,如果为空则抛出异常:
     * throw new IllegalArgumentException("队空");
     * 2. 将 front 指针循环加1:front = (front + 1) % MaxSize
     * 3. 返回 data[front] 位置的元素
     * 
     * @return 队头元素
     * @throws IllegalArgumentException 如果队列为空
     */
    public E pop() {
        // TODO: 学生完成
        if (rear == front) {
            throw new IllegalArgumentException("队空");
        } else {
            front = (front + 1) % MaxSize;
            return data[front];
        }
    }

    /**
     * 取队头元素(不出队)
     * 
     * 【学生任务】请完成此方法
     * 
     * 【算法思路】
     * 1. 判断队列是否为空,如果为空则抛出异常:
     * throw new IllegalArgumentException("队空");
     * 2. 返回 data[(front + 1) % MaxSize] 位置的元素,不修改 front 指针
     * 
     * @return 队头元素
     * @throws IllegalArgumentException 如果队列为空
     */
    public E peek() {
        // TODO: 学生完成
        if (rear == front) {
            throw new IllegalArgumentException("队空");
        } else {
            return data[(front + 1) % MaxSize];
        }
    }

    // ==================== 第三部分:用栈求解迷宫问题(学生完成核心算法)====================

    /**
     * 方块类(用于栈求解迷宫)
     * 
     * 【说明】
     * - i, j: 方块的行号和列号
     * - di: 下一个可走相邻方位的方位号(0上、1右、2下、3左)
     */
    class Box {
        int i; // 方块的行号
        int j; // 方块的列号
        int di; // di是下一个可走相邻方位的方位号

        public Box(int i1, int j1, int di1) {
            i = i1;
            j = j1;
            di = di1;
        }
    }

    /**
     * 用栈求解迷宫路径类
     * 
     * 【迷宫说明】
     * - 迷宫数组mg中,0表示可走的通道,1表示不可走的墙壁
     * - 迷宫外围加了一圈1(墙壁),避免查找时出界
     * - 例如:4x4的实际迷宫,存储在6x6的数组中
     * 
     * 【方位编号】
     * - 0: 上方 (i-1, j)
     * - 1: 右方 (i, j+1)
     * - 2: 下方 (i+1, j)
     * - 3: 左方 (i, j-1)
     */
    class MazeClass1 {
        final int MaxSize = 20;
        int[][] mg;
        int m, n; // 迷宫的行数和列数

        public MazeClass1(int m1, int n1) {
            m = m1;
            n = n1;
            mg = new int[MaxSize][MaxSize];
        }

        /**
         * 设置迷宫数组
         */
        public void Setmg(int[][] a) {
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    mg[i][j] = a[i][j];
                }
            }
        }

        /**
         * 用栈求解一条从(xi,yi)到(xe,ye)的迷宫路径
         * 
         * 【学生任务】请完成此方法,使用栈实现深度优先搜索
         * 
         * 【算法思路】
         * 1. 创建一个Box类型的栈st(使用SqStackClass)
         * 
         * 2. 将入口方块(xi, yi)进栈,初始di设为-1:
         * - 创建入口Box对象:new Box(xi, yi, -1)
         * - 将其压入栈st
         * - 将mg[xi][yi]置为-1(标记为已访问,避免重复访问)
         * 
         * 3. 当栈不为空时循环执行:
         * a) 取栈顶方块(不出栈):box = st.peek()
         * b) 获取当前方块的坐标和方位:i = box.i; j = box.j; di = box.di;
         * 
         * c) 判断是否到达出口:
         * - 如果 i == xe && j == ye,则找到出口
         * - 输出栈中所有方块(从栈顶到栈底,即从出口到入口的逆路径)
         * - 返回true
         * 
         * d) 否则,寻找下一个可走的相邻方块:
         * - 初始化find = false(表示是否找到可走方块)
         * - 从di+1方位开始,循环尝试各个方位(while di < 3 && !find)
         * * di++(尝试下一个方位)
         * * 根据di计算相邻方块坐标(i1, j1):
         * di=0: i1=i-1, j1=j (上方)
         * di=1: i1=i, j1=j+1 (右方)
         * di=2: i1=i+1, j1=j (下方)
         * di=3: i1=i, j1=j-1 (左方)
         * * 判断(i1,j1)是否可走:if (mg[i1][j1] == 0)
         * - find = true(找到可走方块)
         * 
         * - 如果找到可走方块(find == true):
         * * 修改栈顶元素的di值:出栈、修改di、再入栈
         * * 将新方块(i1,j1)压入栈,初始di设为-1
         * * 将mg[i1][j1]置为-1(标记为已访问)
         * 
         * - 如果没有找到可走方块(find == false):
         * * 恢复当前方块:mg[i][j] = 0
         * * 当前方块退栈(回溯)
         * 
         * 4. 如果栈为空仍未找到路径,返回false
         * 
         * 【关键点】
         * - 使用栈实现深度优先搜索,沿着一条路径深入探索
         * - 进栈的方块mg值置为-1,防止重复访问
         * - 退栈时恢复mg值为0,以便回溯后尝试其他路径
         * - 找到出口后,栈中保存的就是一条完整路径
         * 
         * @param xi 入口的行号
         * @param yi 入口的列号
         * @param xe 出口的行号
         * @param ye 出口的列号
         * @return 找到路径返回true,否则返回false
         */
        boolean mgpath(int xi, int yi, int xe, int ye) {
            // TODO: 学生完成
            SqStackClass<Box> st = new SqStackClass<>();

            Box entry = new Box(xi, yi, -1);
            st.push(entry);
            mg[xi][yi] = -1;

            while (!st.empty()) {
                Box box = st.peek()
                int i = box.i, j = box.j, di = box.di;

                if (i == xe && j == ye){
                    while (!st.empty()){
                        Box temp_box = st.pop();
                        System.out.print("[" + box.i + "," + box.j + "]");
                    }
                    System.out.println();
                    return true;
                }
                boolean find = false;
                int i1 = 0, j1 = 0;

                while (di < 3 && !find) {
                    di++;
                    switch (di) {
                        case 0:
                            i1 = i - 1; j1 = j;
                            break;
                        case 1:
                            i1 = i; j1 = j + 1;
                            break;
                        case 2:
                            i1 = i + 1; j1 = j;
                            break;
                        case 3:
                            i1 = i; j1 = j - 1;
                            break;
                    }
                    
                    if (mg[i1][j1] == 0) {
                        find = true;
                    }
                }
                
                if (find) {
                    Box current = st.pop();
                    current.di = di;
                    st.push(current);
                    
                    Box next = new Box(i1, j1, -1);
                    st.push(next);
                    mg[i1][j1] = -1; 
                } else {
                    Box back = st.pop();
                    mg[back.i][back.j] = 0;
                }
            }

            return false; // 未找到路径
        }
    }

    // ==================== 第四部分:用队列求解迷宫问题(学生完成核心算法)====================

    /**
     * 方块类(用于队列求解迷宫)
     * 
     * 【说明】
     * - i, j: 方块的行号和列号
     * - pre: 前驱方块的引用(用于回溯路径)
     */
    class Box1 {
        int i; // 方块的行号
        int j; // 方块的列号
        Box1 pre; // 前驱方块

        public Box1(int i1, int j1) {
            i = i1;
            j = j1;
            pre = null;
        }
    }

    /**
     * 用队列求解迷宫路径类
     * 
     * 【迷宫说明】
     * 同栈求解迷宫,迷宫格式相同
     * 
     * 【BFS特点】
     * - 使用队列实现广度优先搜索
     * - 按层次扩展,先找到的路径一定是最短路径
     * - 通过pre指针回溯找到完整路径
     */
    class MazeClass2 {
        final int MaxSize = 20;
        int[][] mg;
        int m, n; // 迷宫的行数和列数

        public MazeClass2(int m1, int n1) {
            m = m1;
            n = n1;
            mg = new int[MaxSize][MaxSize];
        }

        /**
         * 设置迷宫数组
         */
        public void Setmg(int[][] a) {
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    mg[i][j] = a[i][j];
                }
            }
        }

        /**
         * 从方块p出发回溯找到迷宫路径并输出(已完成)
         * 
         * 【说明】从出口方块p开始,通过pre指针一直回溯到入口,输出路径
         */
        public void disppath(Box1 p) {
            int cnt = 1;
            while (p != null) {
                System.out.print("[" + p.i + "," + p.j + "]");
                if (cnt % 5 == 0) { // 每行输出5个方块
                    System.out.println();
                }
                cnt++;
                p = p.pre; // 回溯到前驱方块
            }
            System.out.println();
        }

        /**
         * 用队列求解一条从(xi,yi)到(xe,ye)的迷宫路径
         * 
         * 【学生任务】请完成此方法,使用队列实现广度优先搜索
         * 
         * 【算法思路】
         * 1. 创建一个Box1类型的队列qu(使用CSqQueueClass)
         * 
         * 2. 将入口方块(xi, yi)入队:
         * - 创建入口Box1对象:b = new Box1(xi, yi)
         * - 将其加入队列qu
         * - 将mg[xi][yi]置为-1(标记为已访问)
         * 
         * 3. 当队列不为空时循环执行:
         * a) 出队一个方块:b = qu.pop()
         * 
         * b) 判断是否到达出口:
         * - 如果 b.i == xe && b.j == ye,则找到出口
         * - 调用 disppath(b) 输出路径
         * - 返回true
         * 
         * c) 否则,按4个方向查找所有可走的相邻方块:
         * - 获取当前方块坐标:i = b.i; j = b.j;
         * - 循环遍历4个方位(for di = 0 to 3):
         * * 根据di计算相邻方块坐标(i1, j1):
         * di=0: i1=i-1, j1=j (上方)
         * di=1: i1=i, j1=j+1 (右方)
         * di=2: i1=i+1, j1=j (下方)
         * di=3: i1=i, j1=j-1 (左方)
         * 
         * * 判断(i1,j1)是否可走:if (mg[i1][j1] == 0)
         * - 创建新的Box1对象:b1 = new Box1(i1, j1)
         * - 设置b1的前驱为当前方块:b1.pre = b
         * - 将b1加入队列qu
         * - 将mg[i1][j1]置为-1(标记为已访问)
         * 
         * 4. 如果队列为空仍未找到路径,返回false
         * 
         * 【关键点】
         * - 使用队列实现广度优先搜索,按层次逐步扩展
         * - 先进先出保证了先发现的路径步数更少
         * - 找到出口后,通过pre指针回溯得到完整路径
         * - BFS找到的一定是最短路径(步数最少)
         * 
         * @param xi 入口的行号
         * @param yi 入口的列号
         * @param xe 出口的行号
         * @param ye 出口的列号
         * @return 找到路径返回true,否则返回false
         */
        boolean mgpath(int xi, int yi, int xe, int ye) {
            // TODO: 学生完成

            return false; // 未找到路径
        }
    }

    // ==================== 第五部分:主类和测试(已完成)====================

/**
 * 主类:包含测试方法
 */
public class MazeLabFramework {

    /**
     * 测试顺序栈的基本功能
     */
    private static void testStack() {
        System.out.println("=".repeat(60));
        System.out.println("【测试一】顺序栈的基本操作");
        System.out.println("=".repeat(60));

        SqStackClass<Integer> stack = new SqStackClass<>();

        System.out.println("1. 测试空栈:empty() = " + stack.empty());

        System.out.println("\n2. 依次将元素 1, 2, 3, 4, 5 压入栈");
        for (int i = 1; i <= 5; i++) {
            stack.push(i);
            System.out.println("   压入 " + i + " 后,栈顶元素:" + stack.peek());
        }

        System.out.println("\n3. 当前栈是否为空:" + stack.empty());

        System.out.println("\n4. 依次弹出栈中所有元素:");
        System.out.print("   出栈序列:");
        while (!stack.empty()) {
            System.out.print(stack.pop() + " ");
        }
        System.out.println("\n   弹出后栈是否为空:" + stack.empty());

        System.out.println("\n顺序栈测试完成!\n");
    }

    /**
     * 测试循环队列的基本功能
     */
    private static void testQueue() {
        System.out.println("=".repeat(60));
        System.out.println("【测试二】循环队列的基本操作");
        System.out.println("=".repeat(60));

        CSqQueueClass<Integer> queue = new CSqQueueClass<>();

        System.out.println("1. 测试空队列:empty() = " + queue.empty());

        System.out.println("\n2. 依次将元素 1, 2, 3, 4, 5 加入队列");
        for (int i = 1; i <= 5; i++) {
            queue.push(i);
            System.out.println("   加入 " + i + " 后,队头元素:" + queue.peek());
        }

        System.out.println("\n3. 当前队列是否为空:" + queue.empty());

        System.out.println("\n4. 依次取出队列中所有元素:");
        System.out.print("   出队序列:");
        while (!queue.empty()) {
            System.out.print(queue.pop() + " ");
        }
        System.out.println("\n   取出后队列是否为空:" + queue.empty());

        System.out.println("\n循环队列测试完成!\n");
    }

    /**
     * 测试用栈求解迷宫问题
     */
    private static void testMazeWithStack() {
        System.out.println("=".repeat(60));
        System.out.println("【测试三】使用栈求解迷宫问题(深度优先搜索)");
        System.out.println("=".repeat(60));

        // 迷宫数组说明:
        // - 0表示可走的通道,1表示墙壁
        // - 外围一圈都是1(墙壁),避免搜索时出界
        // - 实际迷宫是中间的4x4区域

        System.out.println("\n【迷宫1】简单迷宫 - 从(1,1)到(4,4)");
        int[][] maze1 = {
                { 1, 1, 1, 1, 1, 1 },
                { 1, 0, 1, 0, 0, 1 },
                { 1, 0, 0, 1, 1, 1 },
                { 1, 0, 1, 0, 0, 1 },
                { 1, 0, 0, 0, 0, 1 },
                { 1, 1, 1, 1, 1, 1 }
        };

        System.out.println("迷宫布局(0表示通路,1表示墙壁):");
        printMaze(maze1, 6, 6);

        MazeClass1 mz1 = new MazeClass1(6, 6);
        mz1.Setmg(maze1);
        System.out.print("用栈求得的路径:");
        if (!mz1.mgpath(1, 1, 4, 4)) {
            System.out.println("不存在迷宫路径");
        }

        System.out.println();

        System.out.println("【迷宫2】复杂迷宫 - 从(1,1)到(6,6)");
        int[][] maze2 = {
                { 1, 1, 1, 1, 1, 1, 1, 1 },
                { 1, 0, 0, 0, 1, 0, 0, 1 },
                { 1, 0, 1, 0, 1, 0, 1, 1 },
                { 1, 0, 1, 0, 0, 0, 1, 1 },
                { 1, 0, 1, 1, 1, 0, 1, 1 },
                { 1, 0, 0, 0, 0, 0, 1, 1 },
                { 1, 0, 1, 1, 1, 0, 0, 1 },
                { 1, 1, 1, 1, 1, 1, 1, 1 }
        };

        System.out.println("迷宫布局:");
        printMaze(maze2, 8, 8);

        MazeClass1 mz2 = new MazeClass1(8, 8);
        mz2.Setmg(maze2);
        System.out.print("用栈求得的路径:");
        if (!mz2.mgpath(1, 1, 6, 6)) {
            System.out.println("不存在迷宫路径");
        }

        System.out.println("\n使用栈求解迷宫测试完成!\n");
    }

    /**
     * 测试用队列求解迷宫问题
     */
    private static void testMazeWithQueue() {
        System.out.println("=".repeat(60));
        System.out.println("【测试四】使用队列求解迷宫问题(广度优先搜索)");
        System.out.println("=".repeat(60));

        System.out.println("\n【迷宫1】简单迷宫 - 从(1,1)到(4,4)");
        int[][] maze1 = {
                { 1, 1, 1, 1, 1, 1 },
                { 1, 0, 1, 0, 0, 1 },
                { 1, 0, 0, 1, 1, 1 },
                { 1, 0, 1, 0, 0, 1 },
                { 1, 0, 0, 0, 0, 1 },
                { 1, 1, 1, 1, 1, 1 }
        };

        System.out.println("迷宫布局(0表示通路,1表示墙壁):");
        printMaze(maze1, 6, 6);

        MazeClass2 mz1 = new MazeClass2(6, 6);
        mz1.Setmg(maze1);
        System.out.print("用队列求得的最短路径:");
        if (!mz1.mgpath(1, 1, 4, 4)) {
            System.out.println("不存在迷宫路径");
        }

        System.out.println();

        System.out.println("【迷宫2】复杂迷宫 - 从(1,1)到(6,6)");
        int[][] maze2 = {
                { 1, 1, 1, 1, 1, 1, 1, 1 },
                { 1, 0, 0, 0, 1, 0, 0, 1 },
                { 1, 0, 1, 0, 1, 0, 1, 1 },
                { 1, 0, 1, 0, 0, 0, 1, 1 },
                { 1, 0, 1, 1, 1, 0, 1, 1 },
                { 1, 0, 0, 0, 0, 0, 1, 1 },
                { 1, 0, 1, 1, 1, 0, 0, 1 },
                { 1, 1, 1, 1, 1, 1, 1, 1 }
        };

        System.out.println("迷宫布局:");
        printMaze(maze2, 8, 8);

        MazeClass2 mz2 = new MazeClass2(8, 8);
        mz2.Setmg(maze2);
        System.out.print("用队列求得的最短路径:");
        if (!mz2.mgpath(1, 1, 6, 6)) {
            System.out.println("不存在迷宫路径");
        }

        System.out.println();

        System.out.println("【迷宫3】无解迷宫 - 从(1,1)到(4,4)");
        int[][] maze3 = {
                { 1, 1, 1, 1, 1, 1 },
                { 1, 0, 1, 0, 0, 1 },
                { 1, 0, 1, 0, 1, 1 },
                { 1, 0, 1, 0, 0, 1 },
                { 1, 0, 1, 1, 1, 1 },
                { 1, 1, 1, 1, 1, 1 }
        };

        System.out.println("迷宫布局:");
        printMaze(maze3, 6, 6);

        MazeClass2 mz3 = new MazeClass2(6, 6);
        mz3.Setmg(maze3);
        System.out.print("用队列求解:");
        if (!mz3.mgpath(1, 1, 4, 4)) {
            System.out.println("不存在迷宫路径");
        }

        System.out.println("\n使用队列求解迷宫测试完成!\n");
    }

    /**
     * 打印迷宫布局(辅助方法)
     */
    private static void printMaze(int[][] maze, int rows, int cols) {
        for (int i = 0; i < rows; i++) {
            System.out.print("   ");
            for (int j = 0; j < cols; j++) {
                System.out.print(maze[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    /**
     * 主函数
     */
    public static void main(String[] args) {
        System.out.println("\n");
        System.out.println("*".repeat(60));
        System.out.println("*" + " ".repeat(58) + "*");
        System.out.println("*" + " ".repeat(12) + "数据结构实验:栈和队列求解迷宫问题" + " ".repeat(12) + "*");
        System.out.println("*" + " ".repeat(58) + "*");
        System.out.println("*".repeat(60));
        System.out.println("\n");

        // 测试顺序栈
        testStack();

        // 测试循环队列
        testQueue();

        // 测试用栈求解迷宫
        testMazeWithStack();

        // 测试用队列求解迷宫
        testMazeWithQueue();

        System.out.println("=".repeat(60));
        System.out.println("所有测试完成!");
        System.out.println("=".repeat(60));

        System.out.println("\n【实验总结】");
        System.out.println("1. 栈(Stack):后进先出(LIFO),栈顶指针top指向栈顶元素");
        System.out.println("2. 队列(Queue):先进先出(FIFO),front指向队头前一位置,rear指向队尾");
        System.out.println("3. 循环队列:采用\"少用一个元素空间\"方法区分队空和队满");
        System.out.println("4. 栈求解迷宫:深度优先搜索(DFS),找到的路径不一定最短");
        System.out.println("5. 队列求解迷宫:广度优先搜索(BFS),找到的路径一定是最短路径");
        System.out.println("6. 迷宫表示:外围加一圈墙壁(1),避免搜索时出界");
        System.out.println("7. 方位编号:0上、1右、2下、3左(顺时针方向)");
    }
}
