package com.istack.design.creationalpattern.simplfactory.chart;

public class PieChart extends Chart{
    @Override
    public void display() {
        System.out.println("显示饼状图");
    }
    public PieChart(){
        System.out.println("创建饼状图");
    }
}
