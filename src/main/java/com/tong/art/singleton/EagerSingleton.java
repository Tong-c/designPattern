package com.tong.art.singleton;

/**
 * @Description: 懶漢式
 * @Author: 仝闖
 * @Create: 2018/10/8 0008 下午 5:49
 */
public class EagerSingleton {
    private static final EagerSingleton instance = new EagerSingleton();

    private EagerSingleton() {
    }

    public EagerSingleton getInstance() {
        return instance;
    }
}
