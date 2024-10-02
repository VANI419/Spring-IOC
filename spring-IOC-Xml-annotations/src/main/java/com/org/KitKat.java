package com.org;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
@Component("k")

public class KitKat implements Chocolate {

	public void eat() {
		System.out.println("Eating KitKat");
	}

}
