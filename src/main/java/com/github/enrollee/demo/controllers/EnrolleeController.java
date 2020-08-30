package com.github.enrollee.demo.controllers;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.NonNull;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.github.enrollee.demo.models.Enrollee;
import com.github.enrollee.demo.models.SuccessResponseMessage;
import com.github.enrollee.demo.services.EnrolleeService;

@RestController
@Validated
public class EnrolleeController {

	private Logger logger = LoggerFactory.getLogger(EnrolleeController.class);

	@Autowired
	private EnrolleeService enrolleeService;

	/**
	 * @param enrollee
	 * @return
	 */
	@PostMapping("/api/enrollee")
	public SuccessResponseMessage addEnrollee(@NonNull @Validated @RequestBody Enrollee enrollee) {
		logger.info("Extracting all enrollees");
		enrolleeService.addEnrollee(enrollee);
		return new SuccessResponseMessage("Enrollee is successfully added");
	}
	
	/**
	 * @return
	 */
	@GetMapping("/api/enrollee")
	public List<Enrollee> getEnrollees() {
		logger.info("Extracting all enrollees");
		return enrolleeService.getEnrollees();
	}
	
	/**
	 * @param id
	 * @param enrollee
	 * @return
	 */
	@PutMapping("/api/enrollee/{id}")
	public SuccessResponseMessage updateEnrollee(@PathVariable("id") Integer id, @RequestBody Enrollee enrollee) {
		logger.info("Updating an existing enrollee");
		enrolleeService.updateEnrollee(id, enrollee);
		return new SuccessResponseMessage("Enrollee is successfully updated");
	}
}
