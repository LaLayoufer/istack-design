package com.istack.design.structuralpattern.adapter.twoway;

public class ConcreateTarget implements Target {
    @Override
    public void request() {
        System.out.println( "我是ConcreateTarget我实现了target借口的方法");
    }
}
