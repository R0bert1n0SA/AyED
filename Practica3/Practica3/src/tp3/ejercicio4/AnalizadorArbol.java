package tp3.ejercicio4;
import java.util.List;

import tp3.ejercicio1.*;

public class AnalizadorArbol {
	
	public double devolverMaximoPromedio (GeneralTree<AreaEmpresa>arbol) {
		Queue<GeneralTree<AreaEmpresa>> cola =new Queue<>();
		GeneralTree<AreaEmpresa> dato;
		double max=0;
		double sum=0;
		int cant=0;
		cola.enqueue(arbol);
		cola.enqueue(null);
		while(!cola.isEmpty()) {
			dato=cola.dequeue();
			if(dato != null ) {
				sum+=dato.getData().getTardanza();
				cant+=1;
				List<GeneralTree<AreaEmpresa>> hijos =dato.getChildren();
				for(GeneralTree<AreaEmpresa> dat :hijos) {
					cola.enqueue(dat);
				}
				cola.enqueue(null);
			}else {
				sum=sum/cant;
				if(sum > max) {
					max=sum;
				}
				sum=0;
				cant=0;
			}
		}
		return max;
	}
}
