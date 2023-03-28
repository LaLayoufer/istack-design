package com.istack.design.builder;

public class ConcreteBuilder extends Builder {

    public void buildPartA() {
        product.setPartA("A1");
    }

    public void buildPartB() {
      product.setPartB("B1");
    }

    public void buildPartC() {
        product.setPartC("C1");
    }
}
