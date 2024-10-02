package com.org;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {
public static void main(String[] args) {
	ApplicationContext ac= new ClassPathXmlApplicationContext("spring.xml");
	Girl g=(Girl)ac.getBean("g");
	System.out.println(g);
	System.out.println(g.c);
	g.c.eat();
}
}
