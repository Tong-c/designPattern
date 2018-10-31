package com.tong.art.mediator;

public class List extends Component {
    public void update() {
        System.out.println("列表框增加一項：張無忌");
    }

    public void select() {
        System.out.println("列表框選中項：小龍女");
    }
}
