package com.tong.art.observer;

/**
 * @Description: 具體戰隊控制中心類：具體目標類
 * @Create: 2018/11/2 0002 上午 9:49
 */
public class ConcreteAllyControlCenter extends AllyControlCenter {

    public ConcreteAllyControlCenter(String allyName) {
        System.out.println(allyName + "戰隊組建成功");
        System.out.println("---------------");
        this.allyName = allyName;
    }

    public void notifyObserver(String name) {
        System.out.println(this.allyName + "戰隊緊急通知，盟友" + name + "遭受敵人攻擊！");
        for (Object obs : players) {
            if (!((Observer) obs).getName().equalsIgnoreCase(name)) {
                ((Observer) obs).help();
            }
        }
    }
}
