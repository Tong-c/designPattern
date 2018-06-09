package com.tong.singleton;

public class SingletonPattern {

    private SingletonPattern singletonPattern = null;

    private SingletonPattern(){

    }

    public SingletonPattern getInstance(){
        if(this.singletonPattern == null){
            this.singletonPattern = new SingletonPattern();
        }

        return singletonPattern;
    }


}
