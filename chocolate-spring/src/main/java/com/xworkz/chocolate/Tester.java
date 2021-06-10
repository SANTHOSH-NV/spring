package com.xworkz.chocolate;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Tester {

	public static void main(String[] a) {
		String configLocation = "applicationContext.xml";
		ApplicationContext container = new ClassPathXmlApplicationContext(configLocation);

		Chocolate bean = container.getBean(Chocolate.class);
//		bean.setName("Munch");
//		bean.setBrand("Nestle");
//		bean.setSize("Big");
//		bean.setPrice(10.00);

		System.out.println(bean);

		bean.taste();

		bean.stressReliver();

	}
}
