package com.example.task5.controllers;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.task5.entities.Employee;
import com.example.task5.services.EmployeeService;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

	@Autowired
	private EmployeeService service;

	@GetMapping
	public List<Employee> findAll() {
		return service.findAll();
	}

	@GetMapping("/countEmployeesByGender")
	public List<Map<Character, Long>> countEmployeesByGender() {
		return service.countEmployeesByGender();
	}

	@GetMapping("/getBirthYearStatisticsByGender")
	public List<Map<String, Long>> getBirthYearStatisticsByGender() {
		return service.getBirthYearStatisticsByGender();
	}

	@GetMapping("/getStatisticsByGender")
	public List<Map<String, BigDecimal>> getStatisticsByGender() {
		return service.getStatisticsByGender();
	}

}
