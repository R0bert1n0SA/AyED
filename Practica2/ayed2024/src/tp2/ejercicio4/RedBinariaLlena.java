package tp2.ejercicio4;

import java.util.ArrayList;

import tp.ejercicio8.*;

import tp2.ejercicio2.BinaryTree;


public class RedBinariaLlena {
    BinaryTree <Integer> raiz;

        public RedBinariaLlena(BinaryTree <Integer> raiz) {
            this.raiz = raiz;
        }

        public int retardoReenvio() {
        	 return Recorrer(this.raiz);
            //return recorrerProfundidadPreorden(raiz);      	  
        }

        private int recorrerProfundidadPreorden(BinaryTree <Integer> nodo) {
        	int maxI=0;  
        	int maxD=0;
            if(nodo.hasLeftChild()){
            	maxI=recorrerProfundidadPreorden(nodo.getLeftChild());
            }
            
            if(nodo.hasRightChild()){
            	maxD=recorrerProfundidadPreorden(nodo.getRightChild());
            }
            System.out.println("Nodo hoja: " + nodo.getData() );
            return (Math.max(maxI, maxD)+nodo.getData());
        }
        
        private int Recorrer(BinaryTree<Integer> n) {
        	if(n == null) {	
        		return 0;
        	}else {
        		int suma=0;
        		if(n.isLeaf()) {
        			suma+=n.getData();
        			return suma;
        		}else {	   
        			int izq=n.getLeftChild().getData();
        			int der=n.getRightChild().getData();
	        		if(izq > der) {			
	        			suma+=n.getData()+Recorrer(n.getLeftChild());
	        		}
	        	    if(der > izq) {
	        	    	suma+=n.getData()+Recorrer(n.getRightChild());
	        	    }
	        	    
        		    return suma;
        		}
        	}
        }

}
