package com.org;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("c")
public class Car {

	@Autowired
	Engine e;
}
