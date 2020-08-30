package com.github.enrollee.demo.dao;

import java.util.List;

import com.github.enrollee.demo.models.Enrollee;

public interface EnrolleeDao {
	
	public List<Enrollee> getEnrollees();
	
	public void addEnrollee(Enrollee e);
	
	public void updateEnrollee(int id, Enrollee e);

}
