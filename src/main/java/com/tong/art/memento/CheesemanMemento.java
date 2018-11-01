package com.tong.art.memento;

/**
 * @Description: 象棋棋子備忘録類：備忘録
 * @Create: 2018/11/1 0001 上午 9:22
 */
public class CheesemanMemento {
    private String labe;
    private int x;
    private int y;

    public CheesemanMemento(String labe, int x, int y) {
        this.labe = labe;
        this.x = x;
        this.y = y;
    }

    public String getLabe() {
        return labe;
    }

    public void setLabe(String labe) {
        this.labe = labe;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
