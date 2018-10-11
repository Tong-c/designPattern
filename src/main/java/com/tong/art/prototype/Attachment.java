package com.tong.art.prototype;

/**
 * @Description: 附件類
 * @Author: 仝闖
 * @Create: 2018/10/11 0011 下午 3:48
 */
public class Attachment {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void download() {
        System.out.println("下載附件，文件名為:" + name);
    }
}
