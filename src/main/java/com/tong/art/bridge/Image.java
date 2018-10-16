package com.tong.art.bridge;

/**
 * @Description: 抽象圖像類：抽象類
 * @Create: 2018/10/16 0016 下午 5:37
 */
public abstract class Image {
    protected ImageImp imp;

    public void setImageImp(ImageImp imp) {
        this.imp = imp;
    }

    public abstract void parseFile(String fileName);

}
