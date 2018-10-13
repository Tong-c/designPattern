package com.tong.art.prototype.manager;

public class SRS implements OfficialDocument {
    public OfficialDocument clone() {
        OfficialDocument srs = null;
        try {
            srs = (OfficialDocument) super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("不支持複製");
        }
        return srs;

    }

    public void display() {
        System.out.println("《軟件需求規格說明書》");
    }
}
