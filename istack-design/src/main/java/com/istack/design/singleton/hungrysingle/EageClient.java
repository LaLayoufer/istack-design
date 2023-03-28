package com.istack.design.singleton.hungrysingle;

public class EageClient {


    public static void main(String[] args) {

        EageSingleton eageSingleton = null;
       eageSingleton=EageSingleton.getInstance();
        try {
            Thread.sleep(10000);
            eageSingleton.add();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }
}
