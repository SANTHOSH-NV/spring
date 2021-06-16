package com.xworkz.tester;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.sanitizer.Sanitizer;

public class SanitizerTester {

	public static void main(String[] args) {

		ApplicationContext container = new ClassPathXmlApplicationContext("applicationContext.xml");

		Sanitizer bean = container.getBean(Sanitizer.class);

		System.out.println(bean);

		ClassPathXmlApplicationContext classPathXmlApplicationContext = (ClassPathXmlApplicationContext) container;

		classPathXmlApplicationContext.close();

	}
}
