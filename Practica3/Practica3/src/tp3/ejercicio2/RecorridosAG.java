package tp3.ejercicio2;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import tp3.ejercicio1.GeneralTree;

public class RecorridosAG {

	public List<Integer> numerosImparesMayoresQuePreOrden (GeneralTree <Integer> a,Integer n){
		 List <Integer> valores=new LinkedList<Integer>();
		 preOrder(a,valores,n);
		 return valores;

	}
	
	public List<Integer> numerosImparesMayoresQuePostOrden (GeneralTree <Integer> a,Integer n){
		 List <Integer> valores=new LinkedList<Integer>();
		 posOrder(a,valores,n);
		 return valores;

	}
	
	
	public List<Integer> numerosImparesMayoresQueInOrden (GeneralTree <Integer> a,Integer n){
		 List <Integer> valores=new ArrayList<Integer>();
		 inOrder(a,valores,n);
		 return valores;

	}
	public List<Integer> numerosImparesMayoresQuePorNiveles (GeneralTree <Integer> a,Integer n){
		 List <Integer> valores=new LinkedList<Integer>();
		 niveles(a,valores,n);
		 return valores;

	}
	
	
	
	
	
	
	
	
	private void preOrder(GeneralTree <Integer> a,List <Integer> l,int n) {
		 if((a.getData() > n)&& (a.getData() %2 != 0)) {
			 l.add(a.getData());
		 }
		 List<GeneralTree<Integer>> children = a.getChildren();
		 for (GeneralTree<Integer> child: children) {
			 preOrder(child,l,n);
		 }
	}
	
	
	private void inOrder(GeneralTree <Integer> a,List <Integer> l,int n) {
		 List<GeneralTree<Integer>> children = a.getChildren();				 
		 if(a.hasChildren()) {
			 inOrder(children.get(0),l,n);
		 }
		 if(a.getData() > n && a.getData() %2 != 0) {
			 l.add(a.getData());
		 }
		 for (int i =1; i <children.size();i++) {	 
			 inOrder(children.get(i),l,n);
		 }

	}
	

	private void posOrder(GeneralTree <Integer> a,List <Integer> l,int n) {
		 List<GeneralTree<Integer>> children = a.getChildren();
		 if(a.hasChildren()) {		
			for (GeneralTree<Integer> child: children) {
			     posOrder(child,l,n);
			}
		 }	                
		 if(a.getData() > n && a.getData() %2 != 0) {
                	l.add(a.getData());
         }		 
	}
	
	private void niveles(GeneralTree <Integer> a,List <Integer> l,int n) {
		 Queue<GeneralTree<Integer>> cola= new Queue<>();
		 cola.enqueue(a);
		 cola.enqueue(null);
		 while(!cola.isEmpty()) { 
			 GeneralTree<Integer> dato= cola.dequeue();
			 if(dato != null) {
				 if((dato.getData() > n)&& (dato.getData() %2 != 0)) {
					 l.add(dato.getData());			 
				 }
				 List<GeneralTree<Integer>> children = dato.getChildren();
				 for(GeneralTree<Integer> sons: children) {
					 cola.enqueue(sons);
				 }
			 }				 

		 }
	}


}
