package com.istack.design.builder.gamebuilder;

public abstract class ActorBuilder {


    protected Actor actor=new Actor();
    public abstract void buildType();
    public abstract void buildSex();
    public abstract void buildFace();
    public abstract void buildCostume();
    public abstract void buildHairstyle();

    public Actor createActor(){
        return actor;
    }


   //钩子方法
    public boolean isBareheaded(){
        return false;
    }
    public Actor construct (){
        Actor actor;
       this.buildType();
       this.buildCostume();
       this.buildFace();

       if (!this.isBareheaded()){
           this.buildHairstyle();
       }
       this.buildSex();
       actor=this.createActor();
        return  actor;

    }
}
