package com.istack.design.creationalpattern.singleton.hungrysingle;

public class EageSingleton {
    private static int i=0,y;
    private static  EageSingleton instance= new EageSingleton();

    private EageSingleton (){

       i++;

    }

    public static   EageSingleton getInstance (){
        return instance;

    }
    public static void static_methods(){
        System.out.println("static被调用了");
    }

    public void testmethods(){
        System.out.println("我被调用了");
    }
    //当类被加载时，静态唯一实例被初始化；
    //私有构造器会被调用
    public static int getI(){
        return i;
    }

    public void add(){
        y++;
        System.out.println(y);
    }
}
