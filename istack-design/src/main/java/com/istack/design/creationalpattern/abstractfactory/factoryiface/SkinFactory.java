package com.istack.design.creationalpattern.abstractfactory.factoryiface;

import com.istack.design.creationalpattern.abstractfactory.provideriface.Button;
import com.istack.design.creationalpattern.abstractfactory.provideriface.ConboBox;
import com.istack.design.creationalpattern.abstractfactory.provideriface.FileText;

public interface SkinFactory {


     public Button createButton();
     public FileText createFiletext();
     public ConboBox createConboBox();



}
