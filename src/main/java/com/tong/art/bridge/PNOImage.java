package com.tong.art.bridge;

/**
 * @Description: PNG格式圖像：擴充圖像類
 * @Create: 2018/10/16 0016 下午 5:47
 */
public class PNOImage extends Image {
    public void parseFile(String fileName) {
        Matrix m = new Matrix();
        imp.doPaint(m);
        System.out.println(fileName + ", 格式為PNG.");
    }
}
