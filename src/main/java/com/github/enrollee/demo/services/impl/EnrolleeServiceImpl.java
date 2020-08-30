package com.github.enrollee.demo.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.enrollee.demo.dao.EnrolleeDao;
import com.github.enrollee.demo.models.Enrollee;
import com.github.enrollee.demo.services.EnrolleeService;

@Service
public class EnrolleeServiceImpl implements EnrolleeService {
	
	@Autowired
	EnrolleeDao enrolleeDao;

	@Override
	public void addEnrollee(Enrollee e) {
		enrolleeDao.addEnrollee(e);
	}

	@Override
	public List<Enrollee> getEnrollees() {
		return enrolleeDao.getEnrollees();
	}

	@Override
	public void updateEnrollee(int id, Enrollee e) {
		enrolleeDao.updateEnrollee(id, e);
	}

}
