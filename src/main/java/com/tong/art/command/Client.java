package com.tong.art.command;

import com.tong.art.util.XMLUtil;

public class Client {
    public static void main(String[] args) {
        FBSettingWindow fbsw = new FBSettingWindow("功能鍵設置");

        FunctionButton fb1, fb2;

        fb1 = new FunctionButton("功能鍵一");
        fb2 = new FunctionButton("功能鍵二");

        Command command1, command2;
        command1 = (Command) XMLUtil.getBean();
        command2 = (Command) XMLUtil.getBean();

        fb1.setCommand(command1);
        fb2.setCommand(command2);

        fbsw.addFunctionButton(fb1);
        fbsw.addFunctionButton(fb2);

        fb1.onClick();
        fb2.onClick();
    }
}
