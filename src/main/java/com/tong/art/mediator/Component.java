package com.tong.art.mediator;

/**
 * @Description: 抽象組件類：抽象同事類
 * @Create: 2018/10/31 0031 上午 9:16
 */
abstract class Component {
    protected Mediator mediator;

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public void changed() {
        mediator.componentChanged(this);
    }

    public abstract void update();
}
