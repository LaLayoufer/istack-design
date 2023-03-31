package com.istack.design.creationalpattern.simplfactory.chart;

public class LineChart extends Chart{
    @Override
    public void display() {
        System.out.println("显示折线图");
    }

    public LineChart (){
        System.out.println("创建折线图");
    }
}
