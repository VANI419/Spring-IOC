package com.org;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Employeedriver {
public static void main(String[] args) {
	ApplicationContext ac=new ClassPathXmlApplicationContext("spring.xml");
	Employee e=(Employee)ac.getBean("emp");
	System.out.println(e.eid);
	System.out.println(e.name);
	System.out.println(e.sal);
}
}
