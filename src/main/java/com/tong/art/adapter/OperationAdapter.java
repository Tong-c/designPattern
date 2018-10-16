package com.tong.art.adapter;

/**
 * @Description: 操作適配器：適配器
 * @Create: 2018/10/16 0016 上午 9:50
 */
public class OperationAdapter implements ScoreOperation {
    private QuickSort sortObj;
    private BinarySearch searchObj;

    public OperationAdapter() {
        sortObj = new QuickSort();
        searchObj = new BinarySearch();
    }

    public int[] sort(int array[]) {
        return sortObj.quickSort(array);
    }

    public int search(int array[], int key) {
        return searchObj.binarySearch(array, key);
    }
}
