package com.org;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("std")
public class Student {
private int roll;
private String name;
private int age;


public Student(@Value("1") int roll,@Value("krishna")String name,@Value("20")int age) {
	super();
	this.roll = roll;
	this.name = name;
	this.age = age;
}


void display() {
	System.out.println(roll);
	System.out.println(name);
	System.out.println(age);

}
}
