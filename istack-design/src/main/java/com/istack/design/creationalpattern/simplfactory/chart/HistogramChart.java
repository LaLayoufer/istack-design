package com.istack.design.creationalpattern.simplfactory.chart;

public class HistogramChart extends Chart{
    @Override
    public void display() {

        System.out.println("显示柱状图");
    }
   public HistogramChart(){
       System.out.println("创建柱状图");
   }
}
