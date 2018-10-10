package com.tong.art.factoryMethod;

/**
 * @Description: 數據庫日誌記録器-具體產品
 * @Author: 仝闖
 * @Create: 2018/10/10 0010 下午 5:13
 */
public class DatabaseLogger implements Logger {
    public void writerLog() {
        System.out.println("數據庫日誌記録。");
    }
}
