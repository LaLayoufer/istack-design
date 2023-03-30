package com.istack.design.structuralpattern.bridge.anli;

public abstract class Image {
    protected ImageImp imageImp;
    protected Matrix matrix;
    public Image(){
        this.matrix=new Matrix();
    }
    public void setImageImp(ImageImp imageImp) {
        this.imageImp = imageImp;
    }

    public abstract  void parseFile(String fileName);
}
