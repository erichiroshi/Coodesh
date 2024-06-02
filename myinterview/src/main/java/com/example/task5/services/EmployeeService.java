package com.example.task5.services;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.task5.entities.Employee;
import com.example.task5.repositories.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;

	public List<Employee> findAll() {
		return employeeRepository.findAll();
	}

	public List<Map<Character, Long>> countEmployeesByGender() {
		return employeeRepository.countEmployeesByGender();
	}

	public List<Map<String, Long>> getBirthYearStatisticsByGender() {
		return employeeRepository.getBirthYearStatisticsByGender();

	}

	public List<Map<String, BigDecimal>> getStatisticsByGender() {
		return employeeRepository.getStatisticsByGender();

	}

	public Employee save(Employee e) {
		return employeeRepository.save(e);
	}

	public void deleteById(Long id) {
		employeeRepository.deleteById(id);
	}
}
