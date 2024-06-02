package com.example.task5.controllers;

import java.math.BigDecimal;
import java.net.URI;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

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

	@PostMapping
	public ResponseEntity<Employee> post(@RequestBody Employee e) {
		e = service.save(e);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(e.getEmp_no()).toUri();
		return ResponseEntity.created(uri).body(e);
	}

	@DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable Long id) {
		service.deleteById(id);
		return ResponseEntity.noContent().build();
	}

}
