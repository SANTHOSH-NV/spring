package com.xworkz.tester;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.supermarket.SuperMarket;

public class SuperMarketUtil {

	public static void main(String[] args) {
		
		ApplicationContext container = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		
		SuperMarket bean = container.getBean(SuperMarket.class);
		
		System.out.println(bean);
		
		
		ClassPathXmlApplicationContext classPathXmlApplicationContext = (ClassPathXmlApplicationContext) container;

		classPathXmlApplicationContext.close();
		
		
	}

}
