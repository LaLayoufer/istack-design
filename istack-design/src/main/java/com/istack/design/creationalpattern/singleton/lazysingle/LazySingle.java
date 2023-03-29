package com.istack.design.creationalpattern.singleton.lazysingle;

public class LazySingle {
    private static volatile LazySingle instance;
    //添加修饰volat

    private LazySingle(){

    }

    private static LazySingle getInstance(){


        //双重检验；
        if (instance == null){

            synchronized(LazySingle.class){
                if (instance == null)
                    instance=new LazySingle();
            }

        }
        return  instance;
    }



}
