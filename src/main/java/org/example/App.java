package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        System.out.println("Hi");

        //Create the spring container
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        Dev dev = (Dev) context.getBean("dev");
        dev.build();

        // No unique definition exception  - Dev dev2 = context.getBean(Dev.class); - it will work if we have primary in the bean definition
        Dev dev2 = (Dev) context.getBean("dev2");
        dev2.build();

        Dev dev3 = (Dev) context.getBean("dev3");
        dev3.build();

        Dev dev4 = (Dev) context.getBean("dev4");
        dev4.build();
    }
}
