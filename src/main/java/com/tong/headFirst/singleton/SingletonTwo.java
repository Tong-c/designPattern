package com.tong.headFirst.singleton;

public class SingletonTwo {
    private static SingletonTwo uniqueInstance = new SingletonTwo();

    private SingletonTwo() {

    }

    public SingletonTwo getInstance() {
        return uniqueInstance;
    }
}
