package com.fis.springlearn;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;


@SpringBootApplication
public class SpringLearnApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringLearnApplication.class, args);
		System.out.println("Hello Akash Telkar \nHow are you??");
		displayDate();
	}
	
	static void displayDate() {
		 ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("date-format.xml");
		 SimpleDateFormat format = context.getBean("dateFormat", SimpleDateFormat.class);
		 
			Date parseDate;
			try {
				parseDate = (Date) format.parse("31/12/2018");
				System.out.println(parseDate);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		
	}
}
