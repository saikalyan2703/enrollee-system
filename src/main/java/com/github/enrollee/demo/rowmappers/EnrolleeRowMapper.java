package com.github.enrollee.demo.rowmappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.github.enrollee.demo.models.Enrollee;

public class EnrolleeRowMapper implements RowMapper<Enrollee> {

	@Override
	public Enrollee mapRow(ResultSet rs, int rowNum) throws SQLException {
		final Integer id = rs.getInt("id");
		final String name = rs.getString("name");
		final Integer age = rs.getInt("age");
		return new Enrollee(id, name, age);
	}

}
