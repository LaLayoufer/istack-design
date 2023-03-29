package com.istack.design.structuralpattern.adapter.comcon;

public abstract class CarController {

    public void move(){
        System.out.println("玩具车在移动");
    }

    public  abstract void phonate();//发出声影
    public abstract void twinkle();//灯光闪烁




}
