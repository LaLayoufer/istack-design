package com.istack.design.structuralpattern.adapter.twoway;

public class ConreateAdaptee implements Adaptee {
    @Override
    public void specificRequest() {
        System.out.println("我是ConreateAdaptee我实现了Adaptee的方法");
    }
}
