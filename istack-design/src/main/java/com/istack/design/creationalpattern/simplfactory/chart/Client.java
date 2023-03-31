package com.istack.design.creationalpattern.simplfactory.chart;

import com.istack.design.creationalpattern.simplfactory.common.Factory;

public class Client {
    public static void main(String[] args) {
        Chart chart;
        chart=ChartFactory.getChart("line");
        chart.display();
    }
}
