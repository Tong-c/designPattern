package com.tong.art.mediator;

/**
 * @Description: 文本框類：具體同事類
 * @Create: 2018/10/31 0031 上午 9:23
 */
public class TextBox extends Component {
    public void update() {
        System.out.println("客戶信息增加成功後文本框清空");
    }

    public void setText() {
        System.out.println("文本框顯示：小龍女");
    }
}
