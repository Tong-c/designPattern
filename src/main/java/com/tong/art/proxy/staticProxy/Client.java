package com.tong.art.proxy.staticProxy;

import com.tong.art.util.XMLUtil;

public class Client {
    public static void main(String[] args) {
        Searcher searcher;
        searcher = (Searcher) XMLUtil.getBean();
        String result = searcher.doSearch("楊過", "玉女心經");
    }
}
