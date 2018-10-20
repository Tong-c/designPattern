package com.tong.art.flyweight;

public class Client {


    public static void main(String[] args) {
        IgoCheeseman black1, black2, black3, white1, white2;
        IgoCheesemanFactory factory;

        factory = IgoCheesemanFactory.getInstance();

        black1 = factory.getIgoCheeseman("b");
        black2 = factory.getIgoCheeseman("b");
        black3 = factory.getIgoCheeseman("b");
        System.out.println("判斷兩顆黑子是否相同：" + (black1 == black2));

        white1 = factory.getIgoCheeseman("w");
        white2 = factory.getIgoCheeseman("w");
        System.out.println("判斷兩顆白子是否相同：" + (white1 == white2));

        black1.display(new Coordinates(1, 2));
        black2.display(new Coordinates(3, 4));
        black3.display(new Coordinates(1, 3));
        white1.display(new Coordinates(2, 5));
        white2.display(new Coordinates(2, 4));
    }
}
