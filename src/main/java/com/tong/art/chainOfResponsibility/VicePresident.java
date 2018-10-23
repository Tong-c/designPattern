package com.tong.art.chainOfResponsibility;

/**
 * @Description: 副董事長類：具體處理類
 * @Create: 2018/10/23 0023 上午 9:18
 */
public class VicePresident extends Approver {
    public VicePresident(String name) {
        super(name);
    }

    public void processRequest(PurchaseRequest request) {
        if (request.getAmount() < 100000) {
            System.out.println("副董事長" + this.name + " 審批採購單:" + request.getNumber() + ",金額:" + request.getAmount() + "元，採購目的:" + request.getPurpose() + ".");
        } else {
            this.successor.processRequest(request);
        }
    }
}
