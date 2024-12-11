package tp2.ejercicio2;


public class Test {

	public static void main(String[] args) {
		BinaryTree<Integer> a = new BinaryTree<>(1);
		BinaryTree<Integer> a2 = new BinaryTree<>();
		a.addLeftChild(new BinaryTree<>(2));
		a.addRightChild(new BinaryTree<>(3));
	    a.getLeftChild().addLeftChild(new BinaryTree<>(4));
	    a.getLeftChild().addRightChild(new BinaryTree<>(5));
	    a.getRightChild().addLeftChild(new BinaryTree<>(6));
        
	    int cantidadHojas = a.contarHojas();
	    System.out.println("Cantidad de hojas en el árbol: " + cantidadHojas);
	    
	    a2=a.espejo();
	    a2.entreNiveles(0, 3);
		

	}

}
