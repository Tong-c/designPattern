package com.tong.art.adapter;

/**
 * @Description: 二分查找類：適配者
 * @Author: 仝闖
 * @Create: 2018/10/16 0016 上午 9:47
 */
public class BinarySearch {
    public int binarySearch(int array[], int key) {
        int low = 0;
        int high = array.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            int midVal = array[mid];
            if (midVal < key) {
                low = mid + 1;
            } else if (midVal > key) {
                high = mid - 1;
            } else {
                return 1;
            }
        }
        return -1;
    }
}
