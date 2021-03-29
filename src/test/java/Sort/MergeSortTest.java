package Sort;

import org.junit.jupiter.api.Test;

/**
 * @author: Allu
 * @create: 2021-03-29 10:46
 **/
public class MergeSortTest {
    private int[] items = {7,5,6,2,3,4,10};
    @Test
    public void Test(){
        MergeSort mergeSort = new MergeSort(items);
        mergeSort.merge_sort(0,items.length - 1);
        for (int item : items){
            System.out.println(item);
        }
    }
}
