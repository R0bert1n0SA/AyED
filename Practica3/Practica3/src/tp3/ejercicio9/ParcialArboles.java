package tp3.ejercicio9;
import java.util.LinkedList;
import java.util.List;

import tp3.ejercicio3.*;
public class ParcialArboles {

	public static boolean esDeSeleccion (GeneralTree<Integer> arbol) {
		Boolean si=false;
		return Recorrer(arbol,si);
	}
	
	
	public  List<Integer> resolver(GeneralTree<Integer> arbol){
		List<Integer> camino =new LinkedList<>();
	    Recorrer10(arbol,camino,0);
	    for(int h: camino) {
	    	if(h == 0) {
	    		camino.remove(h);
	    	}
	    }
	    return camino;
	}
	
	
	//public static boolean resolver(GeneralTree<Integer> arbol) 
	
	
	
	
	
	
	
	
	
	private int Recorrer10(GeneralTree<Integer> a,List<Integer>cam,int tam){
		int suma=a.getData() * tam; 
		int max=0;
		cam.add(a.getData());	
		if(a.hasChildren()) {
			List<GeneralTree<Integer>> hijos =a.getChildren();
			for(GeneralTree<Integer> h:hijos) {
				suma+=Recorrer10(a,cam,(tam + 1));
				if(suma > max) {
					max=suma;
					suma=a.getData()*tam;
					cam.clear();
					cam.add(a.getData());
				}
			}
		}
		return suma;
	}
	
	
	private boolean Recorrer(GeneralTree<Integer> a,boolean si) {
		if(a.hasChildren()) {
			List<GeneralTree<Integer>> hijos=a.getChildren();
			for(GeneralTree<Integer>  h :hijos) {
				if(h.getData()== a.getData()) {
					si=true;
					return Recorrer(h,si);
				}
				if(h.getData() < a.getData()) {
					si=false;
					return false;
				}
			}
		}
		return si;
	}
}
