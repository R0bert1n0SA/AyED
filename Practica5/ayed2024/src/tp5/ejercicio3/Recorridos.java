package tp5.ejercicio3;

import java.util.*;

import tp5.ejercicio1.Graph;
public class Recorridos {

	public List<T> dfs (Graph<T> grafo) {
		 boolean[] marca = new boolean[grafo.getSize()];
		 List <T> vertices= new ArrayList<>();
		 for (int i = 0; i < grafo.getSize(); i++) {
			 vertices.add(grafo.getVertex(i).getData);
			 if (!marca[i]) {
				 System.out.println("largo con: "+grafo.getVertex(i).getData());
				 dfs2(i, grafo, marca,vertices);
			 }
		}
		return vertices;
	}
	
	 private void dfs2(int i, Graph<T> grafo, boolean[] marca,List <T> vertices) {
		 marca[i] = true;
		 Vertex<T> v = grafo.getVertex(i);
		 System.out.println(v);
		 List<Edge<T>> adyacentes = grafo.getEdges(v);
		 for (Edge<T> e: adyacentes){
			 vertices.add(e.getTarget().getData());
			 int j = e.getTarget().getPosition();
			 if (!marca[j]) {
				 dfs(j, grafo, marca);
			 }
		 }
	} 

}
