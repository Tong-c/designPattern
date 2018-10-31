package com.tong.art.mediator;

public class ConcreteMediator extends Mediator {

    public Button addButton;
    public List list;
    public TextBox userNameTextBox;
    public ComboBox cb;

    public void componentChanged(Component c) {
        if (c == addButton) {
            System.out.println("--單擊增加按鈕--");
            list.update();
            cb.update();
            userNameTextBox.update();
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
