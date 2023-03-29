package com.istack.design.structuralpattern.adapter.defaultpa;

public abstract class AbstracServiceClass implements ServiceInterface {
    //缺省适配类
    public void serviceMethod1() {
        System.out.println("1");
    }
    public void serviceMethod2() {
        System.out.println("2");
    }
    public void serviceMethod3() {
        System.out.println("3");
    }
}
