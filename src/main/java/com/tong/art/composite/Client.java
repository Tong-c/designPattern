package com.tong.art.composite;

public class Client {
    public static void main(String[] args) {
        AbstractFile file1, file2, file3, file4, file5, folder1, folder2, folder3, folder4;

        folder1 = new Folder("sunny的資料");
        folder2 = new Folder("圖像文件");
        folder3 = new Folder("文本文件");
        folder4 = new Folder("視頻文件");

        file1 = new ImageFile("小龍女.jpg");
        file2 = new ImageFile("張無忌.gif");
        file3 = new TextFile("九陰真經.txt");
        file4 = new TextFile("葵花寶典.doc");
        file5 = new VideoFile("笑傲江湖.rmvb");

        folder1.add(file1);
        folder2.add(file2);
        folder3.add(file3);
        folder3.add(file4);
        folder1.add(folder2);
        folder1.add(folder3);
        folder1.add(folder4);

        folder1.killVirus();
    }
}
