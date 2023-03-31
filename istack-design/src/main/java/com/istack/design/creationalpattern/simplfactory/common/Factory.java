package com.istack.design.creationalpattern.simplfactory.common;

public class Factory {
     //  Factory（工厂角色）工厂角色即是工厂类。核心负责创建所有产品实例的内部逻辑；工厂类可以被外界直接调用，创建所需的产品对象
    //Product（抽象产品角色）：他是工厂类创建的所有对象的父类。封个种产品。
    //ConcreateProduct（具体产品角色）简单工厂创建的目标，每一个具体产品角色都继承抽象产品角色，需要实现抽象产品角色的抽象方法。
   public static Product getProudct(String arg){
       Product product=null;
       if (arg.equalsIgnoreCase("A")){
           product=new ConcreteProduct();
       }else if (arg.equalsIgnoreCase("A")){
           product=new ConcreteProduct();
       }
       return product;
   }


}
