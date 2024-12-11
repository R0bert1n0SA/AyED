package tp2.ejercicio2;

import tp.ejercicio8.Queue;

public class BinaryTree <T> {
	
	private T data;
	private BinaryTree<T> leftChild;   
	private BinaryTree<T> rightChild; 

	
	public BinaryTree() {
		super();
	}

	public BinaryTree(T data) {
		this.data = data;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
	/**
	 * Preguntar antes de invocar si hasLeftChild()
	 * @return
	 */
	public BinaryTree<T> getLeftChild() {
		return leftChild;
	}
	/**
	 * Preguntar antes de invocar si hasRightChild()
	 * @return
	 */
	public BinaryTree<T> getRightChild() {
		return this.rightChild;
	}

	public void addLeftChild(BinaryTree<T> child) {
		this.leftChild = child;
	}

	public void addRightChild(BinaryTree<T> child) {
		this.rightChild = child;
	}

	public void removeLeftChild() {
		this.leftChild = null;
	}

	public void removeRightChild() {
		this.rightChild = null;
	}

	public boolean isEmpty(){
		return (this.isLeaf() && this.getData() == null);
	}

	public boolean isLeaf() {
		return (!this.hasLeftChild() && !this.hasRightChild());

	}
		
	public boolean hasLeftChild() {
		return this.leftChild!=null;
	}

	public boolean hasRightChild() {
		return this.rightChild!=null;
	}
	@Override
	public String toString() {
		return this.getData().toString();
	}

	public  int contarHojas() {
	    if (this.isLeaf()) {
	    	return 1;	
	    }else {	    	
	    	int hojas=0;
	    	if(this.hasLeftChild()){
	    		hojas+=this.getLeftChild().contarHojas();
	    	}
	             
	    	if(this.hasRightChild()) {
	    		hojas+=this.getRightChild().contarHojas();
	    	}
	    	return hojas;
	    }	
	}
		
		
    	 
    public BinaryTree<T> espejo(){
       BinaryTree<T> espejoA=new BinaryTree<>(this.getData());
       if(this.hasLeftChild()) {
    	   espejoA.addRightChild(this.getLeftChild().espejo());
       }

       if(this.hasRightChild()) {
    	   espejoA.addLeftChild(this.getRightChild().espejo());
       }  
       return espejoA;
    }

	// 0<=n<=m
	public void entreNiveles(int n, int m){
		BinaryTree<T> dato;
		Queue<BinaryTree<T>> cola = new Queue<BinaryTree<T>>();
		cola.enqueue(this);
		cola.enqueue(null);
		int nivel = 0;
		while ((!cola.isEmpty()) && (nivel <= m)) {
			dato = cola.dequeue();
			if (dato != null){
				if (nivel >= n)
					System.out.println(dato.getData());
				if (dato.hasLeftChild()) {
					cola.enqueue(dato.getLeftChild());
				}	
				if (dato.hasRightChild())
					cola.enqueue(dato.getRightChild());
			} else if (!cola.isEmpty()) {
				cola.enqueue(null);
				nivel++;	
			}
		}
	 	
	}
	
	 public void PreOrden(BinaryTree<T> a) {
		 if (a == null) {
		     return;
		 }
		 System.out.println(a.getData());
		 if(this.hasLeftChild()) {
			 PreOrden(a.getLeftChild());
		 }
		 if(this.hasRightChild()) {
			 PreOrden(a.getRightChild());
		 }
	 }
		
}

