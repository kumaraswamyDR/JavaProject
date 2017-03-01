package com.kumar.JavaProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by kumaraswamyDR on 01/03/17.
 */

@EnableAutoConfiguration
@SpringBootApplication
public class Application {

    public static  void main(String[] args){
        SpringApplication.run(Application.class,args);

    }

}
