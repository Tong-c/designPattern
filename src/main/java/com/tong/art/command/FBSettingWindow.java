package com.tong.art.command;

import java.util.ArrayList;

/**
 * @Description: 功能鍵設置窗口類
 * @Create: 2018/10/23 0023 下午 5:57
 */
public class FBSettingWindow {
    private String title;
    private ArrayList<FunctionButton> functionButtons = new ArrayList<FunctionButton>();

    public FBSettingWindow(String title) {
        this.title = title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void addFunctionButton(FunctionButton fb) {
        functionButtons.add(fb);
    }

    public void removeFunctionButton(FunctionButton fb) {
        functionButtons.remove(fb);
    }

    public void display(){
        System.out.println("顯示窗口:" + this.getTitle());
        System.out.println("顯示功能鍵：");
        for (Object o : functionButtons) {
            System.out.println(((FunctionButton)o).getName());
        }
        System.out.println("----------------------------");
    }

}
