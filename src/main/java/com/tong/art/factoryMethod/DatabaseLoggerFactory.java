package com.tong.art.factoryMethod;

/**
 * @Description: 數據庫日誌記録器工廠類-具體工廠
 * @Author: 仝闖
 * @Create: 2018/10/10 0010 下午 5:17
 */
public class DatabaseLoggerFactory implements LoggerFactory {
    public Logger createLogger() {
        Logger logger = new DatabaseLogger();
        return logger;
    }
}
