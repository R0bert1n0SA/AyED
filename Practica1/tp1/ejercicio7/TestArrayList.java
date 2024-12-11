package tp1.ejercicio7;

import java.util.*;
import practica1.Estudiante;

public class TestArrayList {

	public TestArrayList() {
		// TODO Auto-generated constructor stub
	}
	
	
	public static boolean esCapicua(ArrayList<Integer> lista) {
		  int inicio = 0;
		  int fin = lista.size() - 1;

		  // Recorrer la lista desde ambos extremos
		  while (inicio <= fin) {
		    // Si los elementos en ambos extremos no son iguales, la lista no es capicúa
		    if (!lista.get(inicio).equals(lista.get(fin))) {
		      return false;
		    }

		    // Incrementar el índice de inicio y decrementar el índice de fin
		    inicio++;
		    fin--;
		  }

		  // Si se recorrió toda la lista sin encontrar diferencias, es capicúa
		  return true;
		}

	
	
	
	public static void Agregar(ArrayList<Estudiante> v) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese Apellido: ");
        String ape = scanner.next();
        System.out.println("Ingrese nombre: ");
        String nom = scanner.next();
        System.out.println("Ingrese comision: ");
        int comi = scanner.nextInt();
        System.out.println("Ingrese email: ");
        String mail = scanner.next();
		System.out.println("Ingrese direccion: ");
        String dir = scanner.next();
		Estudiante e=new Estudiante(ape,nom,dir,mail,comi);
		boolean esta = v.contains(e);
		if (!esta) {
			v.add(e);
		}
		else {
			System.out.print("ya existe:");
		}
	}
	
	public static void estudiant() {
        Scanner scanner = new Scanner(System.in);
		ArrayList<Estudiante> estudiantes=new ArrayList<>();
		ArrayList<Estudiante> estudiantescopi=new ArrayList<>();
		for (int i =0 ;i < 3;i++) {
	        System.out.println("Ingrese Apellido: ");
	        String ape = scanner.next();
	        System.out.println("Ingrese nombre: ");
	        String nom = scanner.next();
	        System.out.println("Ingrese comision: ");
	        int comi = scanner.nextInt();
	        System.out.println("Ingrese email: ");
	        String mail = scanner.next();
			System.out.println("Ingrese direccion: ");
	        String dir = scanner.next();
			Estudiante e=new Estudiante(ape,nom,dir,mail,comi);
			estudiantes.add(e);
		}
		
		estudiantescopi=(ArrayList<Estudiante>)estudiantes.clone();
		
		for (Estudiante elemnt :estudiantes) {
			System.out.println("Original: "+elemnt.Tus_datos());
		}
		
		for (Estudiante elemnte :estudiantescopi) {
			System.out.println("copi: "+elemnte.Tus_datos());
		}
		
		Agregar(estudiantes);
		

	}
	
	
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de números: ");
        int cantidadNumeros = scanner.nextInt();

        // Crea una lista ArrayList
        ArrayList<Integer> listaNumeros = new ArrayList<>();

        System.out.println("Ingrese los números: ");

        // Agrega números a la lista
        for (int i = 0; i < cantidadNumeros; i++) {
            int numero = scanner.nextInt();
            listaNumeros.add(numero);
        }

        // Imprime el contenido de la lista
        System.out.println("\nContenido de la lista:");
        for (Integer numero : listaNumeros) {
            System.out.print(numero + " ");
        }

        estudiant();
        esCapicua(listaNumeros);
    }
}
