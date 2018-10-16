package com.tong.art.bridge;

import com.tong.art.util.XMLUtil;

public class Client {
    public static void main(String[] args) {
        Image image;
        ImageImp imp;

        image = (Image) XMLUtil.getBean();
        imp = (ImageImp) XMLUtil.getBean();

        image.setImageImp(imp);
        image.parseFile("小龍女");
    }
}
