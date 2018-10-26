package com.tong.art.iterator;

import java.lang.reflect.Proxy;
import java.util.List;

/**
 * @Description: 商品數據類：具體聚合類
 * @Create: 2018/10/26 0026 上午 10:00
 */
public class ProductList extends AbstractObjectList {

    public ProductList(List products) {
        super(products);
    }

    public AbstractIterator createIterator() {

        return new ProductIterator(this);
    }
}
