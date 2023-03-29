package com.istack.design.creationalpattern.abstractfactory;

import com.istack.design.creationalpattern.abstractfactory.factoryiface.SkinFactory;
import com.istack.design.creationalpattern.abstractfactory.provider.SummerButton;
import com.istack.design.creationalpattern.abstractfactory.provider.SummerConBox;
import com.istack.design.creationalpattern.abstractfactory.provider.SummerText;
import com.istack.design.creationalpattern.abstractfactory.provideriface.Button;
import com.istack.design.creationalpattern.abstractfactory.provideriface.ConboBox;
import com.istack.design.creationalpattern.abstractfactory.provideriface.FileText;

public class SummerSkinFactory implements SkinFactory {

    public void writebutotn() {
        System.out.println("make SummerSkinFactory");
        this.createButton().display();
    }
    public void writefiletext() {
        System.out.println("make SummerSkinFactory");
        this.createFiletext().display();
    }
    public void writeconbobox() {
        System.out.println("make SummerSkinFactory");
        this.createConboBox().display();
    }

    public Button createButton() {
        return new SummerButton();
    }

    public FileText createFiletext() {
        return new SummerText();
    }

    public ConboBox createConboBox() {
        return new SummerConBox();
    }
}
