package com.tong.art.abstractFactory;

/**
 * @Description: spring皮膚工廠-具體工廠
 * @Author: 仝闖
 * @Create: 2018/10/11 0011 下午 3:11
 */
public class SpringSkinFactory implements SkinFactory {
    public Button createButton() {
        return new SpringButton();
    }

    public TextField createTextField() {
        return new SpringTextField();
    }

    public ComboBox cretaeComboBox() {
        return new SpringComboBox();
    }
}
