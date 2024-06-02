package com.example.task5.entities;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.springframework.context.annotation.Profile;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Profile("test")
@NoArgsConstructor
@Data
@Entity
@Table(name = "Employee_Interview_Eric_Hiroshi")
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long emp_no;

	private String firstName;
	private String lastName;
	private char gender;

	private LocalDate birthDate;
	private BigDecimal salary;
	private LocalDate hireDate;

	public Employee(String firstName, String lastName, char gender, LocalDate birthDate, BigDecimal salary,
			LocalDate hireDate) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.birthDate = birthDate;
		this.salary = salary;
		this.hireDate = hireDate;
	}

}
