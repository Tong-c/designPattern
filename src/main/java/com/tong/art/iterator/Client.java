package com.tong.art.iterator;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        List products = new ArrayList();
        products.add("倚天劍");
        products.add("屠龍刀");
        products.add("斷腸草");
        products.add("葵花寶典");
        products.add("四十二章經");

        AbstractObjectList list;
        AbstractIterator iterator;

        list = new ProductList(products);
        iterator = list.createIterator();

        System.out.println("正向遍歷:");
        while (!iterator.isLast()) {
            System.out.println(iterator.getNextItem() + ",");
            iterator.next();
        }
        System.out.println();
        System.out.println("--------------------------");
        System.out.println("逆向遍歷:");
        while (!iterator.isFirst()) {
            System.out.println(iterator.getPreviousItem() + ",");
            iterator.previous();
        }
    }
}
