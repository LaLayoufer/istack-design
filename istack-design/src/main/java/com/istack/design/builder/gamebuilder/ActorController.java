package com.istack.design.builder.gamebuilder;

public class ActorController {



    public Actor construct (ActorBuilder actorBuilder){
        Actor actor;
        actorBuilder.buildType();
        actorBuilder.buildCostume();
        actorBuilder.buildFace();
        actorBuilder.buildHairstyle();
        actorBuilder.buildSex();
        actor=actorBuilder.createActor();
        return  actor;


    }
}
