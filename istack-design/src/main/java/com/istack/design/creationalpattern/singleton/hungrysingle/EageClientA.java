package com.istack.design.creationalpattern.singleton.hungrysingle;

public class EageClientA {




    public static void main(String[] args) {

        EageSingleton eageSingleton = null;
        eageSingleton=EageSingleton.getInstance();

            eageSingleton.add();



    }


}
