package com.tong.art.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description: 抽象聚合類
 * @Create: 2018/10/26 0026 上午 10:01
 */
public abstract class AbstractObjectList {

    protected List<Object> objects = new ArrayList<Object>();

    public AbstractObjectList(List objects) {
        this.objects = objects;
    }

    public void addObject(Object object) {
        this.objects.add(object);
    }

    public void removeObject(Object object) {
        this.objects.remove(object);
    }

    public List getObjects() {
        return this.objects;
    }

    public abstract AbstractIterator createIterator();
}
