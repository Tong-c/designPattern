package com.tong.art.proxy.staticProxy;

/**
 * @Description: 抽象查詢類：抽象主題類
 * @Create: 2018/10/22 0022 上午 9:15
 */
public interface Searcher {
    public String doSearch(String userId, String keyword);
}
