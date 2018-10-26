package com.tong.art.iterator;

/**
 * @Description: 抽象迭代器
 * @Create: 2018/10/26 0026 上午 9:59
 */
interface AbstractIterator {
    void next();

    boolean isLast();

    void previous();

    boolean isFirst();

    Object getNextItem();

    Object getPreviousItem();
}
