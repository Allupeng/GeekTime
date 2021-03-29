package Sort;

/**
 * @author: Allu
 * @create: 2021-03-29 10:13
 * 归并排序
 **/
public class MergeSort {
    private int[] items;

    public MergeSort(int[] items) {
        this.items = items;
    }

    /**
     *
     * @param items 待合并的数组
     * @param left 左索引值
     * @param mid 中点值
     * @param right 右索引值
     */
    private void merge(int[] items,int left,int mid,int right){
        int[] left_arr = new int[mid - left + 2];
        int[] right_arr = new int[right - mid + 1];

        for (int i = 0; i <= mid - left; i++){
            left_arr[i] = items[left + i];
        }
        left_arr[mid - left + 1] = Integer.MAX_VALUE;//哨兵

        for (int j = 0; j < right - mid; j++){
            right_arr[j] = items[mid + j + 1];
        }
        right_arr[right - mid] = Integer.MAX_VALUE;//哨兵

        int i = 0;
        int j = 0;
        int k = left;
        while (k <= right){
            if (left_arr[i] <= right_arr[j]){
                items[k++] = left_arr[i++];
            }else {
                items[k++] = right_arr[j++];
            }
        }
    }

    public void merge_sort(int left,int right){
        if (left >= right) return;
        int mid = (right + left) / 2;
        merge_sort(left,mid);
        merge_sort(mid+1,right);
        merge(items,left,mid,right);
    }

}
