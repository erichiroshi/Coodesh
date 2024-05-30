package com.example;

import java.util.Scanner;

/**
 * 
 *
 * Task here is to implement a function that says if a given string is
 * palindrome.
 * 
 * 
 * 
 * Definition=> A palindrome is a word, phrase, number, or other sequence of
 * characters which reads the same backward as forward, such as madam or
 * racecar.
 */
public class TASK1 {

	/**
	 * 
	 * Função que verifica se uma String é ou não palídromo
	 * 
	 * @param s String para verificação
	 * @return true se for palíndromo
	 */
	public static boolean isPalindrome(String s) {

		// Remove os espaços e converte tudo para maiúsculos
		s = s.replaceAll("\\s+", "").toUpperCase();

		// Início das comparações da string
		int esquerda = 0;
		int direita = s.length() - 1;

		// Vai comparando até chegar no meio da string
		while (esquerda < direita) {
			if (s.charAt(esquerda) != s.charAt(direita)) {
				return false;
			}
			esquerda++;
			direita--;
		}
		return true;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// Lê a string
		String palavra = sc.nextLine();

		// verifica se é palíndromo
		if (isPalindrome(palavra)) {
			System.out.println("É Palíndromo");
		} else {
			System.out.println("Não é Palíndromo");
		}

		sc.close();
	}
}