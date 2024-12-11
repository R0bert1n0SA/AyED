package tp2.ejercicio6;

import java.util.*;
import tp2.ejercicio2.*;


public class Test {

	public static void main(String[] args) {
		BinaryTree<Integer> a = new BinaryTree<>(1);
		a.addLeftChild(new BinaryTree<>(2));
		a.addRightChild(new BinaryTree<>(3));
	    a.getLeftChild().addRightChild(new BinaryTree<>(4));
	    a.getRightChild().addLeftChild(new BinaryTree<>(5));
	    a.getRightChild().addRightChild(new BinaryTree<>(6));
	    a.getRightChild().getLeftChild().addLeftChild(new BinaryTree<>(7));
	    a.getRightChild().getLeftChild().addRightChild(new BinaryTree<>(8));
        
	    

        Transformacion t = new Transformacion(a);
        BinaryTree<Integer> an = t.suma();
        if(an.isEmpty()) {
        	System.out.println("no existe arbol");
        }else {
        	an.PreOrden(an);
        }

	    
	    

        

	    

		

	}

}
