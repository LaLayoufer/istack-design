package com.istack.design.structuralpattern.adapter.twoway;

public class Adapter  implements Target,Adaptee {
   private Target target;
   private Adaptee adaptee;

    public Adapter(Target target){
        this.target=target;
    }

    public Adapter(Adaptee adaptee){
        this.adaptee=adaptee;
    }


    @Override
    public void specificRequest() {
        target.request();
    }

    @Override
    public void request() {
        adaptee.specificRequest();
    }
}
