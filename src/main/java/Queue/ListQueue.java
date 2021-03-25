package Queue;


public class ListQueue<T> {
    class Node<T> {
        T t;
        Node next;
        public Node() { }
        public Node(T t, Node next) { this.t = t;this.next = next; }
        public Node(T t) { this.t = t; }
    }

    private Node head = null;
    private Node tail = null;

    public void enqueue(T t){
        if (tail == null){
            Node node = new Node(t,null);
            head = node;
            tail = node;
        }else {
            tail.next = new Node(t,null);
            tail = tail.next;
        }

    }

    public T dequeue(){
        if (head == null){ return null;}
        T t = (T) head.t;
        head = head.next;
        if (head == null){
            tail = null;
        }
        return t;
    }
}
