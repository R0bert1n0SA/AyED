package tp2.ejercicio9;

import java.util.*;
import tp2.ejercicio2.*;


public class Test {
	public static void PreOrden(BinaryTree<SumDif> a) {
		if (a == null) {
			return;
		}
		System.out.println(a.getData().getSuma()+"|"+a.getData().getDif());
		if(a.hasLeftChild()) {
			PreOrden(a.getLeftChild());
		}
		if(a.hasRightChild()) {
			PreOrden(a.getRightChild());
		}
	}
	public static void main(String[] args) {

		BinaryTree<Integer> a = new BinaryTree<>(20);
		a.addLeftChild(new BinaryTree<>(5));
		a.addRightChild(new BinaryTree<>(30));
		
		a.getLeftChild().addLeftChild(new BinaryTree<>(-5));
		a.getLeftChild().addRightChild(new BinaryTree<>(10));
		a.getLeftChild().getRightChild().addLeftChild(new BinaryTree<>(1));
		
		
	
		a.getRightChild().addLeftChild(new BinaryTree<>(50));
	    a.getRightChild().addRightChild(new BinaryTree<>(-9));
	    
	    a.getRightChild().getLeftChild().addRightChild(new BinaryTree<>(4));
	    a.getRightChild().getLeftChild().getRightChild().addRightChild(new BinaryTree<>(6));
	    
	    
	    
	    
	  
	    ParcialArboles t=new ParcialArboles(a);
	    BinaryTree<SumDif> ar=t.sumAndDif(a);
	    PreOrden(ar);

		

	}

}
