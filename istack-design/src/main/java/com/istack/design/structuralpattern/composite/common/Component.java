package com.istack.design.structuralpattern.composite.common;


/**
* component(抽象构件)它可以是抽象类或接口，为叶子构件和容器构件声明的接口，在该角色中可以包含所有子类共有的声明和实现。
* */
public abstract class  Component {

    public abstract void add(Component component);
    public abstract void remmove(Component component);
    public abstract Component getChild(int i);
    public abstract void operation();

}
