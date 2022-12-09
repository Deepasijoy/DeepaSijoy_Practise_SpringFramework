package com.greatlearning.driver;

import com.greatlearning.service.Teacher;
import com.greatlearning.serviceimpl.MathsTeacher;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Teacher teacher=new MathsTeacher();
System.out.println(teacher.getHomework());
	}

}
//its is easily changeable
//but can't be configured..each time we need to 
//change that particular class object
//Inversion of control and spring framework helps