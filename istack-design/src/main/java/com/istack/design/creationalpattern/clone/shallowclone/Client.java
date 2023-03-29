package com.istack.design.creationalpattern.clone.shallowclone;

public class Client {

   public static   ConcretePototype concretePototype=new ConcretePototype();

    public static void main(String[] args) {
        concretePototype.setAtt("Alice");
        System.out.println(concretePototype.toString());//打印地址
        System.out.println(concretePototype.getAtt());//打印值
        System.out.println(concretePototype.getClass());//获取类型


        ConcretePototype concretePototype1=(ConcretePototype)concretePototype.clone();
         System.out.println(concretePototype1.toString());
        System.out.println(concretePototype1.getClass());

          //结论值相同而物理内存的地址不相同，这是一种浅克隆
    }




}
