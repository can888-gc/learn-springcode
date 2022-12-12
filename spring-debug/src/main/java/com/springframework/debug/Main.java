package com.springframework.debug;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Map;
import java.util.Properties;

public class Main {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ap = new ClassPathXmlApplicationContext("application.xml");
	}
}
