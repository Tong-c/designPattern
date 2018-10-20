package com.tong.art.flyweight;

/**
 * @Description: 圍棋棋子類：抽象享元類
 * @Create: 2018/10/20 0020 下午 6:00
 */
public abstract class IgoCheeseman {

    public abstract String getColor();

    public void display(Coordinates coord) {
        System.out.println("棋子顔色：" + this.getColor() + "，棋子位置：" + coord.getX() + "," + coord.getY());
    }
}
