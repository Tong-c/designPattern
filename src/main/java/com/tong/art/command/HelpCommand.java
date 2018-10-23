package com.tong.art.command;

/**
 * @Description: 幫助命令類：具體命令類
 * @Create: 2018/10/23 0023 下午 6:09
 */
public class HelpCommand extends Command {

    private HelpHandler hhObj;

    public HelpCommand() {
        hhObj = new HelpHandler();
    }

    public void execute() {
        hhObj.display();
    }
}
