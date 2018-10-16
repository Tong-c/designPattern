package com.tong.art.bridge;

/**
 * @Description: BMP格式圖像：擴充圖像類
 * @Create: 2018/10/16 0016 下午 5:49
 */
public class BMPImage extends Image {
    public void parseFile(String fileName) {
        Matrix m = new Matrix();
        imp.doPaint(m);
        System.out.println(fileName + ",格式為BMP.");
    }
}
