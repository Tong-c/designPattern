package com.tong.art.memento;

import java.util.ArrayList;

/**
 * @Description: 象棋棋子備忘録管理類：負責人
 * @Create: 2018/11/1 0001 上午 9:24
 */
public class MementoCaretaker {
    private ArrayList mementolist = new ArrayList();

    public CheesemanMemento getMemento(int i) {
        return (CheesemanMemento) mementolist.get(i);
    }

    public void setMemento(CheesemanMemento memento) {
        mementolist.add(memento);
    }
}
