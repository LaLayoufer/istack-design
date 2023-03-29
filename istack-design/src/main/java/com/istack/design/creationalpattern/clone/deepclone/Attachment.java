package com.istack.design.creationalpattern.clone.deepclone;

import java.io.Serializable;

public class Attachment implements Serializable {

    //使用序列化来进行深度克隆(Serializable)
  private String name;

  public void setName(String name ){
      this.name=name;
  }
  public String getName(){
      return name;
  }


  public void dowlond (){
      System.out.println("下载文件。文件名"+name);
  }




}
