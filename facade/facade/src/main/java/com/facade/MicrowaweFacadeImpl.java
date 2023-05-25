package com.facade;

public class MicrowaweFacadeImpl implements MicrowaweFacade{
    private MicrowavePowerModule powerModule;
    private MicrowaweEngineModule engineModule;
    private MicrowaweTimesModule timeModule;

    public MicrowaweFacadeImpl() {
        this.powerModule = new MicrowavePowerModule();
        this.engineModule = new MicrowaweEngineModule();
        this.timeModule = new MicrowaweTimesModule();
    }

    public void defrost() {
        this.powerModule.changePower(2000);
        this.timeModule.setTime(50);
        this.engineModule.runEngine();
    }

    public void warm() {
        this.powerModule.changePower(1500);
        this.timeModule.setTime(25);
        this.engineModule.runEngine();
    }

    public void heat() {
        this.powerModule.changePower(1000);
        this.timeModule.setTime(20);
        this.engineModule.runEngine();
    }
}
