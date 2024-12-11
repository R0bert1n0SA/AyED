package tp2;

//TODO: Hacer que se recorra una sola vez el arbol
public class Transformacion {
	private final BinaryTree<Integer> arbol;
	
	public Transformacion(BinaryTree<Integer> arbol) {
		this.arbol = arbol;
	}
	
	public BinaryTree<Integer> suma() {
		return suma(arbol);
	}
	
	private BinaryTree<Integer> suma(BinaryTree<Integer> arbol) {
		if (arbol.isLeaf())
			arbol.setData(0);
		else
			arbol.setData(sumarArbol(arbol));
		
		if (arbol.hasLeftChild())
			suma(arbol.getLeftChild());
		
		if (arbol.hasRightChild())
			suma(arbol.getRightChild());
		
		return arbol;
	}
	
	/**
	 * Suma el total de los subarboles izquierdo y derecho mas la raiz
	 * @param arbol El arbol a sumar
	 * @return La suma de los subarboles
	 */
	private int sumarArbol(BinaryTree<Integer> arbol) {
		if (arbol.isLeaf())
			return arbol.getData();
		
		int ret = 0;
		if (arbol.hasLeftChild())
			ret += sumarArbol(arbol.getLeftChild());
		
		if (arbol.hasRightChild())
			ret += sumarArbol(arbol.getRightChild());
		
		return ret + arbol.getData();
	}
}
