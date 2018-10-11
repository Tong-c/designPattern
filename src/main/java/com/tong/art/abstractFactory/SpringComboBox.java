package com.tong.art.abstractFactory;

/**
 * @Description: spring組合框類-具體產品
 * @Author: 仝闖
 * @Create: 2018/10/11 0011 下午 3:07
 */
public class SpringComboBox implements ComboBox {
    public void display() {
        System.out.println("顯示緑色邊框組合框");
    }
}
