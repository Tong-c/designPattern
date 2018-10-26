package com.tong.art.interpreter;

/**
 * @Description: And解釋：非終結符表達式
 * @Create: 2018/10/24 0024 上午 9:44
 */
public class AndNode extends AbstractNode {
    private AbstractNode left;
    private AbstractNode right;

    public AndNode(AbstractNode left, AbstractNode right) {
        this.left = left;
        this.right = right;
    }

    public String interpret() {
        return left.interpret() + "再" + right.interpret();
    }
}
