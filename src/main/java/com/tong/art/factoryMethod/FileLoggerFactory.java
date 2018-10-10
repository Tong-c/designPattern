package com.tong.art.factoryMethod;

/**
 * @Description: 文件日誌記録器工廠類-具體工廠
 * @Author: 仝闖
 * @Create: 2018/10/10 0010 下午 5:18
 */
public class FileLoggerFactory implements LoggerFactory {
    public Logger createLogger() {
        Logger logger = new FileLogger();
        return logger;
    }
}
