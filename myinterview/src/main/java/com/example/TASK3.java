package com.example;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Set;

/**
 * Write a list and add an aleatory number of Strings. In the end, print out how
 * many distinct itens exists on the list.
 *
 */
public class TASK3 {

	public static void main(String[] args) {

		// lista para armazenar as strings geradas
		List<String> stringList = new ArrayList<String>();

		// gera um número aleatório, para o tamanho da lista
		Random random = new Random();
		int numberOfStrings = random.nextInt(20) + 1; // de 1 - 20 strings

		for (int i = 0; i < numberOfStrings; i++) {
			// gerando strings aleatórias, no formato: "random0 - random9"
			String str = "random" + random.nextInt(10);
			stringList.add(str);
		}

		// imprime lista completa
		System.out.println("Lista de strings: " + stringList);

		// conjunto (Set) para Strings distintas
		Set<String> distinctItems = new HashSet<String>();

		// Iterator para percorrer a lista e adicionar no conjunto
		Iterator<String> iterator = stringList.iterator();
		while (iterator.hasNext()) {
			String item = iterator.next();
			distinctItems.add(item);
		}

		// Imprime a quantidade de itens distintos
		System.out.println("Número de itens distintos: " + distinctItems.size());
	}

}
