package com.tong.art.prototype.deep;

import java.io.Serializable;

/**
 * @Description: 附件類
 * @Author: 仝闖
 * @Create: 2018/10/13 0013 上午 9:20
 */
public class Attachment implements Serializable {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void download() {
        System.out.println("下載附件，文件名為：" + name);
    }
}
