package com.greatlearning.driver;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.greatlearning.service.Teacher;
import com.greatlearning.serviceimpl.HindiTeacher;

public class SpringDriver {

	public static void main(String[] args) {
		// 1.load spring configuartion

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		// 2.retrieve bean from the spring container
		Teacher teacher = context.getBean("hindiTeacher", HindiTeacher.class);// bean id,class name with.class extension

		// 3. call methods on bean
		System.out.println(teacher.getHomework());

		// 4.close the container

		context.close();

	}

}
