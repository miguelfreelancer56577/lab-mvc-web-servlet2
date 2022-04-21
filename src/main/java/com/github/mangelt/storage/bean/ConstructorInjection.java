package com.github.mangelt.storage.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ConstructorInjection {
    private ClassA classA;
    public ConstructorInjection(ClassA classA){
        this.classA = classA;
        System.out.println(getClass().getSimpleName() + "::ConstructorInjection");
    }

}
