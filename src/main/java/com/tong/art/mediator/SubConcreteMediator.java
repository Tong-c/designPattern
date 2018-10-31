package com.tong.art.mediator;

public class SubConcreteMediator extends ConcreteMediator {
    public Label label;

    public void componentChanged(Component c) {
        if (c == addButton) {
            System.out.println("--單擊增加按鈕--");
            list.update();
            cb.update();
            userNameTextBox.update();
            label.update();
        } else if (c == list) {
            System.out.println("--從列表框選擇客戶--");
            cb.select();
            userNameTextBox.setText();
        } else if (c == cb) {
            System.out.println("--從組合框選擇客戶");
            cb.select();
            userNameTextBox.setText();
        }
    }
}
