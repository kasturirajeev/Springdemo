package com.rajeev.docker.dockerdemo;
import org.springframework.boot.SpringApplication;

import com.javadevelopersguide.springboot.example.HelloWorldController;
/**
 * This Luncher for the spring boot application.
 * 
 * @author manoj.bardhan
 *
 */
public class SpringBootApplicationLuncher {
public static void main(String[] args) {
SpringApplication.run(HelloWorldController.class, args);
}
}