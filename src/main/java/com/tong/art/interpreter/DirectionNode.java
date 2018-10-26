package com.tong.art.interpreter;

/**
 * @Description: 方向解釋：終結符表達式
 * @Create: 2018/10/24 0024 上午 9:49
 */
public class DirectionNode extends AbstractNode {

    private String direction;

    public DirectionNode(String direction) {
        this.direction = direction;
    }

    public String interpret() {
        if (direction.equalsIgnoreCase("up")) {
            return "向上";
        } else if (direction.equalsIgnoreCase("down")) {
            return "向下";
        } else if (direction.equalsIgnoreCase("left")) {
            return "向左";
        } else if (direction.equalsIgnoreCase("right")) {
            return "向右";
        } else {
            return "無效指令";
        }
    }
}
