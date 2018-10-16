package com.tong.art.adapter;

import com.tong.art.util.XMLUtil;

public class Client {
    public static void main(String[] args) {
        ScoreOperation operation;
        operation = (ScoreOperation) XMLUtil.getBean();
        int scores[] = {84, 76, 50, 69, 90, 91, 88, 96};
        int result[];
        int score;

        System.out.println("成績排序結果:");
        result = operation.sort(scores);

        for (int i : result) {
            System.out.print(i + ",");
        }
        System.out.println();

        System.out.println("查找成績90:");
        score = operation.search(result, 90);
        if (score != -1) {
            System.out.println("找到成績90。");
        }else {
            System.out.println("沒有找到成績90");
        }

        System.out.println("查找成績92：");
        score = operation.search(result, 92);
        if (score != -1) {
            System.out.println("找到成績92");
        }else{
            System.out.println("沒有找到成績92");
        }
    }
}
