package Sort;

/**
 * @author: Allu
 * @create: 2021-03-26 19:57
 * 插入排序
 **/
public class InsertionSort {
    private int[] items;

    public InsertionSort(int[] items) {
        this.items = items;
    }

    public void insertionSort(){
    if (items.length <= 1) return;
    for (int i = 1 ; i < items.length ; i++){
        int value = items[i];
        for (int j = i - 1; j >= 0; j--){
            if (items[j] > value){
                items[j+1] = items[j]; //向后移动
            }else { break; }
            items[j+1] = value; //插入到正确位置
        }
    }
    }
}
