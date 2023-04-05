package com.istack.design.structuralpattern.composite.anli;

public class Client {
    public static void main(String[] args) {
        AbstractFile file1,file2,file3,file4,floder1,floder2,floder3,floder4;
        floder1=new Floder("个人资料文件夹");
        floder2=new Floder("图像文件夹");
        floder3=new Floder("视频文件夹");
        floder4=new Floder("文本文件夹");


        file1=new ImageFile("杨冰冰照片");
        file2=new ImageFile("杨冰冰视频");
        file3=new ImageFile("杨冰冰文本");
        file4=new ImageFile("杨冰冰个人资料");


        floder1.add(file4);
        floder2.add(file1);
        floder3.add(file2);
        floder4.add(file3);
        floder3.add(floder4);
        floder2.add(floder3);
        floder1.add(floder2);
        floder1.killVirus();

    }

}
