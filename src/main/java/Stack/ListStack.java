package Stack;


/**
 * 使用链实现栈
 * 操作：
 * push 将元素推入栈
 * pop 将元素弹出栈
 * top 返回栈顶元素
 */
public class ListStack {
    class Node{
        public String val;
        Node next;
        public Node() { }
        public Node(String val,Node next) { this.val = val;this.next = next; }
        public Node(String val) { this.val = val; }
    }
    Node head = new Node();//头结点
    public void push(Node next){ head.next = next; }
    public Node pop(){ Node node = head.next;head.next = head.next.next;return node; }
    public Node top(){ return head.next; }
}
