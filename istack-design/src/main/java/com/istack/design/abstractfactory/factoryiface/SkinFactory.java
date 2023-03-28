package com.istack.design.abstractfactory.factoryiface;

import com.istack.design.abstractfactory.provideriface.Button;
import com.istack.design.abstractfactory.provideriface.ConboBox;
import com.istack.design.abstractfactory.provideriface.FileText;

public interface SkinFactory {


     public Button createButton();
     public FileText createFiletext();
     public ConboBox createConboBox();



}
