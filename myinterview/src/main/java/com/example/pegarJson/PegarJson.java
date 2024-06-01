package com.example.pegarJson;

import java.util.ArrayList;
import java.util.List;

import com.example.clientHttp.ClienteHttp;
import com.example.entities.Employee;
import com.example.pegarJson.exceptions.PegarJsonExceptions;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class PegarJson {

	public List<Employee> pegarEmployees(String url) {

		try {
			String json = ClienteHttp.pegarJsonDaUrl(url);

			ObjectMapper objectMapper = new ObjectMapper();
			List<Employee> employees = objectMapper.readValue(json, new TypeReference<List<Employee>>() {
			});
			return new ArrayList<Employee>(employees);

		} catch (JsonProcessingException e) {
			e.printStackTrace();
			throw new PegarJsonExceptions("Erro ao extrair o conteúdo");
		}
	}
}
