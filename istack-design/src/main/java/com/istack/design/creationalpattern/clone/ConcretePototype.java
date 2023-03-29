package com.istack.design.creationalpattern.clone;

import com.istack.design.creationalpattern.clone.shallowclone.Prototype;

public class ConcretePototype implements Cloneable {
    String att;//成员变量


    public String getAtt() {
        return att;
    }

    public void setAtt(String att) {
        this.att = att;
    }




    public Prototype clone() {

        Object object=null;

        try {
            object=super.clone();  //浅克隆


        } catch (CloneNotSupportedException e) {

            System.out.println("Not support cloneable");

        }

              return  (Prototype) object;

    }
}
