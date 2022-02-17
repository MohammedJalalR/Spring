package com.jspider.pkg;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Swiggy {

	public static void main(String[] args) {
		
		
		ApplicationContext context =new ClassPathXmlApplicationContext("config.xml");
		
		Customer c1=(Customer)context.getBean("rcb");
		
		c1.order();

	}

}
