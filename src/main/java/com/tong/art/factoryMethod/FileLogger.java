package com.tong.art.factoryMethod;

/**
 * @Description: 文件日誌記録器-具體產品
 * @Author: 仝闖
 * @Create: 2018/10/10 0010 下午 5:14
 */
public class FileLogger implements Logger {
    public void writerLog() {
        System.out.println("文件日誌記録");
    }
}
