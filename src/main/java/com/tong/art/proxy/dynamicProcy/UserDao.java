package com.tong.art.proxy.dynamicProcy;

/**
 * @Description: 具體UserDao:真實角色
 * @Create: 2018/10/22 0022 上午 9:53
 */
public class UserDao implements AbstractUserDao {
    public Boolean findUserById(String userId) {
        if (userId.equalsIgnoreCase("張無忌")) {
            System.out.println("查詢ID為" + userId + "的用戶信息成功");
            return true;
        } else {
            System.out.println("查詢ID為" + userId + "的用戶信息失敗");
            return false;
        }
    }
}
