package com.org;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component("per")
public class Person {
  
	private int pid;
	private String name;
	private String gender;
	
	public int getPid() {
		return pid;
	}
	@Value("112")
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getName() {
		return name;
	}
	@Value("krishna")
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	@Value("male")
	public void setGender(String gender) {
		this.gender = gender;
	}
}
