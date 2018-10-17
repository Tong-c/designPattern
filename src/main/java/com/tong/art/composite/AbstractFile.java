package com.tong.art.composite;

/**
 * @Description: 抽象文件類：抽象構件
 * @Create: 2018/10/17 0017 上午 9:32
 */
public abstract class AbstractFile {
    public abstract void add(AbstractFile file);

    public abstract void remove(AbstractFile file);

    public abstract AbstractFile getChild(int i);

    public abstract void killVirus();
}
