package com.istack.design.creationalpattern.abstractfactory.provider;

import com.istack.design.creationalpattern.abstractfactory.provideriface.Button;

public class SummerButton implements Button {


    public void display(){
        System.out.println("summerbutton");
    }
}
