package com.tong.art.chainOfResponsibility;

/**
 * @Description: 審批者類：抽象處理者
 * @Create: 2018/10/23 0023 上午 9:11
 */
public abstract class Approver {

    protected Approver successor;
    protected String name;

    public Approver(String name) {
        this.name = name;
    }

    public void setSuccessor(Approver successor) {
        this.successor = successor;
    }

    public abstract void processRequest(PurchaseRequest request);
}
