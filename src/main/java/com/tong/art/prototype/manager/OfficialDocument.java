package com.tong.art.prototype.manager;

/**
 * @Description: 抽象公文接口
 * @Author: 仝闖
 * @Create: 2018/10/13 0013 上午 9:37
 */
public interface OfficialDocument extends Cloneable {
    OfficialDocument clone();

    void display();
}
