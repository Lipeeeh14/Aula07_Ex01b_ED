package br.edu.fateczl.lipe.PilhaInt;

public class Pilha {

	No topo;
	
	public Pilha() {
		topo = null;
	}

	public boolean isEmpty() {
		if (topo == null) return true;
		else return false;
	}
	
	public void push(int e) {
		No elemento = new No();
		elemento.dado = e;
		
		if (isEmpty()) {
			topo = elemento;
		} else {
			elemento.proximo = topo;
			topo = elemento;
		}			
	}
	
	public int pop() throws Exception {
		if (isEmpty()) {
			throw new Exception("Não há elementos para desempilhar");
		}
		int valor = topo.dado;
		topo = topo.proximo;
		return valor;
	}
	
	public int top() throws Exception {
		if (isEmpty()) {
			throw new Exception("Não há elementos na pilha");
		}
		return topo.dado;
	}
	
	public int size() {
		int count = 0;
		
		if (!isEmpty()) {
			No auxiliar = topo;
			count = 1;
			while(auxiliar.proximo != null) {
				auxiliar = auxiliar.proximo;
				count++;
			}
		}
		return count;
	}
}
