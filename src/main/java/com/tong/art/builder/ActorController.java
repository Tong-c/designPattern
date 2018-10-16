package com.tong.art.builder;

/**
 * @Description: 遊戲角色創建控制器-指揮者
 * @Create: 2018/10/16 0016 上午 9:05
 */
public class ActorController {

    public Actor construct(ActorBuilder ab) {
        Actor actor;
        ab.buildType();
        ab.buildSex();
        ab.buildFace();
        ab.buildCostume();
        ab.buildHairstyle();
        actor = ab.createActor();
        return actor;
    }
}
