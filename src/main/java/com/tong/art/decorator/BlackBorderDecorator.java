package com.tong.art.decorator;

/**
 * @Description: 黑色邊框裝飾類：具體裝飾類
 * @Create: 2018/10/19 0019 上午 9:54
 */
public class BlackBorderDecorator extends ComponentDecorator {

    public BlackBorderDecorator(Component component) {
        super(component);
    }

    @Override
    public void display() {
        this.setBlackBorder();
        super.display();
    }

    public void setBlackBorder() {
        System.out.println("為構件增加黑色邊框");
    }
}
