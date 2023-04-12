package com.istack.design.structuralpattern.decorator.common;


//这是一个抽象装饰类。继承了抽象构件（Component）
public class Decorator extends Component{
    private Component component;//维持一个对抽象构件对象的引用


    //注入一个抽象构件类型的对象
    public Decorator(Component component){
        this.component=component;
    }


    @Override
    public void operation() {
        System.out.println("我是一个抽象装饰类");
    }
}
