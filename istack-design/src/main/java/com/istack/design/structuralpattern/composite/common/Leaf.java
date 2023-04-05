package com.istack.design.structuralpattern.composite.common;




/**
* leaf( 叶子构件)在组合结构中表示叶子节点对象，叶子节点没有子节点，实现了抽象构件中定义的行为。
* */
public class Leaf extends Component{
    @Override
    public void add(Component component) {
        //异常处理
    }

    @Override
    public void remmove(Component component) {
  //异常处理或错误提示
    }

    @Override
    public Component getChild(int i) {

        return null;
    }

    @Override
    public void operation() {
     //叶子构件具体业务方法的实现
        System.out.println("我是叶子构件我试一下水");

    }
}
