package com.springframework.debug;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Map;
import java.util.Properties;

public class Main {
	public static void main(String[] args) {
//		ClassPathXmlApplicationContext ap = new ClassPathXmlApplicationContext("application.xml");
//		Person person = (Person)ap.getBean("person");
//		System.out.println("111");
		Properties properties = System.getProperties();
		Map<String, String> getenv = System.getenv();
		System.out.println("1111");
	}
}
