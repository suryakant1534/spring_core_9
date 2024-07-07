package com.example;

import com.spring.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Example2 {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext2.xml");
        Employee employee = (Employee) context.getBean("employee");
        System.out.println(employee);
    }
}
