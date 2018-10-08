package com.tong.art.singleton;

/**
 * @Description: 雙重檢查鎖定
 * @Author: 仝闖
 * @Create: 2018/10/8 0008 下午 5:49
 */
public class LazySingleton {
    private volatile static LazySingleton instance = null;

    private LazySingleton() {
    }

    public LazySingleton getInstance() {
        if (instance == null) {
            synchronized (LazySingleton.class) {
                if (instance == null) {
                    instance = new LazySingleton();
                }
            }
        }
        return instance;
    }
}
