package com.tong.zen.factoryMethod;

public class NvWa {

    public static void main(String[] args) {
        System.out.println("------------造出的第一批人是这样的：白人\n" +
                "-----------------");
        Human whiteHuman = HumanFactory.createHuman(WhiteHuman.class);
        whiteHuman.laugh();
        whiteHuman.cry();
        whiteHuman.talk();

        System.out.println("\n\n------------造出的第二批人是这样的：黑人-----------------");
        Human blackHuman = HumanFactory.createHuman(BlackHuman.class);
        blackHuman.cry();
        blackHuman.laugh();
        blackHuman.talk();

        System.out.println("\\n\\n------------造出的第三批人是这样的：黄色人种\n" +
                "-----------------");
        Human yellowHuman = HumanFactory.createHuman(YellowHuman.class);
        yellowHuman.cry();
        yellowHuman.laugh();
        yellowHuman.talk();


    }
}
