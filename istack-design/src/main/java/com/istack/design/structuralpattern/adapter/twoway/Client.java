package com.istack.design.structuralpattern.adapter.twoway;

public class Client {

    public static void main(String[] args) {
      ConcreateTarget concreateTarget=new ConcreateTarget();
      Adapter adapter=new Adapter(concreateTarget);
      adapter.specificRequest();

    }
}
