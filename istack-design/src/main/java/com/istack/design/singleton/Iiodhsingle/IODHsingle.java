package com.istack.design.singleton.Iiodhsingle;

public class IODHsingle {

    private IODHsingle(){

    }
    private static class HolserClass{
        private final static IODHsingle instance= new IODHsingle();
    }


    public static IODHsingle getInstance(){
        return HolserClass.instance;
    }



}
