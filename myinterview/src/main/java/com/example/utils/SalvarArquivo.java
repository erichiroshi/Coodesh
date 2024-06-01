package com.example.utils;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

import com.example.utils.exceptions.SalvarArquivoException;

public class SalvarArquivo {

	public static File salvarArquivo(Map<Character, Integer> genderCount) {
		try {
			File file = new File("genderCount");
			FileWriter writer = new FileWriter(file);

			for (Character c : genderCount.keySet()) {
				writer.write("Número de funcionários do gênero " + c + ": " + genderCount.get(c) + "\n");
			}

			writer.close();
			return file;
		} catch (IOException e) {
			throw new SalvarArquivoException("Erro ao salvar o arquivo");
		}
	}
}
