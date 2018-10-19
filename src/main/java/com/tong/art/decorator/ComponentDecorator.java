package com.tong.art.decorator;

/**
 * @Description: 構件裝飾類：抽象裝飾類
 * @Create: 2018/10/19 0019 上午 9:50
 */
public class ComponentDecorator extends Component {

    private Component component;

    public ComponentDecorator(Component component) {
        this.component = component;
    }

    public void display() {
        component.display();
    }
}
