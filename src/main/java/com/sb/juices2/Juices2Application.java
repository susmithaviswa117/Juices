package com.sb.juices2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Juices2Application {
    public static void main(String[] args) {
        SpringApplication.run(Juices2Application.class, args);
        System.out.println("✅ Juice Shop Started!");
        System.out.println("🌐 http://localhost:8080");
    }
}