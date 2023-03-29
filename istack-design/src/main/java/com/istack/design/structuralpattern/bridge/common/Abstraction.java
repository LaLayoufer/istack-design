package com.istack.design.structuralpattern.bridge.common;

public abstract class Abstraction {
    protected  Implementor implementor;//第一实现类的接口
    public void setImplementor(Implementor implementor){
        this.implementor=implementor;
    }
    public  abstract void opreation();//声明抽象业务方法
}
