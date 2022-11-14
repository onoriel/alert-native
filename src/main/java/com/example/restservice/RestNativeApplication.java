package com.example.restservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.nativex.hint.JdkProxyHint;
import org.springframework.nativex.hint.TypeHint;

@SpringBootApplication
@TypeHint(types = oracle.jdbc.driver.OracleDriver.class, typeNames = "oracle.jdbc.driver.OracleDriver")
@JdkProxyHint(types = {
		org.springframework.aop.SpringProxy.class, 
		org.springframework.aop.framework.Advised.class, 
		org.springframework.core.DecoratingProxy.class
	})
public class RestNativeApplication {

    public static void main(String[] args) {
        SpringApplication.run(RestNativeApplication.class, args);
    }

}
