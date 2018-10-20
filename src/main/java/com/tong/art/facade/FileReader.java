package com.tong.art.facade;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @Description: 文件讀取類：子系統類
 * @Create: 2018/10/20 0020 上午 9:30
 */
public class FileReader {
    public String read(String fileNameSrc) {
        System.out.println("讀取文件，獲取明文:");
        StringBuffer sb = new StringBuffer();
        try {
            FileInputStream inFS = new FileInputStream(fileNameSrc);
            int data;
            while ((data = inFS.read()) != -1) {
                sb = sb.append((char) data);
            }
            inFS.close();
            System.out.println(sb.toString());
        } catch (FileNotFoundException e) {
            System.out.println("文件不存在");
        } catch (IOException e) {
            System.out.println("文件操作錯誤");
        }
        return sb.toString();
    }
}
