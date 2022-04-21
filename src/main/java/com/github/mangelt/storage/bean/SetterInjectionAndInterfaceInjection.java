package com.github.mangelt.storage.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class SetterInjectionAndInterfaceInjection {
    //name: setterInjectionAndInterfaceInjection

    @Autowired
    protected ClassA classA;

    protected ClassB classB;

    @Autowired
    InterfaceInjection interfaceInjection;

    @Autowired
    public void setClassB(ClassB classB) {
        this.classB = classB;
        System.out.println(classB.getClass().getSimpleName() + "::SetterInjection");
    }

    @PostConstruct
    private void postConstruct() {
        System.out.println(interfaceInjection.getClass().getSimpleName() + "::InterfaceInjection");
    }

}
