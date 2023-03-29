package com.istack.design.creationalpattern.abstractfactory.provider;

import com.istack.design.creationalpattern.abstractfactory.provideriface.ConboBox;

public class SummerConBox implements ConboBox {
    public void display() {
        System.out.println("summerconbox");
    }
}
