package com.github.enrollee.demo.services;

import java.util.List;

import com.github.enrollee.demo.models.Enrollee;

public interface EnrolleeService {
	
	public void addEnrollee(Enrollee e);
	
	public List<Enrollee> getEnrollees();
	
	public void updateEnrollee(int id, Enrollee e);

}
