package Stack;


/**
 * 使用数组实现栈
 * 操作：
 * push 将元素推入栈
 * pop 将元素弹出栈
 * top 返回栈顶元素
 */
public class SequentialStack {
    private String[] items;//数组
    private int count;//数组元素数量
    private int n;//数组大小
    public SequentialStack(int n) { items = new String[n]; this.n = n; count = 0; }
    private boolean isFull(){ return count == n; }
    private boolean isNull(){ return count == 0; }
    public void push(String str){ if (isFull()) resize(); items[count++] = str; }
    public String top(){ return items[count]; }
    public String pop(){ if (isNull()) return null;return items[count--]; }
    public void resize(){
        int old_n = n;
        n = n + n >> 1; //resize 1.5
        String[] new_items = new String[n];
        System.arraycopy(items,0,new_items,0,old_n);
        //let gc the items
    }
}
