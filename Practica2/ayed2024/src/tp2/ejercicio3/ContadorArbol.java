package tp2.ejercicio3;

import tp2.ejercicio2.BinaryTree;

import java.util.*;

public class ContadorArbol {
	private BinaryTree<Integer> arbol;
	
	public ContadorArbol(BinaryTree a ) {
		this.arbol=a;
	}
	
	public  ArrayList<Integer> obtenerNumerosPares() {
	    ArrayList<Integer> numerosPares = new ArrayList<>();
	    InOrden(numerosPares,this.arbol);
	    //PosOrder(numerosPares,this.arbol);
	    return numerosPares;
	}
	
	public void InOrden(ArrayList numerosPares,BinaryTree<Integer> arbol) {
		if(arbol.hasLeftChild()) {
			InOrden(numerosPares,arbol.getLeftChild());
		}
		System.out.println(arbol.getData());
		if(arbol.getData() % 2 == 0) {
			numerosPares.add(arbol.getData());
		}
		if(arbol.hasRightChild()) {
			InOrden(numerosPares,arbol.getRightChild());
		} 
	}
	public void PosOrder(ArrayList numerosPares,BinaryTree <Integer> arbol) {
		if(arbol.hasLeftChild()) {
			InOrden(numerosPares,arbol.getLeftChild());
		}
		if(arbol.hasRightChild()) {
			InOrden(numerosPares,arbol.getRightChild());
		}
		if(arbol.getData() % 2 == 0) {
			numerosPares.add(arbol.getData());
		}
	}

}
