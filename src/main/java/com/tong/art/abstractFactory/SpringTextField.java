package com.tong.art.abstractFactory;

/**
 * @Description: spring文本框類-具體產品
 * @Author: 仝闖
 * @Create: 2018/10/11 0011 下午 3:04
 */
public class SpringTextField implements TextField {
    public void display() {
        System.out.println("顯示緑色邊框文本框");
    }
}
