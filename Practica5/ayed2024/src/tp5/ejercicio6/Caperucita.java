package tp5.ejercicio6;
import tp5.ejercicio1.*;
import tp5.ejercicio1.adjList.*;
import tp5.ejercicio1.adjMatrix.*;
import java.util.*;
public class Caperucita {
	
	private Graph<String> grafo;
	
	public Caperucita(Graph<String> g) {
		this.grafo=g;
	}

	public List<List<String>> recorridosMasSeguro(){
		boolean[] marca=new boolean[this.grafo.getSize()];
		List <String> camino =new ArrayList<>();
		List<List<String>> caminos =new ArrayList<>();
		List<Vertex<String>> vertices =this.grafo.getVertices();
		boolean ok= false;
		Vertex<String> vinicial=null;
		for (Vertex<String> dato: vertices){
			vinicial=dato;
			if(dato.getData().equals("casa de caperucita")) {
				ok=true;
				break;
			}
		}
		if(ok) {
			Dfs(vinicial.getPosition(),camino,caminos,marca);
		}
		return caminos;
	}
	
	private void Dfs (int i,List <String> camino,List<List<String>> caminos,boolean[] marca ) {
		marca[i]=true;
		Vertex<String> vertice=this.grafo.getVertices().get(i);
		camino.add(vertice.getData());
		if(vertice.getData().equals("Casa abuelita")) {
			caminos.add(camino);
		}else{
             List<Edge<String>> aristas=this.grafo.getEdges(vertice);
             for(Edge<String> dato:aristas) {
            	 Edge<String>arista=dato;
            	 int j=arista.getTarget().getPosition();
            	 if(!marca[j] && arista.getWeight()<5) {
            		 Dfs(j,camino,caminos,marca);
            		 marca[j]=false;
            		 camino.remove(camino.size());
            	 }
             }
		}
	}
}
