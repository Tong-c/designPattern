package com.tong.art.interpreter;

/**
 * @Description: 簡單句子解釋：非終結符表達式
 * @Create: 2018/10/24 0024 上午 9:48
 */
public class SentenceNode extends AbstractNode {
    private AbstractNode direction;
    private AbstractNode action;
    private AbstractNode distance;

    public SentenceNode(AbstractNode direction, AbstractNode action, AbstractNode distance) {
        this.direction = direction;
        this.action = action;
        this.distance = distance;
    }

    public String interpret() {
        return direction.interpret() + action.interpret() + distance.interpret();
    }
}
