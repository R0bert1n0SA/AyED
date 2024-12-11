package tp2.ejercicio6;


import tp2.ejercicio2.*;

import  java.util.*;
public class Transformacion {
	BinaryTree <Integer> a;
	
	public Transformacion(BinaryTree<Integer> a2) {
		this.a=a2;
	}
	
	public BinaryTree <Integer> suma(){
        int value= recorrer(this.a);
        if(value== 0) {
        	BinaryTree <Integer> t=new BinaryTree<>();
        	return t;
        }else {
        	return this.a;
        }
        
	}
	
	
	private int recorrer(BinaryTree <Integer > a) {
	    if (a == null) {
	        return 0;
	    }else {
		    int suma=0;
		    System.out.println("nodo: "+a.getData());
		    if(a.isLeaf()) {
				suma=a.getData();
				a.setData(0);
				return suma;
		    }else {
		    	int aux=a.getData();
				suma+=recorrer(a.getLeftChild());
			    suma+=recorrer(a.getRightChild());
			    a.setData(suma);
				System.out.println("nodo: "+a.getData());
				return suma + aux;
		    }
	    }
	} 

}
