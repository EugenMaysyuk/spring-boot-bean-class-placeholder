package com.may;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource({"classpath*:context.xml"})
public class Application {

    private ServiceImpl serviceImpl;

    @Autowired
    public void setServiceImpl(@Qualifier("serviceImpl") ServiceImpl serviceImpl) {
        this.serviceImpl = serviceImpl;
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
