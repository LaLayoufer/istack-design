package com.istack.design.creationalpattern.abstractfactory.provider;

import com.istack.design.creationalpattern.abstractfactory.provideriface.ConboBox;

public class SpringConBox implements ConboBox {


    public void display() {
        System.out.println("springconbox");
    }
}
