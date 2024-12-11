package tp3.ejercicio7;

import java.util.LinkedList;
import java.util.List;

import tp3.ejercicio3.GeneralTree;

public class Caminos {
	private GeneralTree<Integer> a;
	
	public Caminos(GeneralTree<Integer> a) {
		this.a=a;
	}
	
	public List<Integer> caminoAHojaMasLejana (){
		List<Integer> camino=new LinkedList<>();
		List<Integer> maximo=new LinkedList<>();
		Recorrer(this.a,camino,maximo);

		return maximo;
	}
	
	
	private void Recorrer(GeneralTree<Integer> a,List<Integer> cam,List<Integer> maximus) {
		cam.add(a.getData());
		if(a.hasChildren()) {
			List<GeneralTree<Integer>> hijos=a.getChildren();
			for( GeneralTree<Integer> dat:hijos) {
				Recorrer(dat,cam,maximus);	
			}
		}
		if(a.isLeaf()) {
			if(cam.size() > maximus.size()) {
				maximus.clear();
				maximus.addAll(cam);
			}							
	   }
	   cam.remove(cam.size()-1);
	}
}
