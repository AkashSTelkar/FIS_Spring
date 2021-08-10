package com.fis.springlearn;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;


@SpringBootApplication
public class SpringLearnApplication {

	private static final Logger LOGGER = LoggerFactory.getLogger(SpringLearnApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(SpringLearnApplication.class, args);
		System.out.println("Hello Akash Telkar \nHow are you??");
		
		displayDate();
		
		displayCountry();
	}
	static void displayCountry(){
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
		Country country = (Country) context.getBean("country", Country.class);
		LOGGER.debug("Country : {}", country.toString());
	}
	
	static void displayDate() {
		LOGGER.info("START");
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("date-format.xml");
		SimpleDateFormat format = context.getBean("dateFormat", SimpleDateFormat.class);
		try {
			Date parseDate = format.parse("31/12/2018");
//			System.out.println(parseDate);
			LOGGER.debug(parseDate.toString());
		} catch (ParseException e) {
			e.printStackTrace();
		}

		SimpleDateFormat format1 = context.getBean("dateFormat1", SimpleDateFormat.class);
		try {
			Date parseDate1 = format1.parse("08/09/2021");
//			System.out.println(parseDate1);
			LOGGER.debug(parseDate1.toString());
		} catch (ParseException e) {
			e.printStackTrace();
		}
		LOGGER.info("END");
	}
}
