package com.tong.art.observer;

public class Client {
    public static void main(String[] args) {
        AllyControlCenter acc;
        acc = new ConcreteAllyControlCenter("金庸群俠");

        Observer player1, player2, player3, player4;

        player1 = new Player("楊過");
        acc.join(player1);

        player2 = new Player("令狐沖");
        acc.join(player2);

        player3 = new Player("張無忌");
        acc.join(player3);

        player4 = new Player("段譽");
        acc.join(player4);

        player1.beAttacked(acc);
    }
}
