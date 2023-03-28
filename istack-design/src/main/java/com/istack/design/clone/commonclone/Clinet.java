package com.istack.design.clone.commonclone;

public class Clinet {

    public static void main(String[] args) {
        WeeklyLog oldweeklyLog,newweeklyLog;
        oldweeklyLog=new WeeklyLog();
        oldweeklyLog.clone();
        Attachment attachmenta=new  Attachment();
        oldweeklyLog.setAttachment(attachmenta);
        newweeklyLog=oldweeklyLog.clone();


        System.out.println(newweeklyLog.equals(oldweeklyLog));


    }


}
