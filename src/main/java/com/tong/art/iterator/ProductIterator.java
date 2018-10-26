package com.tong.art.iterator;

import java.util.List;

/**
 * @Description: 商品迭代器：具體迭代器
 * @Create: 2018/10/26 0026 上午 10:00
 */
public class ProductIterator implements AbstractIterator {

    private ProductList productList;
    private List products;
    private int cursor1;
    private int cursor2;


    public ProductIterator(ProductList productList) {
        this.productList = productList;
        this.products = productList.getObjects();
        cursor1 = 0;
        cursor2 = products.size() - 1;
    }

    public void next() {
        if (cursor1 < products.size()) {
            cursor1++;
        }
    }

    public boolean isLast() {
        return (cursor1 == products.size());
    }

    public void previous() {
        if (cursor2 > -1) {
            cursor2--;
        }
    }

    public boolean isFirst() {
        return (cursor2 == -1);
    }

    public Object getNextItem() {
        return products.get(cursor1);
    }

    public Object getPreviousItem() {
        return products.get(cursor2);
    }
}
