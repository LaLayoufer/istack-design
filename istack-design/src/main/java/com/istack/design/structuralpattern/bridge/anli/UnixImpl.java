package com.istack.design.structuralpattern.bridge.anli;

public class UnixImpl implements ImageImp{
    @Override
    public void doPaint(Matrix matrix) {
        //调用windows系统的绘制函数绘制像素矩阵
        System.out.println("在Unix操作系统中显示图像");
    }
}