package com.istack.design.creationalpattern.builder;

public abstract class Builder {

    protected Product product =new Product();

    public abstract void buildPartA();
    public abstract void buildPartB();
    public abstract void buildPartC();

    public Product getResult(){
        return product;
    }

}
