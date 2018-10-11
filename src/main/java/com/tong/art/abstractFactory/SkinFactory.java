package com.tong.art.abstractFactory;

/**
 * @Description: 界面皮膚工廠接口-抽象工廠
 * @Author: 仝闖
 * @Create: 2018/10/11 0011 下午 3:10
 */
public interface SkinFactory {
    Button createButton();

    TextField createTextField();

    ComboBox cretaeComboBox();
}
