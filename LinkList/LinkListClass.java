package LinkList;

/**
 * 单链表泛型类
 * 实现带头结点的单链表数据结构
 * 
 * @param <E> 泛型参数，表示单链表中元素的类型
 */
public class LinkListClass<E> {

    // ==================== 成员变量 ====================

    /**
     * 单链表的头结点
     */
    // TODO: 学生需要实现
    // 提示：声明一个类型为LinkNode<E>的public成员变量，作为链表的头结点
    public LinkNode<E> head;

    // ==================== 构造方法 ====================

    /**
     * 构造方法，创建一个空的单链表
     * 初始化头结点，头结点的next指向null
     */
    public LinkListClass() {
        // TODO: 学生需要实现
        // 提示：
        // 1. 创建一个新的结点作为头结点
        // 2. 设置头结点的next指针为空
        this.head = new LinkNode<E>();
        this.head.next = null;
    }

    // ==================== 私有辅助方法 ====================

    /**
     * 返回序号为i的结点（私有方法，供其他方法使用）
     * 
     * @param i 结点序号（从0开始，-1表示头结点）
     * @return 序号为i的结点
     */
    private LinkNode<E> getNode(int i) {
        // TODO: 学生需要实现
        // 提示：
        // 1. 设置指针p指向头结点
        // 2. 设置计数器j为-1（头结点的序号）
        // 3. 循环：当j小于i时，j递增，p向后移动一个结点
        // 4. 返回指针p
        LinkNode<E> p = head;
        int j = -1;
        while (j < i) {
            j++;
            p = p.next;
        }
        return p;
    }

    // ==================== 基本运算方法 ====================

    /**
     * 头插法：由数组a整体建立单链表
     * 
     * @param a 用于建立单链表的数组
     */
    public void createListF(E[] a) {
        // TODO: 学生需要实现
        // 提示：
        // 1. 遍历数组a中的每个元素
        // 2. 为当前元素创建新结点
        // 3. 将新结点插入到头结点之后（头插法：新结点的next指向头结点的next，然后头结点的next指向新结点）
        for (E e : a) {
            LinkNode<E> newNode = new LinkNode<>(e);
            newNode.next = head.next;
            head.next = newNode;
        }
    }

    /**
     * 尾插法：由数组a整体建立单链表
     * 
     * @param a 用于建立单链表的数组
     */
    public void createListR(E[] a) {
        // TODO: 学生需要实现
        // 提示：
        // 1. 设置尾指针t指向头结点
        // 2. 遍历数组a中的每个元素
        // 3. 为当前元素创建新结点
        // 4. 将新结点插入到t结点之后（尾插法）
        // 5. 更新尾指针t指向新插入的结点
        // 6. 最后设置尾结点的next为空
        LinkNode<E> t = head;
        for (E e : a) {
            LinkNode<E> newNode = new LinkNode<>(e);
            t.next = newNode;
            t = newNode;
        }
        t.next = null;
    }

    /**
     * 在线性表的末尾添加一个元素e
     * 
     * @param e 要添加的元素
     */
    public void add(E e) {
        // TODO: 学生需要实现
        // 提示：
        // 1. 创建包含元素e的新结点
        // 2. 从头结点开始找到尾结点（next为null的结点）
        // 3. 在尾结点之后插入新结点
        LinkNode<E> newNode = new LinkNode<>(e);
        LinkNode<E> p = head;
        while (p.next != null) {
            p = p.next;
        }
        p.next = newNode;
    }

    /**
     * 求线性表的长度
     * 
     * @return 线性表中数据结点的个数
     */
    public int size() {
        // TODO: 学生需要实现
        // 提示：
        // 1. 设置计数器为0
        // 2. 从头结点开始遍历所有数据结点
        // 3. 每遍历一个数据结点，计数器加1
        // 4. 返回计数器的值
        int count = 0;
        LinkNode<E> p = head.next;
        while (p != null) {
            count++;
            p = p.next;
        }
        return count;
    }

    /**
     * 设置线性表的长度为nlen
     * 
     * @param nlen 新的长度值
     * @throws IllegalArgumentException 当nlen不在有效范围内时抛出异常
     */
    public void setSize(int nlen) {
        // TODO: 学生需要实现
        // 提示：
        // 1. 获取当前链表长度
        // 2. 检查nlen是否在有效范围内（0到当前长度之间）
        // 3. 如果无效，抛出IllegalArgumentException异常
        // 4. 如果nlen等于当前长度，直接返回
        // 5. 找到序号为nlen-1的结点
        // 6. 将该结点设置为尾结点（next设为null）
        int currentSize = size();
        if (nlen < 0 || nlen > currentSize) {
            throw new IllegalArgumentException("Invalid length: " + nlen);
        }
        if (nlen == currentSize) {
            return;
        }
        LinkNode<E> p = getNode(nlen - 1);
        p.next = null;
    }

