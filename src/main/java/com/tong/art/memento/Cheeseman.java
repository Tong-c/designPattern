package com.tong.art.memento;


/**
 * @Description: 象棋棋子類：原發器
 * @Create: 2018/11/1 0001 上午 9:18
 */
public class Cheeseman {

    private String label;
    private int x;
    private int y;

    public Cheeseman(String label, int x, int y) {
        this.label = label;
        this.x = x;
        this.y = y;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String getLabel() {
        return this.label;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public CheesemanMemento save() {
        return new CheesemanMemento(this.label, this.x, this.y);
    }

    public void restore(CheesemanMemento memento) {
        this.label = memento.getLabe();
        this.x = memento.getX();
        this.y = memento.getY();
    }


}
