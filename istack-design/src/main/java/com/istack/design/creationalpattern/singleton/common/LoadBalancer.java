package com.istack.design.creationalpattern.singleton.common;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class LoadBalancer {


    //静态的成员变量,存储唯一的服务
    private static LoadBalancer loadBalancerinstance= null;
    //服务器的集合
    private List<String> serverList =null;


    //私有构造器
    private LoadBalancer(){
        serverList=new ArrayList<>();

    }





    public  static LoadBalancer getInstance (){
        if (loadBalancerinstance == null)
            loadBalancerinstance=new LoadBalancer();
        return loadBalancerinstance;
    }


    ///添加服务器
    public void addServer(String server){
        serverList.add(server);
    }
    //删除服务器
    public void removeserver(String server){
        serverList.remove(server);

    }

    //使用random获取随机的服务器
    public String getServer(){
        Random random=new Random();
        int i=random.nextInt(serverList.size());
        return (String)serverList.get(i);

    }


}
