package com.istack.design.builder;

public class Director {
    private Builder builder;

    public Director(Builder builder){
        this.builder=builder;
    }
    public void setBuilder(Builder builder){
        this.builder=builder;

    }


    //铲平构造与组装方法
    public Product construct(){
        builder.buildPartA();
        builder.buildPartB();
        builder.buildPartC();
        return builder.getResult();
    }
}
