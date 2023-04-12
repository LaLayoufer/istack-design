package com.istack.design.structuralpattern.decorator.common;


//这是一个具体构件，继承了抽象构件
public class ConcreteComponent extends Component{
    @Override
    public void operation() {
        //基本功能实现
        System.out.println("我实现了基本的功能");
    }
}
