package com.istack.design.creationalpattern.builder.gamebuilder;

public class Client {


    public static void main(String[] args) {

        ActorBuilder actorBuilder;
        actorBuilder=new DevilBuilder();
        ActorController actorController=new ActorController();
        Actor actor=actorController.construct(actorBuilder);
        System.out.println(actor);
        actor=actorBuilder.construct();

        System.out.println(actor);

    }
}
