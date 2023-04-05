package com.istack.design.structuralpattern.composite.common;


/**
 * 组合模式：组合多个对象形成树形结构以表示具有部分，整体关系层次结构，组合模式让客户可以统一对待单个对象和组合对象。
 * **/
public class Client {
    public static void main(String[] args) {


        Component component=new Composite();
        Leaf leaf=new Leaf();
        component.add(component);



    }
}
