package com.tong.art.abstractFactory;

/**
 * @Description: Summer皮膚工廠-具體工廠
 * @Author: 仝闖
 * @Create: 2018/10/11 0011 下午 3:12
 */
public class SummerSkinFactory implements SkinFactory {
    public Button createButton() {
        return new SummerButton();
    }

    public TextField createTextField() {
        return new SummerTextField();
    }

    public ComboBox cretaeComboBox() {
        return new SummerComboxBox();
    }
}
