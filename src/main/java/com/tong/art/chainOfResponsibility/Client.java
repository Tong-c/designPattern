package com.tong.art.chainOfResponsibility;

public class Client {
    public static void main(String[] args) {
        Approver wjzhang, gyang, jguo, meeting;
        wjzhang = new Director("張無忌");
        gyang = new VicePresident("楊過");
        jguo = new President("郭靖");
        meeting = new Congress("董事會");

        wjzhang.setSuccessor(gyang);
        gyang.setSuccessor(jguo);
        jguo.setSuccessor(meeting);

        PurchaseRequest pr1 = new PurchaseRequest(45000, 10001, "購買倚天劍");
        wjzhang.processRequest(pr1);

        PurchaseRequest pr2 = new PurchaseRequest(60000, 10002, "購買屠龍刀");
        wjzhang.processRequest(pr2);

        PurchaseRequest pr3 = new PurchaseRequest(160000, 10003, "購買九陽真經");
        wjzhang.processRequest(pr3);

        PurchaseRequest pr4 = new PurchaseRequest(800000, 10004, "購買桃花島");
        wjzhang.processRequest(pr4);


    }
}
