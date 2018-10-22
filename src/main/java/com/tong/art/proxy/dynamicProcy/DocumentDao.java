package com.tong.art.proxy.dynamicProcy;

/**
 * @Description: 具體DocumentDao類：真實角色
 * @Create: 2018/10/22 0022 上午 9:56
 */
public class DocumentDao implements AbstractDocumentDao {
    public boolean deleteDocumentById(String documentId) {
        if (documentId.equalsIgnoreCase("D001")) {
            System.out.println("刪除ID為" + documentId + "的文檔信息成功");
            return true;
        } else {
            System.out.println("刪除ID為" + documentId + "的文檔信息失敗");
            return false;
        }
    }
}
