package tp2.ejercicio4;

import java.util.*;
import tp2.ejercicio2.*;
public class Test {

	public static void main(String[] args) {
		BinaryTree<Integer> a = new BinaryTree<>(10);
		a.addLeftChild(new BinaryTree<>(2));
		a.addRightChild(new BinaryTree<>(3));
	    a.getLeftChild().addLeftChild(new BinaryTree<>(5));
	    a.getLeftChild().addRightChild(new BinaryTree<>(4));
	    a.getLeftChild().getLeftChild().addLeftChild(new BinaryTree<>(7));
	    a.getLeftChild().getLeftChild().addRightChild(new BinaryTree<>(8));
	    a.getLeftChild().getRightChild().addLeftChild(new BinaryTree<>(5));
	    a.getLeftChild().getRightChild().addRightChild(new BinaryTree<>(6));
	    a.getRightChild().addLeftChild(new BinaryTree<>(9));
	    a.getRightChild().addRightChild(new BinaryTree<>(8));
	    a.getRightChild().getLeftChild().addLeftChild(new BinaryTree<>(12));
	    a.getRightChild().getLeftChild().addRightChild(new BinaryTree<>(8));
	    a.getRightChild().getRightChild().addLeftChild(new BinaryTree<>(2));
	    a.getRightChild().getRightChild().addRightChild(new BinaryTree<>(1));
	    
	    RedBinariaLlena ra =new RedBinariaLlena(a);
	    System.out.println(ra.retardoReenvio());
        

	    

		

	}

}
