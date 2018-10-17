package com.tong.art.composite;

import java.util.ArrayList;

/**
 * @Description: 文件夾類-容器構件
 * @Create: 2018/10/17 0017 上午 9:43
 */
public class Folder extends AbstractFile {
    private ArrayList<AbstractFile> fileList = new ArrayList<AbstractFile>();
    private String name;

    public Folder(String name) {
        this.name = name;
    }

    public void add(AbstractFile file) {
        fileList.add(file);
    }

    public void remove(AbstractFile file) {
        fileList.remove(file);
    }

    public AbstractFile getChild(int i) {
        return (AbstractFile) fileList.get(i);
    }

    public void killVirus() {
        System.out.println(" *** 對文件夾‘" + name + "’進行殺毒");
        for (Object obj : fileList) {
            ((AbstractFile) obj).killVirus();
        }
    }
}
