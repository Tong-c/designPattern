package com.tong.art.proxy.staticProxy;

/**
 * @Description: 具體查詢類：真實主題類
 * @Create: 2018/10/22 0022 上午 9:21
 */
public class RealSearcher implements Searcher {
    public String doSearch(String userId, String keyword) {
        System.out.println("用戶'" + userId + "'使用關鍵詞'" + keyword + "'查詢商務信息");
        return "返回具體內容";
    }
}
