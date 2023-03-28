package com.istack.design.builder.gamebuilder;

public class AngelBuilder extends ActorBuilder {
    public void buildType() {
        actor.setType("Angel");
    }

    public void buildSex() {
        actor.setSex("Girl");
    }

    public void buildFace() {
      actor.setFace("Baby");
    }

    public void buildCostume() {
         actor.setCostume("Skirt");
    }

    public void buildHairstyle() {
           actor.setHairstyle("LongHair");
    }
}
