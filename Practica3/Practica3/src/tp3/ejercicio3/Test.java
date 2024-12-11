package tp3.ejercicio3;
import tp3.ejercicio1.*; 

import java.util.*;

public class Test {

	public static void main(String[] args) {
		
		//RamaIzquierda
		List<GeneralTree<Integer>> childrenI = new LinkedList<>();
	    childrenI.add(new GeneralTree<Integer>(4));
	    childrenI.add(new GeneralTree<Integer>(7));
	    childrenI.add(new GeneralTree<Integer>(5));
	    GeneralTree<Integer> ArbolI =new GeneralTree<Integer>(14,childrenI);
		
	    //Rama Central
	    List<GeneralTree<Integer>> childrenC = new LinkedList<>();
	    childrenC.add(new GeneralTree<Integer>(6));
	    childrenC.add(new GeneralTree<Integer>(10));
	    childrenC.add(new GeneralTree<Integer>(18));
	    GeneralTree<Integer> ArbolC =new GeneralTree<Integer>(25,childrenC);
	    
	    
	    //Rama Derecha
	    List<GeneralTree<Integer>> childrenD = new LinkedList<>();
	    childrenD.add(new GeneralTree<Integer>(9));
	    childrenD.add(new GeneralTree<Integer>(12));
	    childrenD.add(new GeneralTree<Integer>(19));
	    GeneralTree<Integer> ArbolD =new GeneralTree<Integer>(10,childrenD);
	    
	    
	    List<GeneralTree<Integer>> Hijos = new LinkedList<>();
	    Hijos.add(ArbolI);
	    Hijos.add(ArbolC);
	    Hijos.add(ArbolD);
	    GeneralTree<Integer> a = new GeneralTree<>(14, Hijos);
	    
	    
	    System.out.println(a.esAncestro(10, 67));
	    

	}

}
