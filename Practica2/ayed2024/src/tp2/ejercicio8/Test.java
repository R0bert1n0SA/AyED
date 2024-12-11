package tp2.ejercicio8;

import java.util.*;
import tp2.ejercicio2.*;


public class Test {

	public static void main(String[] args) {
		BinaryTree<Integer> a = new BinaryTree<>(65);
		a.addLeftChild(new BinaryTree<>(37));
		a.addRightChild(new BinaryTree<>(81));
		a.getLeftChild().addRightChild(new BinaryTree<>(47));
	    a.getRightChild().addRightChild(new BinaryTree<>(93));
	    
	    BinaryTree<Integer> a2 = new BinaryTree<>(65);
		a2.addLeftChild(new BinaryTree<>(37));
		a2.addRightChild(new BinaryTree<>(81));
		
		a2.getLeftChild().addRightChild(new BinaryTree<>(47));
		a2.getLeftChild().addLeftChild(new BinaryTree<>(22));
	    a2.getLeftChild().getLeftChild().addLeftChild(new BinaryTree<>(11));
	    a2.getLeftChild().getLeftChild().addRightChild(new BinaryTree<>(29));
		
		a2.getRightChild().addLeftChild(new BinaryTree<>(76));
	    a2.getRightChild().addRightChild(new BinaryTree<>(93));
	    a2.getRightChild().getRightChild().addLeftChild(new BinaryTree<>(85));
	    a2.getRightChild().getRightChild().addRightChild(new BinaryTree<>(94));
	    ParcialArboles t=new ParcialArboles(a);
	    System.out.println(t.esPrefijo(a, a2));

		

	}

}
