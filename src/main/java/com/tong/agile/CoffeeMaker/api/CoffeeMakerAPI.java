package com.tong.agile.CoffeeMaker.api;

import com.tong.agile.CoffeeMaker.api.state.*;

public interface CoffeeMakerAPI {

    WarmerPlateStatus getWarmerPlateStatus();
    BoilerStatus getBoilerStatus();
    BrewButtonStatus getBrewButtonStatus();
    void  setWarmerState(WarmerState s);
    void setBoilerState(BoilerState s);
    void setIndicatorState(IndicatorState s);
    void setReliefValveState(ReliefValveState s);
}