    /**
     * 返回线性表中序号为i的元素
     * 
     * @param i 元素的序号（从0开始）
     * @return 序号为i的元素
     * @throws IllegalArgumentException 当i不在有效范围内时抛出异常
     */
    public E getElem(int i) {
        // TODO: 学生需要实现
        // 提示：
        // 1. 获取链表长度
        // 2. 检查i是否在有效范围内（0到长度-1之间）
        // 3. 如果无效，抛出IllegalArgumentException异常
        // 4. 调用getNode方法找到序号为i的结点
        // 5. 返回该结点的数据成员
        int len = size();
        if (i < 0 || i >= len) {
            throw new IllegalArgumentException("Invalid index: " + i);
        }
        LinkNode<E> node = getNode(i);
        return node.data;
    }

    /**
     * 设置序号为i的元素为e
     * 
     * @param i 要设置的元素序号
     * @param e 新的元素值
     * @throws IllegalArgumentException 当i不在有效范围内时抛出异常
     */
    public void setElem(int i, E e) {
        // TODO: 学生需要实现
        // 提示：
        // 1. 检查i是否在有效范围内
        // 2. 如果无效，抛出IllegalArgumentException异常
        // 3. 调用getNode方法找到序号为i的结点
        // 4. 设置该结点的数据成员为e
        int len = size();
        if (i < 0 || i >= len) {
            throw new IllegalArgumentException("Invalid index: " + i);
        }
        LinkNode<E> node = getNode(i);
        node.data = e;
    }

    /**
     * 查找第一个值为e的元素的序号
     * 
     * @param e 要查找的元素值
     * @return 第一个值为e的元素的序号，如果不存在返回-1
     */
    public int getNo(E e) {
        // TODO: 学生需要实现
        // 提示：
        // 1. 设置计数器j为0
        // 2. 从首结点开始遍历
        // 3. 循环：当指针不为空且当前结点数据不等于e时，继续遍历
        // 4. 在循环中：计数器递增，指针后移
        // 5. 循环结束后：如果指针为空表示未找到，返回-1；否则返回计数器值
        int j = 0;
        LinkNode<E> p = head.next;
        while (p != null && !p.data.equals(e)) {
            j++;
            p = p.next;
        }
        return p == null ? -1 : j;
    }

    /**
     * 交换序号为i和序号为j的元素
     * 
     * @param i 第一个元素的序号
     * @param j 第二个元素的序号
     */
    public void swap(int i, int j) {
        // TODO: 学生需要实现
        // 提示：
        // 1. 调用getNode方法找到序号为i的结点
        // 2. 调用getNode方法找到序号为j的结点
        // 3. 使用临时变量交换两个结点的数据成员
        LinkNode<E> nodeI = getNode(i);
        LinkNode<E> nodeJ = getNode(j);
        E temp = nodeI.data;
        nodeI.data = nodeJ.data;
        nodeJ.data = temp;
    }

    /**
     * 在线性表中序号为i的位置上插入元素e
     * 
     * @param i 插入位置的序号
     * @param e 要插入的元素
     * @throws IllegalArgumentException 当i不在有效范围内时抛出异常
     */
    public void insert(int i, E e) {
        // TODO: 学生需要实现
        // 提示：
        // 1. 检查i是否在有效范围内（0到链表长度之间）
        // 2. 如果无效，抛出IllegalArgumentException异常
        // 3. 创建包含元素e的新结点
        // 4. 找到序号为i-1的结点（即插入位置的前驱结点）
        // 5. 在前驱结点后插入新结点（注意指针操作的顺序）
        int len = size();
        if (i < 0 || i > len) {
            throw new IllegalArgumentException("Invalid index: " + i);
        }
        LinkNode<E> newNode = new LinkNode<>(e);
        LinkNode<E> prev = getNode(i - 1);
        newNode.next = prev.next;
        prev.next = newNode;
    }

    /**
     * 在线性表中删除序号为i的元素
     * 
     * @param i 要删除的元素序号
     * @throws IllegalArgumentException 当i不在有效范围内时抛出异常
     */
    public void delete(int i) {
        // TODO: 学生需要实现
        // 提示：
        // 1. 检查i是否在有效范围内（0到链表长度-1之间）
        // 2. 如果无效，抛出IllegalArgumentException异常
        // 3. 找到序号为i-1的结点（即要删除结点的前驱结点）
        // 4. 删除前驱结点的后继结点（修改前驱结点的next指针）
        int len = size();
        if (i < 0 || i >= len) {
            throw new IllegalArgumentException("Invalid index: " + i);
        }
        LinkNode<E> prev = getNode(i - 1);
        prev.next = prev.next.next;
    }

    /**
     * 将线性表转换为字符串表示
     * 
     * @return 包含所有元素的字符串
     */
    @Override
    public String toString() {
        // TODO: 学生需要实现
        // 提示：
        // 1. 创建空字符串用于拼接结果
        // 2. 从首结点开始遍历所有数据结点
        // 3. 将每个结点的数据添加到字符串中（可以用空格分隔）
        // 4. 返回拼接好的字符串
        StringBuilder result = new StringBuilder();
        LinkNode<E> p = head.next;
        while (p != null) {
            result.append(p.data).append(" ");
            p = p.next;

        }
        return result.toString();
    }
}
