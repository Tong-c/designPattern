package com.tong.art.abstractFactory;

import com.tong.art.util.XMLUtil;

public class Client {
    public static void main(String[] args) {
        SkinFactory factory;
        Button bt;
        TextField tf;
        ComboBox cb;
        factory = (SkinFactory) XMLUtil.getBean();
        bt = factory.createButton();
        tf = factory.createTextField();
        cb = factory.cretaeComboBox();
        bt.display();
        tf.display();
        cb.display();
    }
}
