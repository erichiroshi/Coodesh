package com.example.task5.repositories;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.task5.entities.Employee2;

public interface Employee2Repository extends JpaRepository<Employee2, Long> {

	@Query("SELECT e.gender as gender, COUNT(*) as total FROM Employee2 e GROUP BY e.gender")
	List<Map<Character, Long>> countEmployeesByGender();
	
	 @Query("SELECT e.gender as gender, " +
	            "COUNT(*) as quantity, " +
	            "YEAR(e.birthDate) as birthYear " +
	            "FROM Employee2 e " +
	            "GROUP BY e.gender, YEAR(e.birthDate)")
    List<Map<String, Long>> getBirthYearStatisticsByGender();

	 @Query("SELECT e.gender as gender, " +
	            "ROUND(AVG(e.salary), 2) as avgSalary, " +
	            "ROUND(MIN(e.salary), 2) as minSalary, " +
	            "ROUND(MAX(e.salary), 2) as maxSalary " +
	            "FROM Employee2 e " +
	            "GROUP BY e.gender")
    List<Map<String, BigDecimal>> getStatisticsByGender();
}
