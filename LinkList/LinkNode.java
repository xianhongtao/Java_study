package LinkList;

/**
 * 单链表结点泛型类
 * 用于表示单链表中的一个结点
 * 
 * @param <E> 泛型参数，表示结点中存储的数据类型
 */
public class LinkNode<E> {

    // ==================== 成员变量 ====================

    /**
     * 存储结点中的数据元素
     */
    // TODO: 学生需要实现
    // 提示：声明一个类型为E的public成员变量，用于存储结点数据

    public E data; // 结点数据

    /**
     * 指向下一个结点的引用（指针）
     */
    // TODO: 学生需要实现
    // 提示：声明一个指向下一个结点的public成员变量，类型为LinkNode<E>

    public LinkNode<E> next; // 指向下一个结点的指针

    // ==================== 构造方法 ====================

    /**
     * 无参构造方法
     * 创建一个空结点，next指向null
     */
    public LinkNode() {
        // TODO: 学生需要实现
        // 提示：将指针成员设置为空值
        this.next = null;
    }

    /**
     * 有参构造方法
     * 创建一个包含指定数据的结点，next指向null
     * 
     * @param d 要存储在结点中的数据
     */
    public LinkNode(E d) {
        // TODO: 学生需要实现
        // 提示：
        // 1. 将数据成员设置为参数值
        // 2. 将指针成员设置为空值
        this.data = d;
        this.next = null;
    }
}
