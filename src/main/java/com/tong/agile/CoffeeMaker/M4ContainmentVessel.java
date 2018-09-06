package com.tong.agile.CoffeeMaker;

import com.tong.agile.CoffeeMaker.api.CoffeeMakerAPI;
import com.tong.agile.CoffeeMaker.api.state.WarmerPlateStatus;
import com.tong.agile.CoffeeMaker.api.state.WarmerState;

public class M4ContainmentVessel extends ContainmentVessel implements Pollable {

    private CoffeeMakerAPI api;
    private WarmerPlateStatus lastPotStatus;

    public M4ContainmentVessel(CoffeeMakerAPI api) {
        this.api = api;
        lastPotStatus = WarmerPlateStatus.POT_EMPTY;
    }

    public boolean isReady() {
        WarmerPlateStatus plateStatus = api.getWarmerPlateStatus();
        return plateStatus == WarmerPlateStatus.POT_EMPTY;
    }

    public void poll() {
        WarmerPlateStatus potStatus = api.getWarmerPlateStatus();
        if (potStatus != lastPotStatus) {
            if (isBrewing) {
                handleBrewingEvent(potStatus);
            } else if (isComplete == false) {
                handleIncompleteEvent(potStatus);
            }
            lastPotStatus = potStatus;
        }
    }

    private void handleIncompleteEvent(WarmerPlateStatus potStatus) {
        if (potStatus == WarmerPlateStatus.POT_NOT_EMPTY) {
            api.setWarmerState(WarmerState.ON);
        } else if (potStatus == WarmerPlateStatus.WARMER_EMPTY) {
            api.setWarmerState(WarmerState.OFF);
        } else {
            api.setWarmerState(WarmerState.OFF);
            declareComplete();
        }
    }

    private void handleBrewingEvent(WarmerPlateStatus potStatus) {
        if (potStatus == WarmerPlateStatus.POT_NOT_EMPTY) {
            containerAvailable();
            api.setWarmerState(WarmerState.ON);
        } else if (potStatus == WarmerPlateStatus.WARMER_EMPTY) {
            containerUnavailable();
            api.setWarmerState(WarmerState.OFF);
        } else {
            containerAvailable();
            api.setWarmerState(WarmerState.OFF);
        }
    }
}
