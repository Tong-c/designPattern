package com.tong.art.prototype;

public class Client {
    public static void main(String[] args) {
        WeeklyLog log_previous = new WeeklyLog();
        log_previous.setName("張無忌");
        log_previous.setDate("第12周");
        log_previous.setContent("這個周工作很忙，每天加班");

        System.out.println("***週報***");
        System.out.println("周次:" + log_previous.getDate());
        System.out.println("姓名:" + log_previous.getName());
        System.out.println("內容:" + log_previous.getContent());
        System.out.println("--------------------------------");

        WeeklyLog log_new;
        log_new = log_previous.clone();
        log_new.setDate("第13周");
        System.out.println("***週報***");
        System.out.println("周次:" + log_new.getDate());
        System.out.println("姓名:" + log_new.getName());
        System.out.println("內容:" + log_new.getContent());


    }
}
