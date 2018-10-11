package com.tong.art.abstractFactory;

/**
 * @Description: summer文本框類-具體產品
 * @Author: 仝闖
 * @Create: 2018/10/11 0011 下午 3:05
 */
public class SummerTextField implements TextField {

    public void display() {
        System.out.println("顯示藍色邊框文本框");
    }
}
