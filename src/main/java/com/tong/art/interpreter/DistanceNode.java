package com.tong.art.interpreter;

/**
 * @Description: 距離解釋：終結符表達式
 * @Create: 2018/10/24 0024 上午 9:56
 */
public class DistanceNode extends AbstractNode{

    private String distance;

    public DistanceNode(String distance) {
        this.distance = distance;
    }

    public String interpret() {
        return this.distance;
    }
}
