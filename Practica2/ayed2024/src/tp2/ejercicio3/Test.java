package tp2.ejercicio3;

import tp2.ejercicio2.*;
import java.util.*;
public class Test {

	public static void main(String[] args) {
		BinaryTree<Integer> a = new BinaryTree<>(1);
		a.addLeftChild(new BinaryTree<>(2));
		a.addRightChild(new BinaryTree<>(3));
	    a.getLeftChild().addLeftChild(new BinaryTree<>(4));
	    a.getLeftChild().addRightChild(new BinaryTree<>(5));
	    a.getRightChild().addLeftChild(new BinaryTree<>(6));
        
	    ContadorArbol count= new ContadorArbol(a);
	    ArrayList<Integer> g = count.obtenerNumerosPares();
	    

		

	}

}
