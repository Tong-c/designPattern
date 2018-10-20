package com.tong.art.flyweight;

import java.util.Hashtable;

/**
 * @Description: 圍棋棋子工廠類：享元工廠類
 * @Create: 2018/10/20 0020 下午 6:05
 */
public class IgoCheesemanFactory {

    private static IgoCheesemanFactory instance = new IgoCheesemanFactory();
    private static Hashtable ht;

    private IgoCheesemanFactory() {
        ht = new Hashtable();
        IgoCheeseman black, white;
        black = new BlackIgoCheeseman();
        ht.put("b", black);
        white = new WhiteIgoCheeseman();
        ht.put("w", white);
    }

    public static IgoCheesemanFactory getInstance() {
        return instance;
    }

    public static IgoCheeseman getIgoCheeseman(String color) {
        return (IgoCheeseman) ht.get(color);
    }
}
