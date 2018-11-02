package com.tong.art.observer;

/**
 * @Description: 抽象觀察者
 * @Create: 2018/11/2 0002 上午 9:23
 */
interface Observer {
    String getName();
    void setName(String name);
    void help();
    void beAttacked(AllyControlCenter acc);
}
