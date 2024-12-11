package tp2.ejercicio7;


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

}
