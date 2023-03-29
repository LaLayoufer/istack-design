package com.istack.design.creationalpattern.singleton.common;

public class Client {

    public static void main(String[] args) {
        Singleton singleton=Singleton.getInstance();
        Singleton singleton1=Singleton.getInstance();


        //判断两个实例是否相同
        System.out.println(singleton == singleton1);
        System.out.println(singleton.getClass().equals(singleton1.getClass()));




    }



}
