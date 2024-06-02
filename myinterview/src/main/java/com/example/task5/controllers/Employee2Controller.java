package com.example.task5.controllers;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.task5.entities.Employee2;
import com.example.task5.services.Employee2Service;

@RestController
@RequestMapping("/employees2")
public class Employee2Controller {

	@Autowired
	private Employee2Service employee2Service;

	@GetMapping
	public List<Employee2> findAll() {
		return employee2Service.findAll();
	}

	@GetMapping("/countEmployeesByGender")
	public List<Map<Character, Long>> countEmployeesByGender() {
		return employee2Service.countEmployeesByGender();
	}

	@GetMapping("/getBirthYearStatisticsByGender")
	public List<Map<String, Long>> getBirthYearStatisticsByGender() {
		return employee2Service.getBirthYearStatisticsByGender();
	}

	@GetMapping("/getStatisticsByGender")
	public List<Map<String, BigDecimal>> getStatisticsByGender() {
		return employee2Service.getStatisticsByGender();
	}

}
