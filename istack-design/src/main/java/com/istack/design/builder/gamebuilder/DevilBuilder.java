package com.istack.design.builder.gamebuilder;

public class DevilBuilder extends ActorBuilder{


    public void buildType() {
        actor.setType("Devil");
    }

    public void buildSex() {
       actor.setSex("man");
    }

    public void buildFace() {
   actor.setFace("Ugly");
    }

    public void buildCostume() {
       actor.setCostume("BlackClothing");
    }

    public void buildHairstyle() {
       actor.setHairstyle("Barehead");
    }

    @Override
    public boolean isBareheaded() {
        return true;
    }
}
