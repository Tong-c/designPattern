package com.tong.headFirst.singleton;

public class SingletonFour {

    private static volatile SingletonFour uniqueInstance;

    private SingletonFour() {

    }

    public static SingletonFour getInstance() {
        if (uniqueInstance == null) {
            synchronized (SingletonFour.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new SingletonFour();
                }
            }
        }
        return uniqueInstance;
    }
}
