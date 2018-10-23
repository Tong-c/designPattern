package com.tong.art.chainOfResponsibility;

/**
 * @Description: 董事長類：具體處理類
 * @Create: 2018/10/23 0023 上午 9:26
 */
public class President extends Approver {

    public President(String name) {
        super(name);
    }

    public void processRequest(PurchaseRequest request) {
        if (request.getAmount() < 50000) {
            System.out.println("董事長" + this.name + "審批採購單:" + request.getNumber() + ",金額:" + request.getAmount() + "元，採購目的：" + request.getPurpose() + ".");
        } else {
            this.successor.processRequest(request);
        }
    }
}
