package com.istack.design.structuralpattern.composite.common;

import java.util.ArrayList;


/**
 * Composite(容器构件)表示容器构件对象，容器节点包含子节点，提供一个集合用于存储子节点，
 * 子节点可以是叶子节点也可以容器节点，业务方中可以递归调用其子节点的业务方法
 *
 * */
public class Composite extends Component{
    private ArrayList<Component> list =new ArrayList<>();

    @Override
    public void add(Component component) {
        list.add(component);
    }

    @Override
    public void remmove(Component component) {
        list.remove(component);
    }

    @Override
    public Component getChild(int i) {
        return (Component) list.get(i);
    }

    @Override
    public void operation() {
        for (Object object : list) {
            ((Component)object).operation();
        }
    }
}
