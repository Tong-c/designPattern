package com.tong.art.proxy.staticProxy;

/**
 * @Description: 身份驗證類：業務類
 * @Create: 2018/10/22 0022 上午 9:16
 */
public class AccessValidator {
    public boolean validate(String userId) {
        System.out.println("在數據庫中驗證用戶'" + userId + "'是否是合法用戶？");
        if (userId.equalsIgnoreCase("楊過")) {
            System.out.println("'" + userId + "'");
            return true;
        }else {
            System.out.println("'" + userId + "'登陸失敗");
            return false;
        }
    }
}
