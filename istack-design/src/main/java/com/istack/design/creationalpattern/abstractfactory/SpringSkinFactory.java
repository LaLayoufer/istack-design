package com.istack.design.creationalpattern.abstractfactory;

import com.istack.design.creationalpattern.abstractfactory.factoryiface.SkinFactory;
import com.istack.design.creationalpattern.abstractfactory.provider.SpringButton;
import com.istack.design.creationalpattern.abstractfactory.provider.SpringConBox;
import com.istack.design.creationalpattern.abstractfactory.provider.SpringText;
import com.istack.design.creationalpattern.abstractfactory.provideriface.Button;
import com.istack.design.creationalpattern.abstractfactory.provideriface.ConboBox;
import com.istack.design.creationalpattern.abstractfactory.provideriface.FileText;

public class SpringSkinFactory implements SkinFactory {


    public void writerbutton() {
        System.out.println("make springskinfactory");
        this.createButton().display();
    }
    public void writerfiletext() {
        System.out.println("make springskinfactory");
        this.createFiletext().display();
    }
    public void writerconbobox() {
        System.out.println("make springskinfactory");
        this.createConboBox().display();
    }




    public Button createButton() {
        return new SpringButton();
    }

    public FileText createFiletext() {
        return new SpringText();
    }

    public ConboBox createConboBox() {
        return new SpringConBox();
    }
}
