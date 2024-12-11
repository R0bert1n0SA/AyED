package tp2.ejercicio5;

import tp2.ejercicio2.BinaryTree;

public class ProfundidadDeArbolBinario {
	
	BinaryTree <Integer> raiz;
	
	public ProfundidadDeArbolBinario(BinaryTree <Integer> b) {
		this.raiz=b;
	}
	
	public int sumaElementosProfundidad (int p) {
		int suma=0;
		return Recorrer(this.raiz,p,suma);

	}
	private int Recorrer(BinaryTree <Integer> a,int p, int suma) {
		if(a == null) {
			return 0;
		}
		if(p == 0) {
			suma=suma + a.getData();
		}else {
			suma=Recorrer(a.getLeftChild(),p-1,suma);
			suma=Recorrer(a.getRightChild(),p-1,suma);
		}
		return suma;
	}
	


}
