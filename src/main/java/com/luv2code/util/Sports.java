package com.luv2code.util;

import com.luv2code.demo.Coach;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class Sports implements Coach {

    public Sports()
    {
        System.out.println("Sports Constructor");
    }

    @PostConstruct
    public void postConstructor() {
        System.out.println("ssssss() : " + getClass().getSimpleName());
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println("preDestroy() : " +getClass().getSimpleName());
    }
    @Override
    public String getWorkOut() {
        return "15 min running";
    }
}
