package com.istack.design.structuralpattern.composite.anli;

import java.util.ArrayList;

public class Floder extends AbstractFile{
    //定义集合fileList用于存储AbstractFile类型的成员
    private ArrayList<AbstractFile> list=new ArrayList<>();
    private String name;

    public Floder(String name){
        this.name=name;
    }
    @Override
    public void add(AbstractFile file) {
        list.add(file);
    }

    @Override
    public void remove(AbstractFile file) {
          list.remove(file);
    }

    @Override
    public AbstractFile getChild(int i) {
        return list.get(i);
    }

    @Override
    public void killVirus() {
        System.out.println("对文件夹"+name+"进行消毒");
        for (Object obj : list) {
            ((AbstractFile)obj).killVirus();
        }
    }
}
