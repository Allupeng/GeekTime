package Queue;

public class CycleQueue<T> {
    private T[] items;//数组 items
    private int n;//数组大小

    private int head;//头指针
    private int tail;//尾指针

    public CycleQueue(int capacity) {//申请为capacity大小的数组
        items = (T[]) new Object[capacity];n = capacity;
    }

    public CycleQueue(T[] items) { this.items = items;n = items.length; }

    public int size(){return  n;}

    private boolean isFull(){ return (tail + 1) % n == head;}

    private boolean isNull(){ return  tail == head;}

    public void enqueue(T t){
        if (!isFull()){
        items[tail] = t;
        tail = (tail + 1)% n;
        }
    }

    public T dequeue(){
        if (!isNull()){
            T result = items[head];
            head = (head + 1) % n;
            return result;
        }
        return null;
    }
}
