package com.example.task5.services;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.task5.entities.Employee2;
import com.example.task5.repositories.Employee2Repository;

@Service
public class Employee2Service {

	@Autowired
	private Employee2Repository employee2Repository;

	public List<Employee2> findAll() {
		return employee2Repository.findAll();
	}

	public List<Map<Character, Long>> countEmployeesByGender() {
		return employee2Repository.countEmployeesByGender();
	}

	public List<Map<String, Long>> getBirthYearStatisticsByGender() {
		return employee2Repository.getBirthYearStatisticsByGender();

	}

	public List<Map<String, BigDecimal>> getStatisticsByGender() {
		return employee2Repository.getStatisticsByGender();

	}
}
