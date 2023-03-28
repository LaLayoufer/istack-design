package com.istack.design.singleton.common;

public class LoadBalancerClient {

    public static void main(String[] args) {
        //创建四个LoadBalancd对象
        LoadBalancer loadBalancer1,loadBalancer2,loadBalancer3,loadBalancer4;
        loadBalancer1=LoadBalancer.getInstance();
        loadBalancer2=LoadBalancer.getInstance();
        loadBalancer3=LoadBalancer.getInstance();
        loadBalancer4=LoadBalancer.getInstance();
        if(loadBalancer1 == loadBalancer2 && loadBalancer2==loadBalancer3 && loadBalancer3 ==loadBalancer4){
            System.out.println("服务器负载均衡衡器是一致的");
        }

        //增加服务器
        loadBalancer1.addServer("Server1");
        loadBalancer2.addServer("Server2");
        loadBalancer3.addServer("Server3");
        loadBalancer4.addServer("Server4");
        //模拟客户端请求分发如果结果为同一个server可以将i适当放大


        for (int i = 0; i < 10; i++) {
            String  server=loadBalancer1.getServer();
            System.out.println(server);
        }






    }




}
