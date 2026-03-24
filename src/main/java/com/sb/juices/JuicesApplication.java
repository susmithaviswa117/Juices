package com.sb.juices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JuicesApplication {
    public static void main(String[] args) {
        SpringApplication.run(JuicesApplication.class, args);
        System.out.println("✅ Juice Shop Started!");
        System.out.println("🌐 http://localhost:8080");
    }
}