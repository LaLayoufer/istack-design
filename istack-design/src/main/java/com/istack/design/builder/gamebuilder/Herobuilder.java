package com.istack.design.builder.gamebuilder;

public class Herobuilder extends ActorBuilder {
    public void buildType() {
        actor.setType("Hero");
    }

    public void buildSex() {
       actor.setSex("Girl");
    }

    public void buildFace() {
          actor.setFace("Beatafull");
    }

    public void buildCostume() {
        actor.setCostume("Armour");
    }

    public void buildHairstyle() {

          actor.setHairstyle("ShortHair");
    }
}
