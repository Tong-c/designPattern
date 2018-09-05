package com.tong.zen.factoryMethod;

import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @author:仝闖
 * @create:2018-07-02-16-43
 */
public class ClassUtils {

    public static List<Class> getAllClassByInterface(Class c){
        ArrayList<Class> returnClassList = new ArrayList<Class>();
        if(c.isInterface()){
            String packageName = c.getPackage().getName();
            List<Class> allClass = getClasses(packageName);
        }
    }
}
