package br.com.ci.cd.openshift.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

import io.fabric8.annotations.Endpoint;

@SpringBootApplication
@ImportResource({"classpath:spring/camel-context.xml"})
@Endpoint
public class Application  {

    // must have a main method spring-boot can run
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
