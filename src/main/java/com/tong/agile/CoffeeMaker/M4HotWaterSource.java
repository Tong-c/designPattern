package com.tong.agile.CoffeeMaker;

import com.tong.agile.CoffeeMaker.api.CoffeeMakerAPI;
import com.tong.agile.CoffeeMaker.api.state.BoilerState;
import com.tong.agile.CoffeeMaker.api.state.BoilerStatus;
import com.tong.agile.CoffeeMaker.api.state.ReliefValveState;

public class M4HotWaterSource extends HotWaterSource implements Pollable {

    private CoffeeMakerAPI api;

    public M4HotWaterSource(CoffeeMakerAPI api) {
        this.api = api;
    }

    public boolean isReady() {
        BoilerStatus boilerStatus = api.getBoilerStatus();
        return boilerStatus == BoilerStatus.NOT_EMPTY;
    }

    public void startBrewing() {
        api.setReliefValveState(ReliefValveState.CLOSED);
        api.setBoilerState(BoilerState.ON);
    }

    public void pause() {
        api.setBoilerState(BoilerState.OFF);
        api.setReliefValveState(ReliefValveState.OPEN);
    }

    public void resume() {
        api.setBoilerState(BoilerState.ON);
        api.setReliefValveState(ReliefValveState.CLOSED);
    }

    public void poll() {
        BoilerStatus boilerStatus = api.getBoilerStatus();
        if (isBrewing){
            if (boilerStatus == BoilerStatus.EMPTY){
                api.setBoilerState(BoilerState.OFF);
                api.setReliefValveState(ReliefValveState.CLOSED);
                declareDone();
            }
        }
    }
}
