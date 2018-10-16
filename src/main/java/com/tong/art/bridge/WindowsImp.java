package com.tong.art.bridge;

/**
 * @Description: Windows操作系統實現類：具體實現類
 * @Create: 2018/10/16 0016 下午 5:41
 */
public class WindowsImp implements ImageImp {
    public void doPaint(Matrix m) {
        System.out.println("在Windows操作系統中顯示圖像；");
    }
}
