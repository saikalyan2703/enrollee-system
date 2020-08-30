package com.github.enrollee.demo.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.github.enrollee.demo.dao.EnrolleeDao;
import com.github.enrollee.demo.models.Enrollee;
import com.github.enrollee.demo.rowmappers.EnrolleeRowMapper;

@Repository
public class EnrolleeDaoImpl implements EnrolleeDao {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public List<Enrollee> getEnrollees() {
		return jdbcTemplate.query("select id, name, age from enrollee", new EnrolleeRowMapper());
	}

	@Override
	public void addEnrollee(Enrollee e) {
		jdbcTemplate.update("insert into enrollee (name, age) values(?, ?)", e.getName(), e.getAge());
	}

	@Override
	public void updateEnrollee(int id, Enrollee e) {
		jdbcTemplate.update("update enrollee set name = ?, age = ? where id = ?", e.getName(), e.getAge(), id);
	}

}
