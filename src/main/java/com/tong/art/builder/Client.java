package com.tong.art.builder;

import com.tong.art.util.XMLUtil;

public class Client {
    public static void main(String[] args) {

        ActorBuilder ab;
        ab = (ActorBuilder) XMLUtil.getBean();

        ActorController ac = new ActorController();
        Actor actor;
        actor = ac.construct(ab);

        String type = actor.getType();
        System.out.println(type + "的外觀是:");
        System.out.println("性別：" + actor.getSex());
        System.out.println("面容：" + actor.getFace());
        System.out.println("服裝：" + actor.getCostume());
        System.out.println("髮型：" + actor.getHairstyle());

    }
}
