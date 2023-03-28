package com.istack.design.clone.prototypemanager;

import com.istack.design.clone.ConcretePototype;
import com.istack.design.clone.shallowclone.Prototype;

import java.util.Hashtable;

public class PrototypeManager {

    private Hashtable prototypeTable=new Hashtable();
    public PrototypeManager(){
        prototypeTable.put("A",new ConcretePototype());
        prototypeTable.put("B",new ConcretePototype());
    }

    public void add(String key,Prototype prototype){

        prototypeTable.put(key,prototype);

    }
    public Prototype get(String key){
        Prototype clone=null;
        clone=((Prototype) prototypeTable.get(key)).clone();
        return clone;
    }




}
