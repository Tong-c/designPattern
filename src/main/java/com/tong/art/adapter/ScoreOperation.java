package com.tong.art.adapter;

/**
 * @Description: 抽象成績操作類：目標接口
 * @Create: 2018/10/16 0016 上午 9:38
 */
public interface ScoreOperation {

    /**
     * 成績排序
     *
     * @param array
     * @return
     */
    int[] sort(int array[]);

    /**
     * 成績查找
     *
     * @param array
     * @param key
     * @return
     */
    int search(int array[], int key);

}
