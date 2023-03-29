package com.istack.design.structuralpattern.bridge.common;

public class Client {

    public static void main(String[] args) {
        RefinedAbstraction refinedAbstraction=new RefinedAbstraction();
        refinedAbstraction.setImplementor(new ConcreteImplementor());
        refinedAbstraction.opreation();
    }
}
