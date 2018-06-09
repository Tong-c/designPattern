package com.tong.multition;

public class Minister {

    public static void main(String[] args) {
        int ministerNum = 10;

        for(int i = 0; i < ministerNum;i++){
            Emperor emperor = Emperor.getInstance();
            System.out.print("第" + (i + 1) + "個大臣參拜的是");
            emperor.emperorInfo();
        }
    }
}
