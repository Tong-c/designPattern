package com.tong.art.prototype;

/**
 * @Description: 工作週報
 * @Author: 仝闖
 * @Create: 2018/10/11 0011 下午 3:49
 */
public class WeeklyLog implements Cloneable {

    private String name;
    private String date;
    private String content;
    private Attachment attachment;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Attachment getAttachment() {
        return attachment;
    }

    public void setAttachment(Attachment attachment) {
        this.attachment = attachment;
    }

    public WeeklyLog clone() {
        Object obj = null;
        try {
            obj = super.clone();
            return (WeeklyLog) obj;
        } catch (CloneNotSupportedException e) {
            System.out.println("不支持複製!");
            return null;
        }
    }
}
