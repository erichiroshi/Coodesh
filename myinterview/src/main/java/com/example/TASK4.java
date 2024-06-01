package com.example;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.example.entities.Employee;
import com.example.pegarJson.PegarJson;
import com.example.utils.LerProperties;
import com.example.utils.SalvarArquivo;
import com.example.utils.UploadToS3;

/**
 * Create an implementation of a Rest API client. Prints out how many records
 * exists for each gender and save this file to s3 bucket API endpoint=>
 * https://3ospphrepc.execute-api.us-west-2.amazonaws.com/prod/RDSLambda AWS s3
 * bucket => interview-digiage
 *
 */

public class TASK4 {
	public static void main(String[] args) throws IOException {

		final String url = LerProperties.lerPropriedade("url");

		List<Employee> employees = listEmployee(url);

		Map<Character, Integer> genderCount = genderCount(employees);

		imprimeQntPorGenero(genderCount);

		File file = SalvarArquivo.salvarArquivo(genderCount);

		UploadToS3.uploadToS3(file, "gender_count.txt");

	}

	private static List<Employee> listEmployee(final String url) {
		PegarJson pegarJson = new PegarJson();
		List<Employee> employees = pegarJson.pegarEmployees(url);
		return employees;
	}

	private static Map<Character, Integer> genderCount(List<Employee> employees) {
		int countM = 0;
		int countF = 0;

		for (Employee employee : employees) {
			if (employee.getGender() == 'M') {
				countM++;
			}
			if (employee.getGender() == 'F') {
				countF++;
			}
		}

		Map<Character, Integer> genderCount = new HashMap<Character, Integer>();
		genderCount.put('M', countM);
		genderCount.put('F', countF);
		return genderCount;
	}

	private static void imprimeQntPorGenero(Map<Character, Integer> genderCount) {

		for (Character c : genderCount.keySet()) {
			System.out.println("Número de funcionários do gênero " + c + ": " + genderCount.get(c));
		}

	}
}
