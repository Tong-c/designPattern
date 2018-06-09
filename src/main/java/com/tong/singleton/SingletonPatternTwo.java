package com.tong.singleton;

import com.sun.org.apache.xerces.internal.parsers.CachingParserPool;

public class SingletonPatternTwo {

    private static final SingletonPatternTwo singlePattern = new SingletonPatternTwo();

    private SingletonPatternTwo(){}

    public synchronized static SingletonPatternTwo getInstance(){
        return singlePattern;
    }


}
