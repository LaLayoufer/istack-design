package com.istack.design.structuralpattern.bridge.common;

public class ConcreteImplementor implements Implementor {
    @Override
    public void operationImpl() {
        //具体业务方法的实现
        System.out.println("红色的");
    }
}
