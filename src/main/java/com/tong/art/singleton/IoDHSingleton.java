package com.tong.art.singleton;

/**
 * @Description: IoDH
 * @Author: 仝闖
 * @Create: 2018/10/8 0008 下午 5:55
 */
public class IoDHSingleton {
    private IoDHSingleton() {

    }

    private static class HolderClass {
        private final static IoDHSingleton instance = new IoDHSingleton();
    }

    public static IoDHSingleton getInstance() {
        return HolderClass.instance;
    }
}
