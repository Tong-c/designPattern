package com.tong.art.chainOfResponsibility;

public class Congress extends Approver {

    public Congress(String name) {
        super(name);
    }

    public void processRequest(PurchaseRequest request) {
        System.out.println("召開董事會審批採購單:" + request.getNumber() + ",金額:" + request.getAmount() + "元，採購目的：" + request.getPurpose() + ".");
    }
}
