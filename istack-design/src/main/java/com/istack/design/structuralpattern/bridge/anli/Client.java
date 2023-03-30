package com.istack.design.structuralpattern.bridge.anli;

public class Client {
    public static void main(String[] args) {
        WindowsImpl windows=new WindowsImpl();
        JPGimage jpGimage=new JPGimage();
        jpGimage.setImageImp(windows);
        jpGimage.parseFile("琴团长");
    }
}
