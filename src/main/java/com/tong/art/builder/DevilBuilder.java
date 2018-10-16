package com.tong.art.builder;

/**
 * @Description: 惡魔角色建造器：具體建造者
 * @Create: 2018/10/15 0015 上午 9:58
 */
public class DevilBuilder extends ActorBuilder {
    public void buildType() {
        actor.setType("惡魔");
    }

    public void buildSex() {
        actor.setSex("妖");
    }

    public void buildFace() {
        actor.setFace("醜陋");
    }

    public void buildCostume() {
        actor.setCostume("黑衣");
    }

    public void buildHairstyle() {
        actor.setHairstyle("光頭");
    }
}
