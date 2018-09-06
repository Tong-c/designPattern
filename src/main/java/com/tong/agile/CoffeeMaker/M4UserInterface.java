package com.tong.agile.CoffeeMaker;

import com.tong.agile.CoffeeMaker.api.CoffeeMakerAPI;
import com.tong.agile.CoffeeMaker.api.state.BrewButtonStatus;
import com.tong.agile.CoffeeMaker.api.state.IndicatorState;

public class M4UserInterface extends UserInterface implements Pollable {

    private CoffeeMakerAPI api;

    public M4UserInterface(CoffeeMakerAPI api) {
        this.api = api;
    }


    public void poll() {
        BrewButtonStatus buttonStatus = api.getBrewButtonStatus();
        if (buttonStatus == BrewButtonStatus.PUSHED) {
            startBrewing();
        }
    }

    public void done() {
        api.setIndicatorState(IndicatorState.ON);
    }

    public void completeCycle() {
        api.setIndicatorState(IndicatorState.OFF);
    }
}
