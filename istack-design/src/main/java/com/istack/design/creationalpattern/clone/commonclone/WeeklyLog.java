package com.istack.design.creationalpattern.clone.commonclone;

public class WeeklyLog implements Cloneable {

    private  Attachment attachment;
    private String name;
    private String data;
    private String content;



    public WeeklyLog clone (){
        Object obj=null;

        try {
            obj=super.clone();

            return (WeeklyLog) obj;

        } catch (CloneNotSupportedException e) {
            System.out.println("暂时不支持复制");

            return null;

        }

    }

    public Attachment getAttachment() {
        return attachment;
    }

    public void setAttachment(Attachment attachment) {
        this.attachment = attachment;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
