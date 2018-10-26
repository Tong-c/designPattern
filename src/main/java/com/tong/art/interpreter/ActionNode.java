package com.tong.art.interpreter;

/**
 * @Description: 動作解釋：終結符表達式
 * @Create: 2018/10/24 0024 上午 9:53
 */
public class ActionNode extends AbstractNode {

    private String action;

    public ActionNode(String action) {
        this.action = action;
    }

    public String interpret() {
        if (action.equalsIgnoreCase("move")) {
            return "移動";
        } else if (action.equalsIgnoreCase("run")) {
            return "快速移動";
        } else {
            return "無效指令";
        }
    }
}
