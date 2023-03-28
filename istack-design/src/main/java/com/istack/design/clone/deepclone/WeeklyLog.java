package com.istack.design.clone.deepclone;

import java.io.*;

public class WeeklyLog implements Serializable {

    //通过实现序列化来进行深度克隆Serializable

    private Attachment attachment;
    private String name;
    private String date;
    private String content;


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

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }



    ///序列化技术实现克隆
    public WeeklyLog deepClone(){

        try {

            //将对象写入流中
            ByteArrayOutputStream byteArrayOutputStream=new ByteArrayOutputStream();
            ObjectOutputStream objectOutputStream=new ObjectOutputStream(byteArrayOutputStream);
            objectOutputStream.writeObject(this);
            //将对象从流中取出
            ByteArrayInputStream byteArrayInputStream=new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
            ObjectInputStream objectInputStream=new ObjectInputStream(byteArrayInputStream);

            return (WeeklyLog) objectInputStream.readObject();




        } catch (IOException e) {

            System.out.println("写入对象为空");
        } catch (ClassNotFoundException e) {
            System.out.println("找不到相对应的类");
        }

        return null;

    }


}
