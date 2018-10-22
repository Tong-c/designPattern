package com.tong.art.proxy.staticProxy;

/**
 * @Description: 代理查詢類：代理主題類
 * @Create: 2018/10/22 0022 上午 9:23
 */
public class ProxySearcher implements Searcher {

    private RealSearcher searcher = new RealSearcher();
    private AccessValidator validator;
    private Logger logger;

    public String doSearch(String userId, String keyword) {
        if (validate(userId)) {
            String result = searcher.doSearch(userId, keyword);
            this.log(userId);
            return result;
        }else {
            return null;
        }
    }

    public boolean validate(String userId) {
        validator = new AccessValidator();
        return validator.validate(userId);
    }

    public void log(String userId) {
        logger = new Logger();
        logger.log(userId);
    }
}
