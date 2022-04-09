package com.sikiapp.designpattern;

import com.sikiapp.designpattern.observer.MyEvent;
import com.sikiapp.designpattern.observer.MyPublisher;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DesignPatternApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext = SpringApplication.run(DesignPatternApplication.class, args);
        MyPublisher myPublisher = (MyPublisher)applicationContext.getBean("myPublisher");
        myPublisher.publishEvent(new MyEvent("【event 1】"));
    }



}
