package com.tong.art.chainOfResponsibility;

/**
 * @Description: 主任類：具體處理者
 * @Create: 2018/10/23 0023 上午 9:14
 */
public class Director extends Approver {

    public Director(String name) {
        super(name);
    }

    public void processRequest(PurchaseRequest request) {
        if (request.getAmount() < 50000) {
            System.out.println("主任" + this.name + "審批採購單:" + request.getNumber() + ", 金額：" + request.getAmount() + "元，採購目的：" + request.getPurpose() + ".");
        } else {
            this.successor.processRequest(request);
        }
    }
}
