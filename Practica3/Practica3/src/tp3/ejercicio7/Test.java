package tp3.ejercicio7;
import tp3.ejercicio3.*; 

import java.util.*;

public class Test {

	public static void main(String[] args) {
		
		//RamaIzquierda
		List<GeneralTree<Integer>> childrenI = new LinkedList<>();
		List<GeneralTree<Integer>> childrenID = new LinkedList<>();
	    childrenI.add(new GeneralTree<Integer>(10));
	    
	    childrenID.add(new GeneralTree<Integer>(1));
	    GeneralTree<Integer> ArbolID =new GeneralTree<Integer>(6,childrenID);
	    
	    childrenI.add(ArbolID);
	    GeneralTree<Integer> ArbolI =new GeneralTree<Integer>(17,childrenI);
		
	    //Rama Central
	    List<GeneralTree<Integer>> childrenC = new LinkedList<>();
	    childrenC.add(new GeneralTree<Integer>(8));
	    GeneralTree<Integer> ArbolC =new GeneralTree<Integer>(9,childrenC);
	    
	    
	    //Rama Derecha
	    List<GeneralTree<Integer>> childrenD = new LinkedList<>();
	    List<GeneralTree<Integer>> childrenDI = new LinkedList<>();
	    childrenDI.add(new GeneralTree<Integer>(16));
	    childrenDI.add(new GeneralTree<Integer>(7));
	    GeneralTree<Integer> ArbolDI =new GeneralTree<Integer>(14,childrenDI);
	    childrenD.add(ArbolDI);
	    childrenD.add(new GeneralTree<Integer>(18));
	    GeneralTree<Integer> ArbolD =new GeneralTree<Integer>(15,childrenD);
	    
	    
	    List<GeneralTree<Integer>> Hijos = new LinkedList<>();
	    Hijos.add(ArbolI);
	    Hijos.add(ArbolC);
	    Hijos.add(ArbolD);
	    GeneralTree<Integer> a = new GeneralTree<>(12, Hijos);
	    
	    
	    Caminos c=new Caminos(a);
	    List<Integer> lista=c.caminoAHojaMasLejana();
        for(int dat:lista){
        	System.out.println(dat);
        }    
	    

	}

}
