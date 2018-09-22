package com.tong.headFirst.singleton;

public class SingletonThree {
    private static SingletonThree uniqueInstance;

    private SingletonThree() {

    }

    public static synchronized SingletonThree getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new SingletonThree();
        }
        return uniqueInstance;
    }
}
