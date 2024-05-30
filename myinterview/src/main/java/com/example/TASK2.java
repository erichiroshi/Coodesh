package com.example;

/**
 * Task here is to write a list. Each element must know the element before and
 * after it. Print out your list and them remove the element in the middle of
 * the list. Print out again.
 *
 */

public class TASK2 {

	public static void main(String[] args) {
		ListaEncadeada list = new ListaEncadeada();

		// Adiciona elementos na lista
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);

		// Imprimi a lista
		System.out.println("Lista inicial:");
		list.imprimirLista();

		// Remove o elemento no meio da lista
		list.removeMiddle();

		// Imprimi a lista novamente
		System.out.println("Lista após remover o elemento do meio:");
		list.imprimirLista();

	}
}

/**
 * Classe que repesenta cada nó da fila
 */
class No {

	int valor;
	No anterior;
	No proximo;

	public No(int valor) {
		this.valor = valor;
		this.anterior = null;
		this.proximo = null;
	}
}

/**
 * Classe que representa a fila de nó
 */
class ListaEncadeada {
	No primeiro;
	No ultimo;
	int tamanho;

	public ListaEncadeada() {
		this.primeiro = null;
		this.ultimo = null;
		this.tamanho = 0;
	}

	/**
	 * Método para aticionar nó na fila
	 * 
	 * @param valor Inteiro que representa um valor na fila
	 */
	public void add(int valor) {
		No novoNo = new No(valor);
		if (tamanho == 0) {
			primeiro = ultimo = novoNo;
		} else {
			ultimo.proximo = novoNo;
			novoNo.anterior = ultimo;
			ultimo = novoNo;
		}
		tamanho++;
	}

	/**
	 * Médoto para remover o nó do meio da fila
	 */
	public void removeMiddle() {
		if (tamanho == 0) {
			return;
		}

		int middleIndex = tamanho / 2;
		No noAtual = primeiro;

		for (int i = 0; i < middleIndex; i++) {
			noAtual = noAtual.proximo;
		}

		// Remover o nó do meio
		if (noAtual.anterior != null) {
			noAtual.anterior.proximo = noAtual.proximo;
		} else {
			primeiro = noAtual.proximo;
		}

		if (noAtual.proximo != null) {
			noAtual.proximo.anterior = noAtual.anterior;
		} else {
			ultimo = noAtual.anterior;
		}

		tamanho--;
	}

	/**
	 * Método que imprime cada nó e o valor anterior e o próximo e imprime também a
	 * fila linear
	 */
	public void imprimirLista() {
		No noAtual = primeiro;

		while (noAtual != null) {
			if (noAtual.anterior == null) {
				System.out.print("null");
				System.out.println("   " + noAtual.valor + "   " + noAtual.proximo.valor);
			} else if (noAtual.proximo == null) {
				System.out.print(noAtual.anterior.valor + "   " + noAtual.valor + "   ");
				System.out.println("null");
			} else {
				System.out.print(noAtual.anterior.valor);
				System.out.print("   " + noAtual.valor + "   ");
				System.out.println(noAtual.proximo.valor);
			}
			noAtual = noAtual.proximo;
		}
		System.out.println();

		noAtual = primeiro;

		System.out.println("Lista na sequência:");
		while (noAtual != null) {
			System.out.print(noAtual.valor + " ");
			noAtual = noAtual.proximo;
		}
		System.out.println();
		System.out.println();
	}
}