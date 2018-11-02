package com.tong.art.observer;

import java.util.ArrayList;

/**
 * @Description: 戰隊控制中心類：目標類
 * @Create: 2018/11/2 0002 上午 9:30
 */
public abstract class AllyControlCenter {
    protected String allyName;
    protected ArrayList<Observer> players = new ArrayList<Observer>();

    public void setAllyName(String allyName) {
        this.allyName = allyName;
    }

    public String getAllyName() {
        return this.allyName;
    }

    public void join(Observer observer) {
        System.out.println(observer.getName() + "加入" + this.allyName + "戰隊！");
        players.add(observer);
    }

    public void quit(Observer observer) {
        System.out.println(observer.getName() + "退出" + this.allyName + "戰隊！");
        players.remove(observer);
    }

    public abstract void notifyObserver(String name);


}
