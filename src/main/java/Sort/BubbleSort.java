package Sort;

/**
 * @author: Allu
 * @create: 2021-03-26 19:18
 * 冒泡排序
 **/
public class BubbleSort {
    private int[] items;

    public BubbleSort(int[] items) {
        this.items = items;
    }

    public void bubbleSort(){
        if (items.length <= 1) return;
        for (int i = 0; i < items.length; i++){
            boolean flag = false;
            for (int j = 0; j < items.length - i - 1; j++){
                if (items[j] > items[j+1]){
                int t = items[j];
                items[j] = items[j+1];
                items[j+1] = t;
                flag = true;
                }
            }
            if (!flag) return;//已经交换完了
        }
    }
}
