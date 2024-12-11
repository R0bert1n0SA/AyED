package tp3.ejercicio4;
import tp3.ejercicio1.*; 

import java.util.*;

public class Test {

	public static void main(String[] args) {
		
		//RamaIzquierda
		List<GeneralTree<AreaEmpresa>> childrenI = new LinkedList<GeneralTree<AreaEmpresa>>();
	    childrenI.add(new GeneralTree<AreaEmpresa>(new AreaEmpresa("A",4)));
	    childrenI.add(new GeneralTree<AreaEmpresa>(new AreaEmpresa("B",7)));
	    childrenI.add(new GeneralTree<AreaEmpresa>(new AreaEmpresa("C",5)));
	    GeneralTree<AreaEmpresa> ArbolI =new GeneralTree<AreaEmpresa>(new AreaEmpresa("J",14),childrenI);
		
	    //Rama Central
	    List<GeneralTree<AreaEmpresa>> childrenC = new LinkedList<GeneralTree<AreaEmpresa>>();
	    childrenC.add(new GeneralTree<AreaEmpresa>(new AreaEmpresa("D",6)));
	    childrenC.add(new GeneralTree<AreaEmpresa>(new AreaEmpresa("E",10)));
	    childrenC.add(new GeneralTree<AreaEmpresa>(new AreaEmpresa("F",18)));
	    GeneralTree<AreaEmpresa> ArbolC =new GeneralTree<AreaEmpresa>(new AreaEmpresa("K",25),childrenC);
	    
	    
	    //Rama Derecha
	    List<GeneralTree<AreaEmpresa>> childrenD = new LinkedList<GeneralTree<AreaEmpresa>>();
	    childrenD.add(new GeneralTree<AreaEmpresa>(new AreaEmpresa("G",9)));
	    childrenD.add(new GeneralTree<AreaEmpresa>(new AreaEmpresa("h",12)));
	    childrenD.add(new GeneralTree<AreaEmpresa>(new AreaEmpresa("I",19)));
	    GeneralTree<AreaEmpresa> ArbolD =new GeneralTree<AreaEmpresa>(new AreaEmpresa("L",10),childrenD);
	    
	    
	    List<GeneralTree<AreaEmpresa>> Hijos = new LinkedList<GeneralTree<AreaEmpresa>>();
	    Hijos.add(ArbolI);
	    Hijos.add(ArbolC);
	    Hijos.add(ArbolD);
	    GeneralTree<AreaEmpresa> a = new GeneralTree<AreaEmpresa>(new AreaEmpresa("M",14), Hijos);
	    
	    AnalizadorArbol aa=new AnalizadorArbol();
	    
	    System.out.println("maximo retardo: "+aa.devolverMaximoPromedio(a));

	}

}
