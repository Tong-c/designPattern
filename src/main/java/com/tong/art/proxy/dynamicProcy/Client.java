package com.tong.art.proxy.dynamicProcy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Client {
    public static void main(String[] args) {
        InvocationHandler handler = null;

        AbstractUserDao userDao = new UserDao();
        handler = new DaoLogHandler(userDao);
        AbstractUserDao proxy = null;

        proxy = (AbstractUserDao) Proxy.newProxyInstance(AbstractUserDao.class.getClassLoader(), new Class[]{AbstractUserDao.class}, handler);
        proxy.findUserById("張無忌");
        System.out.println("-----------------------");

        AbstractDocumentDao docDao = new DocumentDao();
        handler = new DaoLogHandler(docDao);
        AbstractDocumentDao proxy_new = null;

        proxy_new = (AbstractDocumentDao) Proxy.newProxyInstance(AbstractDocumentDao.class.getClassLoader(), new Class[]{AbstractDocumentDao.class}, handler);
        proxy_new.deleteDocumentById("D002");
    }
}
