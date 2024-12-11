package tp3.ejercicio2;
import tp3.ejercicio1.*; 
import java.util.*;
public class Test {

	public static void main(String[] args) {
		GeneralTree<Integer> a1 = new GeneralTree<Integer>(19);
		List<GeneralTree<Integer>> children2 = new LinkedList<GeneralTree<Integer>>();
		children2.add(new GeneralTree<Integer>(21));
		children2.add(new GeneralTree<Integer>(29));
		children2.add(new GeneralTree<Integer>(23));
		GeneralTree<Integer> a2 = new GeneralTree<Integer>(3, children2);
		List<GeneralTree<Integer>> childen = new LinkedList<GeneralTree<Integer>>();
		childen.add(a1);
		childen.add(a2);
		GeneralTree<Integer> a = new GeneralTree<Integer>(7, childen);
		RecorridosAG t = new RecorridosAG();
		List<Integer> l = t.numerosImparesMayoresQuePorNiveles(a, 70);

		for (Integer dato:l) {
			System.out.println(dato);
		}
		System.out.println(a.ancho());
	}

}
