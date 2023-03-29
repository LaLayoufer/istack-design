package com.istack.design.structuralpattern.bridge.common;

import com.istack.design.structuralpattern.bridge.common.Abstraction;

public class RefinedAbstraction extends Abstraction {
    @Override
    public void opreation() {
        //业务代码

        System.out.println("我在画画");
        implementor.operationImpl();//调用实现类的方法
        System.out.println("裤衩");
    }
}
