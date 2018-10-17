package com.tong.art.composite;

import com.tong.art.abstractFactory.TextField;

/**
 * @Description: 文本文件類：葉子構件
 * @Create: 2018/10/17 0017 上午 9:37
 */
public class TextFile extends AbstractFile {
    private String name;

    public TextFile(String name) {
        this.name = name;
    }

    public void add(AbstractFile file) {
        System.out.println("對不起，不支持該方法");
    }

    public void remove(AbstractFile file) {
        System.out.println("對不起，不支持該方法");
    }

    public AbstractFile getChild(int i) {
        System.out.println("對不起，不支持該方法");
        return null;
    }

    public void killVirus() {
        System.out.println("----對文本文件’" + name + "'進行殺毒");
    }
}
