package com.tong.zen.singleton;

public class SingletonPatternTwo {

    private static final SingletonPatternTwo singlePattern = new SingletonPatternTwo();

    private SingletonPatternTwo(){}

    public synchronized static SingletonPatternTwo getInstance(){
        return singlePattern;
    }


}
