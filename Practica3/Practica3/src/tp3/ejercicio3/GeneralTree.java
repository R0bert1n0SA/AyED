package tp3.ejercicio3;

import tp3.ejercicio1.Queue;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class GeneralTree<T>{

	private T data;
	private List<GeneralTree<T>> children = new LinkedList<GeneralTree<T>>(); 

	public GeneralTree() {
		
	}
	public GeneralTree(T data) {
		this.data = data;
	}

	public GeneralTree(T data, List<GeneralTree<T>> children) {
		this(data);
		this.children = children;
	}	
	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public List<GeneralTree<T>> getChildren() {
		return this.children;
	}
	
	public void setChildren(List<GeneralTree<T>> children) {
		if (children != null)
			this.children = children;
	}
	
	public void addChild(GeneralTree<T> child) {
		this.getChildren().add(child);
	}

	public boolean isLeaf() {
		return !this.hasChildren();
	}
	
	public boolean hasChildren() {
		return !this.children.isEmpty();
	}
	
	public boolean isEmpty() {
		return this.data == null && !this.hasChildren();
	}

	public void removeChild(GeneralTree<T> child) {
		if (this.hasChildren())
			children.remove(child);
	}
	
	public int altura() {	 
		Queue<GeneralTree<T>>cola=new Queue<>();			
		if(this.isLeaf()) {
			return 0;
		}
		cola.enqueue(this);
		cola.enqueue(null);
		int cant=0;
		GeneralTree<T> dato; 
		while(!cola.isEmpty()) {
			dato=cola.dequeue();
			if(dato != null) {
			   if(dato.hasChildren()) {
				   List<GeneralTree<T>> children = dato.getChildren();
				   for(GeneralTree<T> sons: children) {
					   cola.enqueue(sons);
				   }
				   cola.enqueue(null);
			   }
			}else {
				cant+=1;
			}
		}
		return cant;
	}
	
	
	
	public int nivel(T dato){
		Queue<GeneralTree<T>>cola=new Queue<>();			
		cola.enqueue(this);
		cola.enqueue(null);
		int nivel=0;
		GeneralTree<T> dato2; 
		while(!cola.isEmpty()) {
			dato2=cola.dequeue();
			if(dato2 != null) {			
				if(dato2.getData() == dato) {
				    return nivel;
				}
			   if(dato2.hasChildren()) {
				   List<GeneralTree<T>> children = dato2.getChildren();
				   for(GeneralTree<T> sons: children) {
					   cola.enqueue(sons);
				   }
				   cola.enqueue(null);
				   nivel+=1;
			   }
			}	
		}
		return nivel;

	  }

	public int ancho(){
		Queue<GeneralTree<T>> cola =new Queue<>();
		cola.enqueue(this);
		cola.enqueue(null);
		int  cant=0;
		int  max=-1;
		GeneralTree<T> dato;
		while(!cola.isEmpty()) {
			dato=cola.dequeue();
			if(dato != null) {
				cant+=1;
				List<GeneralTree<T>> hijos=dato.getChildren();
				for(GeneralTree<T> son: hijos) {
					cola.enqueue(son);
				}	
				cola.enqueue(null);
			}else {
				if(cant > max) {
					max=cant;
				}
				cant=0;
			}
		}
		return max;
	}
	
	
	public boolean esAncestro(T a, T b) {
         if( this.getData() == a ) {
        	 int dato=BuscarB(this,b);
        	 if(dato == 1) {
        		return true;
        	 }
        	 return false;
         }else {
        	 int datom = buscarM(this,b);
        	 if(datom == 0) {
        		 return false;
        	 }else {
        		 datom=BuscarB(this,b); 
        		 if(datom == 1) {
        			 return true;
        		 }
        		 return false;
        	 }
         }
		
	}
	
	public int  buscarM (GeneralTree<T> a, T b) {
	   	List <GeneralTree<T>> hijos= a.getChildren();
	   	for (GeneralTree<T>hijo :hijos ) {
	   		if(hijo.getData()== b) {
	   			return 1;
	   		}
	   		if(hijo.hasChildren()) {
	   			if(BuscarB(hijo,b)== 1) {
	   				return 1;
	   			}
	   		}
	   	}
		return 0;
	}
	
	
	public int BuscarB (GeneralTree<T> a, T b) {
	   	List <GeneralTree<T>> hijos= a.getChildren();
	   	for (GeneralTree<T>hijo :hijos ) {
	   		if(hijo.getData()== b) {
	   			return 1;
	   		}
	   		if(hijo.hasChildren()) {
	   			if(BuscarB(hijo,b)== 1) {
	   				return 1;
	   			}
	   		}
	   	}
		return 0;
	}
	
	
	
	
}