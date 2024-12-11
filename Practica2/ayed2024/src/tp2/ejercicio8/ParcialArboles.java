package tp2.ejercicio8;


import tp2.ejercicio2.*;
public class ParcialArboles {
	BinaryTree<Integer> a;
	public ParcialArboles(BinaryTree<Integer> a) {
		this.a=a;
	}
	
	public boolean isLeftTree (int num) {
		 int dato=Recorrer(this.a,num);
		 if (dato==1) {
			 return true;
		 }else{
			 return false;
		 }
	}
	private int   Recorrer(BinaryTree<Integer> a,int num) {
		if(a==null) {
			return -1;
		}else {
			int dato=-1;
			if(a.getData() == num) {
				int Left=CountRamas(a.getLeftChild());
				int Right=CountRamas(a.getRightChild());
				System.out.println(Left+" "+Right);
				if(Left > Right){
					return 1;
				}
	            if(Left <= Right) {
	            	return 0;
	            }
			}else{
				
				if(a.hasLeftChild() && dato == -1) {
					dato=Recorrer(a.getLeftChild(),num);
				}
				if (a.hasRightChild()&& dato ==-1) {
					dato=Recorrer(a.getRightChild(),num);
				}	
		    }
			return dato;   
	   }
	}
	
	private int CountRamas(BinaryTree<Integer> a) {
		if(a==null) {
			return -1;
		}else {
			if(a.isLeaf()) {
				return 0;
			}else {
				int suma=0;
				if((a.hasLeftChild()) && (!a.hasRightChild())) {
					suma+=1;
					suma+=CountRamas(a.getLeftChild());
				}
				return suma;
			}
		}
	}
	
	public boolean esPrefijo(BinaryTree<Integer> a1, BinaryTree<Integer> a2) {
		if(a1.isEmpty() || a2.isEmpty()) {
			return false;
	    }else {
	    	return Recorrer(a1,a2);
	    }
	}
	
	
	
	private boolean Recorrer(BinaryTree<Integer> a1, BinaryTree<Integer> a2) {
		boolean Izq=false;
		boolean Der=false;
		if(a1.getData() != a2.getData()) {
			return false;
		}else {
			if(a1.hasLeftChild() && a2.hasLeftChild()) {
				Izq= Recorrer(a1.getLeftChild(),a2.getLeftChild());
			}
			if(a1.hasRightChild()&& a2.hasRightChild()) {
				Der= Recorrer(a1.getRightChild(),a2.getRightChild());
			}
			if(a1.isLeaf()) {
				return true;
			}
			if(Izq == Der) {
				return true;
			}else {
				return false;
			}
		}
		
	}

}
