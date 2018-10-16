package com.tong.art.builder;

/**
 * @Description: 角色建造器：抽象建造者
 * @Create: 2018/10/15 0015 上午 9:48
 */
public abstract class ActorBuilder {
    protected Actor actor = new Actor();

    public abstract void buildType();

    public abstract void buildSex();

    public abstract void buildFace();

    public abstract void buildCostume();

    public abstract void buildHairstyle();

    public Actor createActor() {
        return actor;
    }


}
