package com.greatlearning.serviceimpl;

import com.greatlearning.service.Teacher;

public class MathsTeacher implements Teacher {

	@Override
	public String getHomework() {
		
		return "Practice maths problems";
	}

}
