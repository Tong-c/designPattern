package com.tong.factoryMethod;

public class HumanFactory {

    public static Human createHuman(Class c){
        Human human = null;

        try {
            human = (Human) Class.forName(c.getName()).newInstance();



        } catch (InstantiationException e) {
            System.out.println("必須指定人種顔色");
        } catch (IllegalAccessException e) {
            System.out.println("人種定義錯誤");
        } catch (ClassNotFoundException e) {
            System.out.println("混蛋，你指定的人種找不到");
        }

        return human;
    }

}
