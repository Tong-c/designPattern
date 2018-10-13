package com.tong.art.prototype.manager;

public class FAR implements OfficialDocument {
    public OfficialDocument clone() {
        OfficialDocument far = null;
        try {
            far = (OfficialDocument) super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("不支持複製");
        }
        return far;
    }

    public void display() {
        System.out.println("《可行性分析報告》");
    }
}
