package com.org;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PersonDriver {
public static void main(String[] args) {
	ApplicationContext ac=new ClassPathXmlApplicationContext("spring.xml");
	Person p=(Person)ac.getBean("per");
	System.out.println(p.getPid());
	System.out.println(p.getName());
	System.out.println(p.getGender());
}
}
