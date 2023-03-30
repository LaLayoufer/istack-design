package com.istack.design.structuralpattern.bridge.anli;

public class BMPimage extends Image{
    @Override
    public void parseFile(String fileName) {
        imageImp.doPaint(matrix);
        System.out.println( fileName+"格式为BMP");
    }
}
