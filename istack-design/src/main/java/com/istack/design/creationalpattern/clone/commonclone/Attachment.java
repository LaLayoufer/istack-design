package com.istack.design.creationalpattern.clone.commonclone;

public class Attachment {

    private String name;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    void download(){
        System.out.println("下载附件。文件名"+name);
    }

}
