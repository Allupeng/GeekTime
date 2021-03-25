package Queue;

public class SeqQueue<T> {
    private T[] items;//数组 items
    private int n;//数组大小

    private int head;//头指针
    private int tail;//尾指针

    public SeqQueue(int capacity) {//申请为capacity大小的数组
        items = (T[]) new Object[capacity];n = capacity;
    }

    public SeqQueue(T[] items) { this.items = items;n = items.length; }

    public int size(){return  n;}

    private boolean isFull(){ return ((tail == n) && (head == 0));}

    private boolean isNull(){ return tail == 0;}

    private void dataTrans(){
        for (int i = head; i < tail; i++){ items[i - head] = items[i]; }
        tail -= head;
        head = 0;
    }

    public void enqueue(T t){ if (isFull()) dataTrans();items[tail++] = t; }

    public T dequeue(){ if (isNull()) return null; return items[head++]; }
}
