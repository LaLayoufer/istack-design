package com.istack.design.structuralpattern.adapter.comcon;

public class PoliceCarAdapter extends CarController {
    private PoliceLamp policeLamp;  //定义适配者policeLamp
    private PoliceSound policeSound; //定义适配者policsound

    public PoliceCarAdapter(){
        policeLamp=new PoliceLamp();
        policeSound=new PoliceSound();
    }
    //发出警笛
    @Override
    public void phonate() {
      policeSound.alarmSound();
    }
    //警灯闪烁
    @Override
    public void twinkle() {
        policeLamp.alarmLamp();
    }
}
