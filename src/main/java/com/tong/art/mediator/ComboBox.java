package com.tong.art.mediator;

/**
 * @Description: 組合框類：具體同事類
 * @Create: 2018/10/31 0031 上午 9:21
 */
public class ComboBox extends Component{
    public void update() {
        System.out.println("組合框增加一項：張無忌");
    }

    public void select() {
        System.out.println("組合框選中項：小龍女");
    }
}
