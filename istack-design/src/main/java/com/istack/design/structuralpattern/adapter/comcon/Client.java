package com.istack.design.structuralpattern.adapter.comcon;

public class Client {


    public static void main(String[] args) {
         CarController carController=new PoliceCarAdapter();
         carController.move();
         carController.phonate();
         carController.twinkle();
    }



}
