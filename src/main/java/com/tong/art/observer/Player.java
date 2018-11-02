package com.tong.art.observer;

/**
 * @Description: 戰隊成員類：具體觀察者類
 * @Create: 2018/11/2 0002 上午 9:38
 */
public class Player implements Observer{
    private String name;

    public Player(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void help() {
        System.out.println("堅持住," + this.name + "來教你");
    }

    public void beAttacked(AllyControlCenter acc) {
        System.out.println(this.name + "被攻擊");
        acc.notifyObserver(name);
    }
}
