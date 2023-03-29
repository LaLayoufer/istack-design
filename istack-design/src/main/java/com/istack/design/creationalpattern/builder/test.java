package com.istack.design.creationalpattern.builder;

public class test {


    public static void main(String[] args) {
        Builder builder=new ConcreteBuilder();
        Director director=new Director(builder);
        Product product =director.construct();
        System.out.println(product);
    }
}
