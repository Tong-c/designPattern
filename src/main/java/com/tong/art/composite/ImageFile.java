package com.tong.art.composite;

/**
 * @Description: 圖像文件類：葉子構件
 * @Create: 2018/10/17 0017 上午 9:34
 */
public class ImageFile extends AbstractFile {
    private String name;

    public ImageFile(String name) {
        this.name = name;
    }

    public void add(AbstractFile file) {
        System.out.println("對不起，不支持此方法");
    }

    public void remove(AbstractFile file) {
        System.out.println("對不起，不支持此方法");
    }

    public AbstractFile getChild(int i) {
        System.out.println("對不起，不支持此方法");
        return null;
    }

    public void killVirus() {
        System.out.println("----對圖像文件'" + name + "進行殺毒");
    }
}
