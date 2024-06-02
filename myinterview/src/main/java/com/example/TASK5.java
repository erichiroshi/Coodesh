package com.example;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.task5.entities.Employee;
import com.example.task5.repositories.EmployeeRepository;

/**
 * Create an implementation of a Rest API . Expose an API. Feel free to explore
 * possibilities/functionalities/capabilities following Rest standard. We
 * suggest that your implementation have at least a CRUD scenario.
 *
 */
@SpringBootApplication
public class TASK5 implements CommandLineRunner {

	@Autowired
	private EmployeeRepository employeeRepository;

	public static void main(String[] args) {
		SpringApplication.run(TASK5.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		List<Employee> employees = Arrays.asList(
//				new Employee("John", "Doe", 'M', LocalDate.of(1980, 1, 15), new BigDecimal("75000.00"),
//						LocalDate.of(2010, 6, 1)),
//				new Employee("Jane", "Smith", 'F', LocalDate.of(1985, 3, 22), new BigDecimal("80000.00"),
//						LocalDate.of(2011, 7, 15)),
//				new Employee("Michael", "Brown", 'M', LocalDate.of(1978, 7, 10), new BigDecimal("90000.00"),
//						LocalDate.of(2009, 9, 20)),
//				new Employee("Emily", "Davis", 'F', LocalDate.of(1990, 12, 5), new BigDecimal("85000.00"),
//						LocalDate.of(2012, 10, 1)),
//				new Employee("David", "Wilson", 'M', LocalDate.of(1983, 4, 18), new BigDecimal("95000.00"),
//						LocalDate.of(2008, 3, 15)),
//				new Employee("Sophia", "Miller", 'F', LocalDate.of(1992, 6, 30), new BigDecimal("72000.00"),
//						LocalDate.of(2013, 5, 20)),
//				new Employee("James", "Taylor", 'M', LocalDate.of(1986, 8, 25), new BigDecimal("78000.00"),
//						LocalDate.of(2014, 11, 10)),
//				new Employee("Olivia", "Anderson", 'F', LocalDate.of(1989, 2, 14), new BigDecimal("85000.00"),
//						LocalDate.of(2015, 1, 5)),
//				new Employee("Robert", "Thomas", 'M', LocalDate.of(1977, 9, 1), new BigDecimal("93000.00"),
//						LocalDate.of(2016, 7, 25)),
//				new Employee("Ava", "Jackson", 'F', LocalDate.of(1991, 11, 12), new BigDecimal("71000.00"),
//						LocalDate.of(2017, 4, 18)),
//				new Employee("William", "White", 'M', LocalDate.of(1984, 3, 4), new BigDecimal("88000.00"),
//						LocalDate.of(2007, 8, 30)),
//				new Employee("Isabella", "Harris", 'F', LocalDate.of(1993, 7, 20), new BigDecimal("80000.00"),
//						LocalDate.of(2018, 3, 11)),
//				new Employee("Benjamin", "Martin", 'M', LocalDate.of(1979, 10, 10), new BigDecimal("97000.00"),
//						LocalDate.of(2019, 6, 25)),
//				new Employee("Mia", "Thompson", 'F', LocalDate.of(1994, 12, 15), new BigDecimal("72000.00"),
//						LocalDate.of(2020, 2, 29)),
//				new Employee("Alexander", "Garcia", 'M', LocalDate.of(1982, 5, 21), new BigDecimal("94000.00"),
//						LocalDate.of(2021, 9, 10)),
//				new Employee("Charlotte", "Martinez", 'F', LocalDate.of(1987, 8, 8), new BigDecimal("78000.00"),
//						LocalDate.of(2014, 10, 22)),
//				new Employee("Ethan", "Robinson", 'M', LocalDate.of(1981, 1, 19), new BigDecimal("91000.00"),
//						LocalDate.of(2006, 12, 5)),
//				new Employee("Amelia", "Clark", 'F', LocalDate.of(1990, 6, 25), new BigDecimal("74000.00"),
//						LocalDate.of(2015, 5, 15)),
//				new Employee("Daniel", "Rodriguez", 'M', LocalDate.of(1976, 11, 30), new BigDecimal("86000.00"),
//						LocalDate.of(2012, 11, 12)),
//				new Employee("Ella", "Lewis", 'F', LocalDate.of(1991, 9, 4), new BigDecimal("81000.00"),
//						LocalDate.of(2016, 8, 16)),
//				new Employee("Matthew", "Lee", 'M', LocalDate.of(1985, 2, 17), new BigDecimal("92000.00"),
//						LocalDate.of(2017, 2, 13)),
//				new Employee("Harper", "Walker", 'F', LocalDate.of(1992, 4, 26), new BigDecimal("76000.00"),
//						LocalDate.of(2018, 6, 30)),
//				new Employee("Joseph", "Hall", 'M', LocalDate.of(1978, 7, 8), new BigDecimal("85000.00"),
//						LocalDate.of(2019, 1, 25)),
//				new Employee("Evelyn", "Allen", 'F', LocalDate.of(1989, 12, 21), new BigDecimal("74000.00"),
//						LocalDate.of(2020, 4, 14)),
//				new Employee("Samuel", "Young", 'M', LocalDate.of(1983, 6, 29), new BigDecimal("90000.00"),
//						LocalDate.of(2021, 7, 5)),
//				new Employee("Grace", "King", 'F', LocalDate.of(1993, 3, 3), new BigDecimal("73000.00"),
//						LocalDate.of(2015, 9, 9)),
//				new Employee("Logan", "Wright", 'M', LocalDate.of(1986, 10, 15), new BigDecimal("88000.00"),
//						LocalDate.of(2014, 11, 29)),
//				new Employee("Abigail", "Scott", 'F', LocalDate.of(1994, 1, 13), new BigDecimal("77000.00"),
//						LocalDate.of(2016, 12, 20)),
//				new Employee("David", "Green", 'M', LocalDate.of(1981, 5, 8), new BigDecimal("91000.00"),
//						LocalDate.of(2013, 10, 13)),
//				new Employee("Sofia", "Adams", 'F', LocalDate.of(1990, 10, 23), new BigDecimal("72000.00"),
//						LocalDate.of(2019, 12, 17)),
//				new Employee("Liam", "Baker", 'M', LocalDate.of(1977, 4, 30), new BigDecimal("93000.00"),
//						LocalDate.of(2020, 8, 20)),
//				new Employee("Avery", "Gonzalez", 'F', LocalDate.of(1991, 8, 2), new BigDecimal("81000.00"),
//						LocalDate.of(2018, 7, 22)),
//				new Employee("Noah", "Nelson", 'M', LocalDate.of(1984, 11, 11), new BigDecimal("87000.00"),
//						LocalDate.of(2021, 6, 14)),
//				new Employee("Hannah", "Carter", 'F', LocalDate.of(1992, 1, 29), new BigDecimal("73000.00"),
//						LocalDate.of(2022, 2, 25)),
//				new Employee("Lucas", "Mitchell", 'M', LocalDate.of(1980, 3, 5), new BigDecimal("96000.00"),
//						LocalDate.of(2021, 11, 8)));
//
//		employeeRepository.saveAll(employees);

	}
}
