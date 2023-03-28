package com.istack.design.singleton.common;

public class Singleton {

    private static Singleton instance =null;

    //私有构造函数
    private Singleton(){

    }

    //静态公有工厂方法，返回一个实例
    public static Singleton getInstance(){
        if(instance == null)
        instance =new Singleton();
            return instance;

    }



}
