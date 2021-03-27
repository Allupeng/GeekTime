package Sort;

/**
 * @author: Allu
 * @create: 2021-03-27 10:08
 * 选择排序
 **/
public class SelectionSort {
    private int[] items;

    public SelectionSort(int[] items) {
        this.items = items;
    }

    public void selectionSort(){
        if (items.length <= 1) return;
        for (int i = 0; i < items.length - 1; i++){
            int min_index = i;
            for (int j = i + 1; j < items.length; j++){
                if (items[min_index] > items[j])
                    min_index = j;
            }
            int t = items[min_index];
            items[min_index] = items[i];
            items[i] = t;
        }
    }
}
