package com.tong.zen.proxy;

public class WangPo implements KindWomen {

    private KindWomen kindWomen;

    public WangPo(){
        this.kindWomen = new PanJinLian();
    }

    public WangPo(KindWomen kindWomen){
        this.kindWomen = kindWomen;
    }

    public void makeEyesWithMan() {
        this.kindWomen.makeEyesWithMan();
    }

    public void happyWithMan() {
        this.kindWomen.happyWithMan();
    }
}
