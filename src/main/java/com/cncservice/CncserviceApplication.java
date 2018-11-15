package com.cncservice;

import com.sun.org.apache.bcel.internal.util.ClassPath;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = {"com.cncservice.dao"})
public class CncserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(CncserviceApplication.class, args);


    }
}
