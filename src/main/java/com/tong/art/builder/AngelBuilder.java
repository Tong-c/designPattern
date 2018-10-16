package com.tong.art.builder;

/**
 * @Description: 天使角色建造器-具體建造者
 * @Create: 2018/10/15 0015 上午 9:56
 */
public class AngelBuilder extends ActorBuilder {
    public void buildType() {
        actor.setType("天使");
    }

    public void buildSex() {
        actor.setSex("女");
    }

    public void buildFace() {
        actor.setFace("漂亮");
    }

    public void buildCostume() {
        actor.setCostume("白裙");
    }

    public void buildHairstyle() {
        actor.setHairstyle("披肩長髮");
    }
}
