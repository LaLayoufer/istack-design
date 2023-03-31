package com.istack.design.creationalpattern.simplfactory.common;

public abstract class Product {
    //所有产品类的公有方法
    public void methodsSame(){
        //
        System.out.println("我是是爸爸" );
    }
    public abstract void methodDiff();
}
