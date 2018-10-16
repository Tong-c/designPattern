package com.tong.art.bridge;

/**
 * @Description: Linux操作系統實現類：具體實現類
 * @Author: 仝闖
 * @Create: 2018/10/16 0016 下午 5:43
 */
public class LinuxImp implements ImageImp {
    public void doPaint(Matrix m) {
        System.out.println("在linux操作系統中顯示圖像；");
    }
}
