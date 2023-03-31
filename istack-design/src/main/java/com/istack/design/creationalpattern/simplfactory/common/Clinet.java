package com.istack.design.creationalpattern.simplfactory.common;

public class Clinet {
    public static void main(String[] args) {
        Product product;
        product=Factory.getProudct("A");//通过工厂类创建产品对象
        product.methodsSame();;
        product.methodDiff();
    }
}
