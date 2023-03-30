package com.istack.design.structuralpattern.bridge.anli;

public class GIFimage extends  Image{
    @Override
    public void parseFile(String fileName) {
        imageImp.doPaint(matrix);
        System.out.println(fileName+"格式为Gif");
    }
}
