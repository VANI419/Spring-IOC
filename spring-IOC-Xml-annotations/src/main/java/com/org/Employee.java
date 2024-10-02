package com.org;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("emp")
public class Employee {
@Value("101")
int eid;
@Value("SMITH")
String name;
@Value("800")
double sal;
}
