package com.tong.art.builder;

/**
 * @Description: 英雄角色建造器：具體建造者
 * @Create: 2018/10/15 0015 上午 9:56
 */
public class HeroBuilder extends ActorBuilder {
    public void buildType() {
        actor.setType("英雄");
    }

    public void buildSex() {
        actor.setSex("男");
    }

    public void buildFace() {
        actor.setFace("英俊");
    }

    public void buildCostume() {
        actor.setCostume("盔甲");
    }

    public void buildHairstyle() {
        actor.setHairstyle("飄逸");
    }
}
