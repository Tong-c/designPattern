package com.tong.art.facade;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @Description: 文件保存類：子系統類
 * @Create: 2018/10/20 0020 上午 9:37
 */
public class FileWriter {
    public void write(String encryptStr, String fileNameDes) {
        System.out.println("保存密文，寫入文件");
        try {
            FileOutputStream outFS = new FileOutputStream(fileNameDes);
            outFS.write(encryptStr.getBytes());
            outFS.close();
        } catch (FileNotFoundException e) {
            System.out.println("文件不存在");
        } catch (IOException e) {
            System.out.println("文件操作錯誤");
        }

    }
}
