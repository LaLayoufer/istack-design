package com.istack.design.creationalpattern.simplfactory.chart;

public class ChartFactory {

    //工厂静态方法
    public static Chart getChart(String type){
        Chart chart=null;
        if (type.equalsIgnoreCase("histogram")){
            chart=new HistogramChart();
            System.out.println("初始化柱状图");
        }else if(type.equalsIgnoreCase("pie")){
            chart=new HistogramChart();
            System.out.println("初始化饼状图");
        }else if (type.equalsIgnoreCase("line")){
            chart=new LineChart();
            System.out.println("初始化折线图");
        }
        return chart;
    }
}
