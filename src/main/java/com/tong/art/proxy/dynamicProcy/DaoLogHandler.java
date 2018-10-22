package com.tong.art.proxy.dynamicProcy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * @Description: 自定義請求處理程序類
 * @Create: 2018/10/22 0022 上午 9:56
 */
public class DaoLogHandler implements InvocationHandler {

    private Calendar calendar;
    private Object object;

    public DaoLogHandler() {

    }

    public DaoLogHandler(Object object) {
        this.object = object;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        beforeInvoke();
        Object result = method.invoke(object, args);
        afterInvoke();
        return null;
    }

    private void afterInvoke() {
        System.out.println("方法調用結束");
    }

    private void beforeInvoke() {
        calendar = new GregorianCalendar();
        int hour = calendar.get(Calendar.HOUR_OF_DAY);
        int minute = calendar.get(Calendar.MINUTE);
        int second = calendar.get(Calendar.SECOND);
        String time = hour + ":" + minute + ":" + second;
        System.out.println("調用時間為：" + time);
    }
}
