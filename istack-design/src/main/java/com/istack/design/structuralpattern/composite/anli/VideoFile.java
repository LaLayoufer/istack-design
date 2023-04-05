package com.istack.design.structuralpattern.composite.anli;

public class VideoFile extends AbstractFile{
    private String name;

    public VideoFile(String name){
        this.name=name;
    }
    @Override
    public void add(AbstractFile file) {
        System.out.println("对不起暂时不支持增加，因为是叶子构件");
    }

    @Override
    public void remove(AbstractFile file) {
        System.out.println("对不起暂时不支持删除因为是叶子构件");
    }

    @Override
    public AbstractFile getChild(int i) {
        System.out.println("对不起暂时不支持返回因为是叶子构件，返回null");
        return null;
    }

    @Override
    public void killVirus() {
        System.out.println("现在对视频文件"+name+"进行杀毒");
    }
}
