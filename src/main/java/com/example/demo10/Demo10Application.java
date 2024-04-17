package com.example.demo10;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class Demo10Application {

	public static void main(String[] args) {

		SpringApplication.run(Demo10Application.class, args);

		ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
		Emp emp2= context.getBean("emp1",Emp.class);
		System.out.println(emp2);

	}

}
