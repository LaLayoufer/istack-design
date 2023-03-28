package com.istack.design.clone.shallowclone;

public class ConcretePototype extends Prototype {
    String att;//成员变量


    public String getAtt() {
        return att;
    }

    public void setAtt(String att) {
        this.att = att;
    }




    public Prototype clone() {

        ConcretePototype concretePototype=new ConcretePototype();//创建新对象

        concretePototype.setAtt(this.att);
        return concretePototype;
    }
}
