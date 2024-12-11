package tp2.ejercicio7;

import java.util.*;
import tp2.ejercicio2.*;


public class Test {

	public static void main(String[] args) {
		BinaryTree<Integer> a = new BinaryTree<>(2);
		a.addLeftChild(new BinaryTree<>(7));
		a.addRightChild(new BinaryTree<>(-5));

		a.getLeftChild().addLeftChild(new BinaryTree<>(23));
		a.getLeftChild().getLeftChild().addLeftChild(new BinaryTree<>(-3));
		
		
	    a.getLeftChild().addRightChild(new BinaryTree<>(6));
	    a.getLeftChild().getRightChild().addLeftChild(new BinaryTree<>(55));
	    a.getLeftChild().getRightChild().addRightChild(new BinaryTree<>(11));
	    
	  
	    a.getRightChild().addLeftChild(new BinaryTree<>(19));
	    a.getRightChild().getLeftChild().addRightChild(new BinaryTree<>(4));
	    a.getRightChild().getLeftChild().getRightChild().addLeftChild(new BinaryTree<>(18));
	    
	    
	    ParcialArboles t=new ParcialArboles(a);
	    System.out.println(t.isLeftTree(55));

		

	}

}
