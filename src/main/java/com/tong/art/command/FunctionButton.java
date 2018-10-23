package com.tong.art.command;


/**
 * @Description: 功能鍵類：請求發送者
 * @Create: 2018/10/23 0023 下午 5:58
 */
public class FunctionButton {
    private String name;
    private Command command;

    public FunctionButton(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    public void onClick() {
        System.out.println("點擊功能鍵：");
        command.execute();
    }

}
