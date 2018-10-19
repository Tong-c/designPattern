package com.tong.art.decorator;

/**
 * @Description: 滾動條裝飾類：具體裝飾類
 * @Create: 2018/10/19 0019 上午 9:53
 */
public class ScrollBarDecorator extends ComponentDecorator {

    public ScrollBarDecorator(Component component) {
        super(component);
    }

    @Override
    public void display() {
        this.setScrollBar();
        super.display();
    }

    public void setScrollBar() {
        System.out.println("為構件增加滾動條");
    }
}
