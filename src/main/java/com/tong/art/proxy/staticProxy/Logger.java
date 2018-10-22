package com.tong.art.proxy.staticProxy;

/**
 * @Description: 日誌記録類：業務類
 * @Create: 2018/10/22 0022 上午 9:19
 */
public class Logger {
    public void log(String userId) {
        System.out.println("更新數據庫，用戶'" + userId + "'查詢次數加1");
    }
}
