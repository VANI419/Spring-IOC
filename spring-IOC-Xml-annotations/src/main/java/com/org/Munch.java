package com.org;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("m")
@Primary
public class Munch  implements Chocolate{
public void eat() {
	System.out.println("Earing Munch");
}
}
