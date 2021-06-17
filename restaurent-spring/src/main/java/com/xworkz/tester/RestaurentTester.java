package com.xworkz.tester;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.restaurent.Restaurent;

public class RestaurentTester {

	public static void main(String[] args) {
		
		ApplicationContext container = new ClassPathXmlApplicationContext("context.xml");
		
		Restaurent bean = container.getBean(Restaurent.class);
		System.out.println(bean);
		
		
		ClassPathXmlApplicationContext classPathXmlApplicationContext = (ClassPathXmlApplicationContext) container;

		classPathXmlApplicationContext.close();
	}

}
