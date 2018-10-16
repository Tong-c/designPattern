package com.tong.art.bridge;

/**
 * @Description: JPG格式圖像：擴充抽象類
 * @Create: 2018/10/16 0016 下午 5:46
 */
public class JPGImage extends Image {
    public void parseFile(String fileName) {
        Matrix m = new Matrix();
        imp.doPaint(m);
        System.out.println(fileName + ",格式為JPG.");
    }
}
