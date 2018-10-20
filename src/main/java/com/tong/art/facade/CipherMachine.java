package com.tong.art.facade;

/**
 * @Description: 數據加密類：子系統類
 * @Create: 2018/10/20 0020 上午 9:34
 */
public class CipherMachine {
    public String encrypt(String plainText) {
        System.out.println("數據加密，將明文轉換為密文：");
        String es = "";
        for (int i = 0; i < plainText.length(); i++) {
            String c = String.valueOf(plainText.charAt(i) % 7);
            es += c;
        }
        System.out.println(es);
        return es;
    }
}
