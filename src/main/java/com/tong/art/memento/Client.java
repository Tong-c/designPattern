package com.tong.art.memento;

public class Client {

    private static int index = -1;
    private static MementoCaretaker mc = new MementoCaretaker();

    public static void main(String[] args) {
        Cheeseman chess = new Cheeseman("車", 1, 1);
        play(chess);
        chess.setY(4);
        play(chess);
        chess.setX(5);
        play(chess);
    }

    private static void play(Cheeseman chess) {
        mc.setMemento(chess.save());
        System.out.println("棋子" + chess.getLabel() + "當前位置為：" + "第" + chess.getX() + "行" + "第" + chess.getY() + "列。");
    }

    public static void undo(Cheeseman cheese, int i) {
        System.out.println("****悔棋****");
        index--;
        cheese.restore(mc.getMemento(i - 1));
        System.out.println("棋子" + cheese.getLabel() + "當前位置為：" + "第" + cheese.getX() + "行" + "第" + cheese.getY() + "列。");
    }

    public static void redo(Cheeseman chess, int i) {
        System.out.println("****撤銷悔棋****");
        index++;
        chess.restore(mc.getMemento(i + 1));
        System.out.println("棋子" + chess.getLabel() + "當前位置為：" + "第" + chess.getX() + "行" + "第" + chess.getY() + "列。");

    }


}
